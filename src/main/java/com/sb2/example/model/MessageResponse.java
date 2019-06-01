package com.sb2.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponse {

  private String id;

  private String status;

}
