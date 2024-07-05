package com.demo.soap.service;

import com.demo.soap.domain.request.NotificationDetails;
import com.demo.soap.domain.response.NotificationResponse;


public interface NotificationService {

    NotificationResponse sendNotification(NotificationDetails notificationDetails);

    NotificationResponse receiveNotification();

}
