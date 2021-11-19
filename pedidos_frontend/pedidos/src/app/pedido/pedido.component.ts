import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Component({
  selector: 'app-pedido',
  templateUrl: './pedido.component.html',
  styleUrls: ['./pedido.component.css']
})
export class PedidoComponent implements OnInit {

  pedidos:any=[];

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.obtienePedidos();
  }

  obtienePedidos(){
      this.obtienePedidosService().subscribe(
        (response:any) => this.pedidos = response
      )
  }

  obtienePedidosService():Observable<any>{
    return this.http.get<any>("http://localhost:3030/pedido/get").pipe(
      catchError(e=>"error")
    );
  }

  agregar(){
    location.href = "/crear";
  }

}
