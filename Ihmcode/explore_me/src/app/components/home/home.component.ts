import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  constructor(private router: Router) {}

  navigateTorestau() {
    this.router.navigate(['/restaurant']); // Redirect to reservation page
  }

  navigateTosport() {
    this.router.navigate(['/main-page']); // Redirect to reservation page
  }

  
  redirectToLogin() {
    this.router.navigate(['/login']); // Redirect to reservation page
  }

  redirectToSignup() {
    this.router.navigate(['/signup']); // Redirect to reservation page
  }


}
