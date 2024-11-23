import { Component, OnInit } from '@angular/core';
import { ActivityService } from 'src/app/services/activity.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit{

  sportActivities: any[] = [];

  constructor(private activityService: ActivityService) {}

  ngOnInit(): void {
    this.activityService.getSportActivities().subscribe(
      (data) => {
        this.sportActivities = data;
      },
      (error) => {
        console.error('Error fetching restaurant activities:', error);
      }
    ); 
    
  }

}
