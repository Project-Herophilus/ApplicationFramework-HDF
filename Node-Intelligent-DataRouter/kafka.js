const { Kafka } = require('kafkajs')
const dotenv = require('dotenv');
//dotenv.config({path: ".env"})

const { kafkaUserName: username, kafkaPassword: password } = process.env
const sasl = username && password ? { username, password, mechanism: 'plain' } : null
const ssl = !!sasl

// This creates a client instance that is configured to connect to the Kafka broker provided by
// the environment variable KAFKA_BOOTSTRAP_SERVER
const kafka = new Kafka({
  clientId: 'component-router',
  brokers: [process.env.kafkaBootStrapServer],
  ssl,
  sasl
})

module.exports = kafka