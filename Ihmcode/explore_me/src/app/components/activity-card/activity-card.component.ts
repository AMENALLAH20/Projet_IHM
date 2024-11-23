import { Component , Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-activity-card',
  templateUrl: './activity-card.component.html',
  styleUrls: ['./activity-card.component.css']
})
export class ActivityCardComponent {
  @Input() image!: string;
  @Input() title!: string;
  @Input() rate!: string;
  @Input() location!: string;

  constructor(private router: Router) {}

  navigateToReservation() {
    this.router.navigate(['/reservation']); // Redirect to reservation page
  }

}
