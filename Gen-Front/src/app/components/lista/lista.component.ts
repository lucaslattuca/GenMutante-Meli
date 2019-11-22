import { Component, OnInit } from '@angular/core';
import { GenMutanteService } from 'src/app/services/gen-mutante.service';
import { GenMutanteComponent } from '../gen-mutante/gen-mutante.component';
import { GenMutante } from 'src/app/models/genMutante';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  genMutante = [] as GenMutante[];

  constructor(private genService: GenMutanteService) { }

  ngOnInit() {
    this.getAll();
  }

  getAll(){
    this.genService.getAll().subscribe(data => {
     this.genMutante = data;
    });
  }

}
