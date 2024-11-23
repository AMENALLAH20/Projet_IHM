import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SidebarComponent } from './components/sidebar/sidebar.component';
import { ActivityCardComponent } from './components/activity-card/activity-card.component';
import { ActivityListComponent } from './components/activity-list/activity-list.component';
import { MainPageComponent } from './components/main-page/main-page.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { ReservationComponent } from './components/reservation/reservation.component';
import { ReactiveFormsModule } from '@angular/forms';
import { RestaurantComponent } from './components/restaurant/restaurant.component';
import { RestauListComponent } from './components/restau-list/restau-list.component';
import { RestauCardsComponent } from './components/restau-cards/restau-cards.component';
import { HomeComponent } from './components/home/home.component';
import { SignupComponent } from './components/signup/signup.component';
import { LoginComponent } from './components/login/login.component';
import { ProfilComponent } from './components/profil/profil.component';
import { HttpClientModule } from '@angular/common/http';  // Import du module HttpClientModule
import { ActivityService } from './services/activity.service';  // Import de ton service


@NgModule({
  declarations: [
    AppComponent,
    SidebarComponent,
    ActivityCardComponent,
    ActivityListComponent,
    MainPageComponent,
    NavBarComponent,
    ReservationComponent,
    RestaurantComponent,
    RestauListComponent,
    RestauCardsComponent,
    HomeComponent,
    SignupComponent,
    LoginComponent,
    ProfilComponent,
    
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule // Ajouter ReactiveFormsModule ici

  ],
  providers: [ActivityService],
  bootstrap: [AppComponent]
})
export class AppModule { }
