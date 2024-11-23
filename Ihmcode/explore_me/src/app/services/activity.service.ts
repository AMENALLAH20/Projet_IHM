import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  // Pour envoyer des requêtes HTTP
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ActivityService {
  private apiUrl = 'http://localhost:8092/activity/sport'
  private apiUrl1 = 'http://localhost:8092/activity/restaurant'
  private apiUrl2 = 'http://localhost:8092/activity/all'


  constructor(private http: HttpClient) {}

    getAllActivities(): Observable<any[]> {
      return this.http.get<any[]>(this.apiUrl2);
    }
    addActivity(activity: any): Observable<any> {
      return this.http.post<any>(`${this.apiUrl}/add`, activity);
    }
    getRestaurantActivities(): Observable<any[]> {
      return this.http.get<any[]>(`${this.apiUrl1}`);
    }
  
    // Méthode pour récupérer les activités de sport
    getSportActivities(): Observable<any[]> {
      return this.http.get<any[]>(`${this.apiUrl}`);
    }
   
}
