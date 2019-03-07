package br.com.ibmmq.config;

import br.com.ibmmq.service.IbmMqService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class ConfigModule {
    @Bean
    public IbmMqService ibmMqService(JmsTemplate jmsTemplate) {
        return new IbmMqService(jmsTemplate);
    }
}