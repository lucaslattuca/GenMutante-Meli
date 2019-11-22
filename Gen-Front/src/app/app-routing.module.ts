import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GenMutanteComponent } from './components/gen-mutante/gen-mutante.component';
import { ListaComponent } from './components/lista/lista.component';

const routes: Routes = [
  {path: 'home', component: GenMutanteComponent},
  {path: 'lista', component: ListaComponent},
  //ruta por defecto
  {path: '**', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
