package com.demo.soap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import com.demo.soap.config.MessageConsumer;
import com.demo.soap.config.MessageProducer;
import com.demo.soap.domain.request.NotificationDetails;
import com.demo.soap.domain.response.NotificationResponse;
import com.demo.soap.service.NotificationService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private MessageProducer messageProducer;
    @Autowired
    private MessageConsumer messageConsumer;

    @Override
    public NotificationResponse sendNotification(NotificationDetails notificationDetails) {
        try {
            log.debug("sendNotification() -> notificationDetails {}", notificationDetails);
            return new NotificationResponse(
                    messageProducer.sendMessage(notificationDetails.getMessage()));
        } catch (final Exception cause) {
            log.error("sendNotification() -> exception for notificationDetails {]", notificationDetails,
                    cause);
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY,
                    "sendNotification exception", cause);
        }
    }

    @Override
    public NotificationResponse receiveNotification() {
        try {
            final var msgReceived = messageConsumer.consumeMessage();
            log.debug("receiveNotification() -> msg {}", msgReceived);
            return new NotificationResponse(msgReceived);
        } catch (final Exception cause) {
            log.error("receiveNotification() -> exception", cause);
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY,
                    "receiveNotification exception", cause);
        }
    }

}
