package com.rbat.RadarSSE.RadarSSE.service;


import com.rbat.RadarSSE.RadarSSE.model.Radartrack;
import com.rbat.RadarSSE.RadarSSE.repository.RadartrackRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RadarTrackStudentServiceImpl implements RadarTrackService {

  @Autowired
  RadartrackRepository radartrackRepository;

  @Override
  public Radartrack saveData(Radartrack radartrack) {
    return radartrackRepository.save(radartrack);
  }

  public List<Radartrack> getData() {
    return radartrackRepository.findAll();
  }

}
