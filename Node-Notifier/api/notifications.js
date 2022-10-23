const express = require("express");
const router = express.Router();
const fs = require("fs");
const twilio = require('twilio');
const accountSid = process.env.twilioSID; // Your Account SID from www.twilio.com/console
const authToken = process.env.twilioToken; // Your Auth Token from www.twilio.com/console
const client = new twilio(accountSid, authToken);


router.get("/notification-email", async (req, res) => {

});

router.get("/notification-sms", async (req, res) => {

    let ts = Date.now();
    let date_ob = new Date(ts);
    let date = date_ob.getDate();
    let month = date_ob.getMonth() + 1;
    let year = date_ob.getFullYear();
    let hour = date_ob.getHours();
    let minutes = date_ob.getMinutes();

    const to = req.query.recipients.split(',')
    const event = req.query.event_type
    const event_details = req.query.event_details
    const event_type_msg_template = {
        "Clinical-ERAdmission":`A Patient Identified in your recent care was seen in the ER. Please follow the link for more details ${event_details}`,
        "Clinical-PtTransfer": `A Patient Identified in your recent care was Transfered. Please follow the link for more details ${event_details}`,
        "Clinical-PtTransfer-ICU": `A Patient Identified in your recent care was Transfered to the ICU-CCU. Please follow the link for more details ${event_details}`,
        "Clinical-MedicalTest": `A Patient Identified in your recent care has a new medical test. Please follow the link for more details ${event_details}`,
        "Operations-SystemOutage": `A system issue was reported. Please follow the link for more details ${event_details}`
    }
    
    to.forEach(async number=>{
        const message = await client.messages
        .create({
            body: event_type_msg_template[event],
            to: number, // Text this number
            from: process.env.twilioPhoneNumber
        })
        .then(message=> {
            auditMessage ="Event: "+ event +"sent on: " +year + "-" + month + "-" + date+ " at: " +hour +":"+minutes + " "
                +message.sid;

            return auditMessage;
            //return message.sid
        }
        )
        .catch(err=>{
            return err
        })
    res.send(JSON.stringify(message))
    })


});

module.exports = router;