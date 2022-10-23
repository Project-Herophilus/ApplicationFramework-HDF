var express = require('express');
const router = express.Router();
// Constants
const notificationcontroller = require("./notifications");
router.use('/api/notify', notificationcontroller)

module.exports = router;
