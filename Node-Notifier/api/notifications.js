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

    const to = req.query.recipients.split(',')
    const event = req.query.event_type
    const event_details = req.query.event_details
    const event_type_msg_template = {
        "Clinical-ERAdmission":`A Patient Identified as in your recent care was seen in the ER. Please follow the link for more details ${event_details}`,
        "Clinical-PtTransfer": "",
        "Clinical-ICU": "",
        "Clinical-MedicalTest": "", 
        "Operations-SystemOutage": ""
    }
    
    to.forEach(async number=>{
        const message = await client.messages
        .create({
            body: event_type_msg_template[event],
            to: number, // Text this number
            from: process.env.twilioPhoneNumber
        })
        .then(message=> {
            console.log(message.sid)
            return message.sid
        }
        )
        .catch(err=>{
            return err
        })
    res.send(JSON.stringify(message))
    })


});

module.exports = router;