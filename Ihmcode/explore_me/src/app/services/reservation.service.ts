import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {


  private apiUrl = 'http://localhost:8092/reservation';
  constructor(private http: HttpClient) { }
  addReservation(reservation: any): Observable<any>{
    return this.http.post<any>(`${this.apiUrl}/add`,reservation)
  }

}
