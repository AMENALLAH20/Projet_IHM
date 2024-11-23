import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ReservationComponent } from './components/reservation/reservation.component'; // Import the Reservation Component
import { MainPageComponent } from './components/main-page/main-page.component';
import { RestaurantComponent } from './components/restaurant/restaurant.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { ProfilComponent } from './components/profil/profil.component';
import { ActivityListComponent } from './components/activity-list/activity-list.component';

const routes: Routes = [  { path: 'reservation', component: ReservationComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' }, // Redirection vers MainPageComponent
  { path: 'main-page', component: MainPageComponent },   // Reservation route
  { path: 'restaurant', component: RestaurantComponent }, 
  { path: 'home', component: HomeComponent }, 
  { path: 'login', component: LoginComponent },
  { path: 'signup', component: SignupComponent },
  { path: 'profil', component: ProfilComponent},
  { path: 'activities', component: ActivityListComponent },

  // Reservation route

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
