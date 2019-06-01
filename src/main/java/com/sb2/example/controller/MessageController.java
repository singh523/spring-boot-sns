package com.sb2.example.controller;

import com.sb2.example.model.MessageRequest;
import com.sb2.example.model.MessageResponse;
import com.sb2.example.service.MessageService;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

  @Autowired
  private MessageService messageService;


  @PostMapping(value = "/sms", consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)

  public ResponseEntity sendMessage(@RequestBody @NotNull MessageRequest messageRequest) {
    log.info("sendMessage controller invoked");

    MessageResponse messageResponse = messageService.sendMessage(messageRequest);

    return new ResponseEntity(messageResponse, HttpStatus.ACCEPTED);
  }


}
