import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GenMutanteComponent } from './components/gen-mutante/gen-mutante.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { GenMutanteService } from './services/gen-mutante.service';
import { HttpClientModule } from '@angular/common/http';
import { ListaComponent } from './components/lista/lista.component';
@NgModule({
  declarations: [
    AppComponent,
    GenMutanteComponent,
    NavbarComponent,
    ListaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [GenMutanteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
