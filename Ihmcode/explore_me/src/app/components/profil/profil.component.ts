import { Component } from '@angular/core';

@Component({
  selector: 'app-profil',
  templateUrl: './profil.component.html',
  styleUrls: ['./profil.component.css']
})
export class ProfilComponent {
  // Informations du profil
  profile = {
    name: 'Amen Allah',
    email: 'amenallah@example.com',
    avatar: '/assets/images/avatar.jpg'
  };

  // Activités réservées
  reservedActivities = [
    { name: 'Visite du Musée Bardo', description: 'Découvrir l’histoire tunisienne.', date: '2024-11-20' },
    { name: 'Dîner au Restaurant XYZ', description: 'Cuisine méditerranéenne.', date: '2024-11-22' }
  ];

  // Sélection de l’humeur
  selectMood(mood: string): void {
    console.log(`Mood sélectionné : ${mood}`);
    // Logique pour filtrer ou rediriger selon l'humeur
  }
}
