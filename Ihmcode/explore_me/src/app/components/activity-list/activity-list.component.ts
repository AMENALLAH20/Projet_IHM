// src/app/components/activity-list/activity-list.component.ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-activity-list',
  templateUrl: './activity-list.component.html',
  styleUrls: ['./activity-list.component.css']
})
export class ActivityListComponent {
  activities = [
    {
      image: '../assets/images/sport1.jpg',
      title: 'Le Terrain Des Légendes',
      rate: '★★★★★',
      location: 'Tunis'
    },
    {
      image: '../assets/images/sportnata.jpg',
      title: 'AquaFit',
      rate: '★★★★☆',
      location: 'Bizerte'
    },
    {
      image: '../assets/images/sport3.jpg',
      title: 'Running Spirit',
      rate: '★★★★★',
      location: 'Manzah'
    },
    {
      image: '../assets/images/yoga.jpg',
      title: 'Espace Sérénité',
      rate: '★★★★★',
      location: 'Tunis'
    },
    {
      image: '../assets/images/gym.jpg',
      title: 'Vitality Gym',
      rate: '★★★★☆',
      location: 'Bizerte'
    },
    {
      image: '../assets/images/gymbox.jpg',
      title: 'PowerBox',
      rate: '★★★★★',
      location: 'Manzah'
    },  ];
}
