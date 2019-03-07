# ibm-mq-service

Projeto criado com objetivo de entender melhor o funcionamento das Filas MQ da IBM.

Funcionalidades:
Leitura e escrita de dados na Fila.

Comando para subir docker no Mac OS
docker run -d --env LICENSE=accept --env MQ_QMGR_NAME=QM1 -p 1414:1414 -p 9443:9443 ibmcom/mq