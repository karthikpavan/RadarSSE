package com.rbat.RadarSSE.RadarSSE.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "RadartrackSSE")
public class Radartrack {

  @Id
  private long id;
  private double latitude;
  private double longitude;
  private double speed;
  private int heading;
  private String area_types;

}
