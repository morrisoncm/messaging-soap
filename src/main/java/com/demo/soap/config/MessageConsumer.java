package com.demo.soap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

  @Autowired
  private JmsTemplate jmsTemplate;

  public String consumeMessage() {
    Object notification = jmsTemplate.receiveAndConvert("DEV.QUEUE.1");
    if (null != notification) {
      return notification.toString();
    } else {
      return null;
    }
  }

}
