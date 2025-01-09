import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

interface Order {
  id: string;
  item: string;
  artist: string;
  status: string;
  total: number;
  date: string;
}

@Component({
  selector: 'app-myorders',
  imports: [CommonModule,RouterModule],
  templateUrl: './myorders.component.html',
  styleUrl: './myorders.component.css'
})
export class MyordersComponent {

  orders: Order[] = [
    { id: '#001', item: 'Abstract Painting', artist: 'Jane Doe', status: 'Shipped', total: 150.00, date: '2023-10-01' },
    { id: '#002', item: 'Digital Art Print', artist: 'John Smith', status: 'Processing', total: 50.00, date: '2023-10-05' },
    { id: '#003', item: 'Handmade Sculpture', artist: 'Emily Johnson', status: 'Delivered', total: 300.00, date: '2023-09-28' },
  ];

}
