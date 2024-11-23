package com.amen.loisir.Controller;


import com.amen.loisir.Entities.Activite;
import com.amen.loisir.Services.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    ActivityService activityService;
    @PostMapping("/add")
    public ResponseEntity<Activite> add(@RequestBody Activite activite)
    {
          Activite saveactivite = activityService.add(activite);
          return ResponseEntity.ok(saveactivite);
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Activite> getAllActivities() {
        return activityService.getAllActivities();
    }
    @GetMapping("/test")
    public String test() {
        return "API fonctionne correctement !";
    }
    @GetMapping("/restaurant")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Activite>> getRestaurantActivities() {
        List<Activite> restaurantActivities = activityService.getRestaurantActivities();
        return ResponseEntity.ok(restaurantActivities);
    }
    @GetMapping("/sport")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<Activite>> getSportActivities() {
        List<Activite> sportActivities = activityService.getSportActivities();
        return ResponseEntity.ok(sportActivities);
    }




}
