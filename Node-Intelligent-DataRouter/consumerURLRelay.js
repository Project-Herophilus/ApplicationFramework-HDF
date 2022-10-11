const kafka = require('./kafka')
const dotenv = require('dotenv')
const routes = require('./routes-config');
const axios = require('axios')
const notify = require('./notifier')
//const url = process.env.IDAAS_FHIR_URL;
//dotenv.config({path: ".env"})
const consumerURLRelay = kafka.consumer({
  groupId: process.env.kafkaDefaultGroup
})

const main = async () => {
  await consumerURLRelay.connect()

  await consumerURLRelay.subscribe({
    topic: process.env.KafkaBaseTopic,
    fromBeginning: true
  })

  await consumerURLRelay.run({
      // Create Route from Base Message to Defined Topics 1 or more
      eachMessage: async ({ topic, partition, message }) => {
      const entryResources = JSON.parse(message.value.toString())
      console.log(routes)
      entryResources.entry.forEach(resource=>{
        const route = routes[resource.resource.resourceType]
        console.log("resourceType" + resource.resource.resourceType)
            if(route)
            {
                axios.post(`${url}${route}`, resource.resource).then(resp=>{
                sendMessage("Hello Alan, this is your conscious speaking",
                "+16153369743", "12059648351")
                console.log(resp)
                })
            }
            else
            {
                console.log("route path not found")
            }
        })
    }
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