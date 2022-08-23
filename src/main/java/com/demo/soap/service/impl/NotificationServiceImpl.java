package com.demo.soap.service.impl;

import org.springframework.stereotype.Service;
import com.demo.soap.domain.request.NotificationDetails;
import com.demo.soap.domain.response.NotificationResponse;
import com.demo.soap.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

  @Override
  public NotificationResponse sendNotification(NotificationDetails notificationDetails) {
    return null;
  }

  @Override
  public NotificationResponse receiveNotification() {
    return null;
  }

}
