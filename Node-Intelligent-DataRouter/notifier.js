const twilio = require('twilio');
const accountSid = process.env.twilioAccount; // Your Account SID from www.twilio.com/console
const authToken = process.env.twilioToken; // Your Auth Token from www.twilio.com/console
const client = new twilio(accountSid, authToken);
const args = process.argv.slice(2);
//const appName="DataSynthesis";
smsmessageDtl = args[0];
smsTextNumber = args[1];

function sendSMSMessage(msg, to) {
    client.messages
        .create({
            body: msg,
            to: to, // Text this number
            from: process.env.twilioPhoneNumber
        })
        .then((message) => console.log(message.sid)).done();

}
sendSMSMessage("test","16153369743")
//sendSMSMessage(smsmessageDtl,smsTextNumber)
module.exports = sendSMSMessage