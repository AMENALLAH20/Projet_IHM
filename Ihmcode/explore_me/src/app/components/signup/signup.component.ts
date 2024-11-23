import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  signUpForm !: FormGroup;


  constructor(private fb: FormBuilder, private http: HttpClient, private router: Router
  ) {}


  ngOnInit(): void {
    this.signUpForm = this.fb.group({
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      password: ['', [Validators.required, Validators.minLength(6)]],
      age: ['', [Validators.required, Validators.min(18)]]
    });
  }

  onSubmit() {
    if (this.signUpForm.invalid) {
      return;
    }

    // Données du formulaire
    const user = {
      username: this.signUpForm.value.name,
      email: this.signUpForm.value.email,
      password: this.signUpForm.value.password,
      age: this.signUpForm.value.age
    };

    this.http.post('http://localhost:8092/signup', user).subscribe(
      (response) => {
        console.log('User registered successfully:', response);
        this.router.navigate(['/login']);
      },
      (error) => {
        console.error('Error registering user:', error);
      }
    );
  }

}
