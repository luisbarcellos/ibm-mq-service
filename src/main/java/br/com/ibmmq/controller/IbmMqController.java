package br.com.ibmmq.controller;

import br.com.ibmmq.service.IbmMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ibm-fila/")
public class IbmMqController {
    @Autowired
    private IbmMqService ibmMqService;

    @PostMapping("msg")
    public String enviarMsg(@RequestParam(name = "mensagem", required = true) String mensagem){
        return ibmMqService.enviarMsg(mensagem);
    }

    @GetMapping("msg")
    public String buscarMsg(){
        return ibmMqService.buscarMsg();
    }
}
