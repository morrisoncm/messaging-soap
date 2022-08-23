package com.demo.soap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.soap.domain.request.NotificationDetails;
import com.demo.soap.domain.response.NotificationResponse;
import com.demo.soap.service.NotificationService;

@RestController
@RequestMapping("/demo/notification")
public class NotificationController {

  @Autowired
  private NotificationService notificationService;

  public ResponseEntity<NotificationResponse> sendNotification(
      @RequestBody NotificationDetails notificationDetails) {
    return new ResponseEntity<>(notificationService.sendNotification(notificationDetails),
        HttpStatus.OK);
  }

  public ResponseEntity<NotificationResponse> receiveNotification() {
    return new ResponseEntity<>(notificationService.receiveNotification(), HttpStatus.OK);
  }

}
