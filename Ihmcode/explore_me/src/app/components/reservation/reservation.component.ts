import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivityService } from 'src/app/services/activity.service';
import { ReservationService } from 'src/app/services/reservation.service';
@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent {
  reservationForm: FormGroup;
  reservation = {
    date: '',
    nbrper: 0,
    activites: []
  };

  activities: any[] = [];
  message: string | undefined;
 
  constructor(private fb: FormBuilder, private reservationService: ReservationService,
    private activityService: ActivityService ) {
      this.reservationForm = this.fb.group({
        nbrper: [1, [Validators.required, Validators.min(1)]], // Nombre de personnes
        date: ['', Validators.required],                      // Date de réservation
        email: ['', Validators.required],                    // ID de l'utilisateur (par exemple, via session ou token)
      });
      
  }
  
  ngOnInit(): void {
    this.activityService.getAllActivities().subscribe(
      (data) => {
        this.activities = data; 
      },
      (error) => {
        console.error('Erreur lors de la récupération des activités :', error);
      }
    );
  }


  onSubmit(): void {
    if (this.reservationForm.valid) {
      const formData = this.reservationForm.value;
  
      const reservationPayload = {
        nbrper: formData.nbrper,
        date: formData.date,
        iduser: formData.iduser,          // Peut être récupéré dynamiquement si l'utilisateur est connecté
      };
  
      this.reservationService.addReservation(reservationPayload).subscribe(
        (response) => {
          this.message = 'Réservation réussie !';
        },
        (error) => {
          this.message = 'Erreur lors de la réservation.';
          console.error('Erreur lors de la réservation :', error);
        }
      );
    }
  }
  
  }



