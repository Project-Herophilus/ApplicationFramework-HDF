const twilio = require('twilio');
const accountSid = process.env.twilioAccount; // Your Account SID from www.twilio.com/console
const authToken = process.env.twilioToken; // Your Auth Token from www.twilio.com/console
const client = new twilio(accountSid, authToken);
function sendMessage(msg, to) {
    client.messages
        .create({
            body: msg,
            to: to, // Text this number
            from: process.env.twilioPhoneNumber
        })
        .then((message) => console.log(message.sid)).done();

}
sendMessage("test","16153369743")
module.exports = sendMessage