import { Component } from '@angular/core';

@Component({
  selector: 'app-restau-list',
  templateUrl: './restau-list.component.html',
  styleUrls: ['./restau-list.component.css']
})
export class RestauListComponent {
  activities = [
    {
      image: '../assets/images/restau1.jpg',
      title: "L'Art de la Table",
      rate: '★★★★★',
      location: 'Tunis'
    },
    {
      image: '../assets/images/restau2.jpg',
      title: 'Fusion des Saveurs ',
      rate: '★★★★☆',
      location: 'Bizerte'
    },
    {
      image: '../assets/images/restau3.jpg',
      title: 'La Trattoria Italiana',
      rate: '★★★★★',
      location: 'Manzah'
    },
    {
      image: '../assets/images/restau5.jpg',
      title: 'La Feuille Verte',
      rate: '★★★★★',
      location: 'Tunis'
    },
    {
      image: '../assets/images/restau6.jpg',
      title: 'Le Bistrot du Coin',
      rate: '★★★★☆',
      location: 'Bizerte'
    },
    {
      image: '../assets/images/restau.jpg',
      title: "L'Océan Bleu",
      rate: '★★★★★',
      location: 'Manzah'
    },  ];

}
