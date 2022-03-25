package com.rbat.RadarSSE.RadarSSE.service;


import com.rbat.RadarSSE.RadarSSE.model.Radartrack;
import java.util.List;

public interface RadarTrackService {

  Radartrack saveData(Radartrack radartrack);

  public List<Radartrack> getData();

}
