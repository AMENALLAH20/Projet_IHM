import { Component, Input } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-restau-cards',
  templateUrl: './restau-cards.component.html',
  styleUrls: ['./restau-cards.component.css']
})
export class RestauCardsComponent {
  @Input() image!: string;
  @Input() title!: string;
  @Input() rate!: string;
  @Input() location!: string;

  constructor(private router: Router) {}

  navigateToReservation() {
    this.router.navigate(['/reservation']); // Redirect to reservation page
  }

}
