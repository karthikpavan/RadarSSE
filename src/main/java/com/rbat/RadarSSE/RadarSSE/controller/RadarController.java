package com.rbat.RadarSSE.RadarSSE.controller;

import com.rbat.RadarSSE.RadarSSE.model.Radartrack;
import com.rbat.RadarSSE.RadarSSE.service.RadarTrackService;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.bson.json.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@RestController
@RequestMapping("api/v1")
public class RadarController {

  @Autowired
  RadarTrackService radarTrackService;

  public List<SseEmitter> emitterList = new CopyOnWriteArrayList<>();

// client subscription
  @CrossOrigin
  @RequestMapping(value = "/subscribe", consumes = MediaType.ALL_VALUE)
  public SseEmitter subscribe() throws IOException {

    SseEmitter sseEmitter = new SseEmitter(Long.MAX_VALUE);
    sseEmitter.send(SseEmitter.event().name("INIT"));

    sseEmitter.onCompletion(() -> emitterList.remove(sseEmitter));

    emitterList.add(sseEmitter);
    return sseEmitter;
  }


  @PostMapping("/dispatchEvent")
  public void dispatchEvent(@RequestBody Radartrack radartrack) {

    String eventFomatter = null;

    JSONObject json = new JSONObject();

    json.put("id", radartrack.getId())
        .put("latitude", radartrack.getLatitude())
        .put("longitude", radartrack.getLongitude())
        .put("speed", radartrack.getSpeed())
        .put("heading", radartrack.getHeading())
        .put("type", radartrack.getArea_types());

    if(json != null) {
      eventFomatter = json.toString();
    }
    for (SseEmitter emit: emitterList) {
      try {
        radarTrackService.saveData(radartrack);
        emit.send(SseEmitter.event().name("radarDataDetails").data(eventFomatter));
      } catch (IOException e) {
        emitterList.remove(emit);
      }
    }
  }

  @GetMapping("/")
  public String chectRest() {
    return "REST Works";
  }
}
