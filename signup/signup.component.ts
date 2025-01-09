import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import {  Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { HttpClient,} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-signup',
  imports: [CommonModule,RouterModule,FormsModule,HttpClientModule],
  templateUrl: './signup.component.html',
  styleUrl: './signup.component.css'
})
export class SignupComponent {

    user = {
      name: '',
      email: '',
      password: ''
    };
  
    private apiUrl = 'http://localhost:8081/api/users'; // Adjust the URL if needed
  
    constructor(private http: HttpClient, private router: Router)  { }
  
    onSubmit() {
      const headers = new HttpHeaders({ 'Content-Type': 'application/json' });
      this.http.post(this.apiUrl, this.user, { headers })
        .subscribe(
          response => {
            console.log('User signed up successfully:', response);
            // Optionally, redirect or show a success message
            this.router.navigate(['/login']);
          },
          error => {
            console.error('Error signing up:', error);
          }
        );
    }
  }



  







    
  
 