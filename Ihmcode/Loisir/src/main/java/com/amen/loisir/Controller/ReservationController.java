package com.amen.loisir.Controller;


import com.amen.loisir.Entities.Reservation;
import com.amen.loisir.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Locale;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestParam Integer userId,
                                                         @RequestParam Integer activityId,
                                                         @RequestParam LocalDate date,
                                                         @RequestParam Integer nbr
                                                         ) {
        Reservation reservation = reservationService.createReservation(userId, activityId,date,nbr);
        return ResponseEntity.ok(reservation);
    }


    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        Reservation savedReservation = reservationService.saveReservation(reservation);
        return ResponseEntity.ok(savedReservation); // Retourner la réservation enregistrée
    }
}
