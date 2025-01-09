import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-buyerdashboard',
  imports: [CommonModule,RouterModule,FormsModule],
  templateUrl: './buyerdashboard.component.html',
  styleUrl: './buyerdashboard.component.css'
})
export class BuyerdashboardComponent {
  //router: any;

  constructor(private router: Router) { }

  onLogout() {
    // Redirect to the login page
    this.router.navigate(['/home']); // Change '/login' to your actual login route
  }
}
