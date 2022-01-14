package com.epam.service.dto;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Event {

  @Id
  @GeneratedValue
  private Long id;
  private String title;
  private String place;
  private String speaker;
  private String eventType;
  private LocalDateTime dateTime;

}
