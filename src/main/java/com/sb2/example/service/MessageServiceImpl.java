package com.sb2.example.service;

import com.sb2.example.model.MessageRequest;
import com.sb2.example.model.MessageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

  @Override
  public MessageResponse sendMessage(MessageRequest messageRequest) {

    log.info("Sending messages started");
    log.info("Message payload {}", messageRequest.toString());

    return MessageResponse.builder().id(messageRequest.getId()).status("Success").build();

  }
}
