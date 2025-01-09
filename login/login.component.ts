import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Router, RouterLink, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [CommonModule,RouterModule,RouterLink,FormsModule,HttpClientModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
    user = {
      email: '',
      password: ''
    };
  
    private apiUrl = 'http://localhost:8081/api/login'; // Adjust the URL if needed
  
    constructor(private http: HttpClient, private router: Router) { }
  
    onSubmit() {
      this.http.post(this.apiUrl, this.user).subscribe(
        response => {
          console.log('Login successful:', response);
          // Optionally, store user data in local storage or a service
          this.router.navigate(['/buyerdashboard']); // Redirect to dashboard or another page
        },
        error => {
          console.error('Login failed:', error);
          alert('Invalid email or password. Please try again.'); // Show error message
        }
      );
    }
  }

