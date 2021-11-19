import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { PedidoComponent } from './pedido/pedido.component';
import { DetalleComponent } from './detalle/detalle.component';

const routes: Routes = [
  {
    path:"", component:PedidoComponent
  },
  {
    path:"crear", component:DetalleComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
