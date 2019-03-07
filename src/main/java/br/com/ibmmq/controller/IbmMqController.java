package br.com.ibmmq.controller;

import br.com.ibmmq.service.IbmMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.JmsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ibm-fila/")
public class IbmMqController {
    @Autowired
    private IbmMqService ibmMqService;

    @PostMapping("msg")
    public String enviarMsg(@RequestParam(name = "mensagem", required = true) String mensagem){
        try{
            ibmMqService.enviarMsg(mensagem);
            return "OK";
        }catch(JmsException ex){
            ex.printStackTrace();
            return "FAIL";
        }
    }

    @GetMapping("msg")
    public String buscarMsg(){
        return ibmMqService.buscarMsg();
    }
}
