import { Component, OnInit } from '@angular/core';
import { ActivityService } from 'src/app/services/activity.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit{

  restaurantActivities: any[] = [];

  constructor(private activityService: ActivityService) {}

  ngOnInit(): void {
    this.activityService.getRestaurantActivities().subscribe(
      (data) => {
        this.restaurantActivities = data;
      },
      (error) => {
        console.error('Error fetching restaurant activities:', error);
      }
    ); 
    
  }

}
