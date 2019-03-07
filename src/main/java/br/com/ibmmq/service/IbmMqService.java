package br.com.ibmmq.service;

import lombok.AllArgsConstructor;
import org.springframework.jms.JmsException;
import org.springframework.jms.core.JmsTemplate;

@AllArgsConstructor
public class IbmMqService {
    private JmsTemplate jmsTemplate;

    public String enviarMsg(String mensagem){
        try{
            jmsTemplate.convertAndSend("DEV.QUEUE.1", mensagem);
            return "OK";
        }catch(JmsException ex){
            ex.printStackTrace();
            return "FAIL";
        }
    }

    public String buscarMsg(){
        try{
            return jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
        }catch(JmsException ex){
            ex.printStackTrace();
            return "FAIL";
        }
    }
}