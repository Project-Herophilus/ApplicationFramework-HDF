# Platform Settings
export httpPort=8888
export runQuantity=7500
# Auditing
export auditing=false
export auditingTopicName=kic_appintgrtntransactions
# Output
# values: kafka kafka-datapersistence file rdbms nosql
export outputAdapter=kafka-datapersistence
# Kafka Settings
export kafkaServer=localhost:9092
export kafkaBaseTopic= undefined
export kafkaDefaultGroup=undefined
export kafkaConsumerTopic= undefined
export kafkaProduceTopic=undefined
export kafkaClientID="1234"
export twilioAccount='AC25abda01e920fb17fa15e65c88b35a97'
export twilioToken='aa155cde0be0559340568f3a540f99ea'
export twilioPhoneNumber='12059648351'