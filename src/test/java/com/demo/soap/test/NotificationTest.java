package com.demo.soap.test;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.demo.soap.controller.NotificationController;

@SpringBootTest
class NotificationTest {

  @Autowired
  private NotificationController notificationController;

  @Test
  void contextLoads() throws Exception {
    assertThat(notificationController).isNotNull();
  }

}
