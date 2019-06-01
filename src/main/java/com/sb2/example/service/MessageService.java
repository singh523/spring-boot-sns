package com.sb2.example.service;

import com.sb2.example.model.MessageRequest;
import com.sb2.example.model.MessageResponse;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {

  MessageResponse sendMessage(MessageRequest messageRequest);


}
