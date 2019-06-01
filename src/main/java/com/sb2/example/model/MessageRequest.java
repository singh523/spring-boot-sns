package com.sb2.example.model;


import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MessageRequest {

  @NotBlank
  private String id;

  @NotBlank
  private String channelName;

  private String project;

  @NotBlank
  private String messageBody;


}
