package com.demo.soap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

  @Autowired
  private JmsTemplate jmsTemplate;

  public String sendMessage(String message) {
    jmsTemplate.convertAndSend("DEV.QUEUE.1", message);
    return "message sent";
  }

}
