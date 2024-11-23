package com.amen.loisir.Services;


import com.amen.loisir.Entities.Activite;
import com.amen.loisir.Entities.Reservation;
import com.amen.loisir.Entities.User;
import com.amen.loisir.Repositories.ActivityRepository;
import com.amen.loisir.Repositories.ReservationRepository;
import com.amen.loisir.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ReservationService {


    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ActivityRepository activityRepository;

    public Reservation createReservation(Integer userId, Integer activityId, LocalDate date,Integer nbr) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Activite activity = activityRepository.findById(activityId)
                .orElseThrow(() -> new RuntimeException("Activity not found"));

        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setActivity(activity);
        reservation.setDate(date);
        reservation.setNbrper(nbr);

        return reservationRepository.save(reservation);
    }


    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }


}
