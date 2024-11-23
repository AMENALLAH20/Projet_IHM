import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  
  loginForm !: FormGroup;

  constructor(private fb: FormBuilder, private http: HttpClient, private router: Router) {}

  ngOnInit(): void {
    this.loginForm = this.fb.group({
      username: ['', [Validators.required]],
      password: ['', [Validators.required, Validators.minLength(6)]]
    });
  }

  onSubmit() {
    if (this.loginForm.invalid) {
      return;
    }

    const loginData = {
      username: this.loginForm.value.username,
      password: this.loginForm.value.password
    };

    // Envoyer les données d'authentification au backend
    this.http.post('http://localhost:8092/signin', loginData).subscribe(
      (response: any) => {
        // Sauvegarder le token JWT dans localStorage ou sessionStorage
        localStorage.setItem('token', response.jwt);

        // Rediriger l'utilisateur vers /profil
        this.router.navigate(['/profil']);
      },
      (error) => {
        console.error('Erreur de connexion:', error);
        // Gérer l'erreur de connexion, par exemple afficher un message d'erreur
      }
    );}
}
