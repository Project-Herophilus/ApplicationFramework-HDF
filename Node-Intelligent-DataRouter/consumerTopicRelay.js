const kafka = require('./kafka')
const dotenv = require('dotenv')
const routes = require('./routes-config');
const { Console } = require('console');
const consumerURLRelay = kafka.consumer({
    groupId: process.env.kafkaDefaultGroup
})


const main = async () => {
    await consumerURLRelay.connect()

    await consumerURLRelay.subscribe({
        topic: process.env.KafkaBaseTopic,
        fromBeginning: true
    })
}

main().catch(async error => {
    console.error(error)
    try {
        await consumerURLRelay.disconnect()
    } catch (e) {
        console.error('Failed to gracefully disconnect consumerURLRelay', e)
    }
        process.exit(1)
})
