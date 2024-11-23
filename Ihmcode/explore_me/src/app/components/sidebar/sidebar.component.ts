import { Component } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent {

  constructor(private router: Router) {}

  navigateTorestau() {
    this.router.navigate(['/restaurant']); // Redirect to reservation page
  }

  navigateTosport() {
    this.router.navigate(['/main-page']); // Redirect to reservation page
  }

}
