package com.demo.soap.domain.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageJMSConsumer {

  @Autowired
  private JmsTemplate jmsTemplate;

  public String consumeMessage() {
    return jmsTemplate.receiveAndConvert("DEV.QUEUE.1").toString();
  }

}
