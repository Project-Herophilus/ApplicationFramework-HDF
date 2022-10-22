const express = require("express");
const router = express.Router();
const fs = require("fs");
const twilio = require('twilio');
const accountSid = process.env.twilioSID; // Your Account SID from www.twilio.com/console
const authToken = process.env.twilioToken; // Your Auth Token from www.twilio.com/console
const client = new twilio(accountSid, authToken);


router.get("/notification-email", async(req, res) => {

});

router.get("/notification-sms", async(req, res) => {
    client.messages
        .create({
            body: msg,
            to: to, // Text this number
            from: process.env.twilioPhoneNumber
        })
        .then((message) => console.log(message.sid)).done();

});

module.exports = router;