package com.amen.loisir.Services;


import com.amen.loisir.Entities.Activite;
import com.amen.loisir.Entities.ActiviteType;
import com.amen.loisir.Repositories.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    public Activite add(Activite activite)
    {
        return activityRepository.save(activite);
    }

    public List<Activite> getAllActivities()
    {
        return activityRepository.findAll();
    }

    public List<Activite> getRestaurantActivities()
    {
        return activityRepository.findByActiviteType(ActiviteType.restaurant);
    }

    public List<Activite> getSportActivities()
    {
        return activityRepository.findByActiviteType(ActiviteType.sport);
    }
}
