import { Component, OnInit, Input } from '@angular/core';
import { GenMutante } from 'src/app/models/genMutante';
import { GenMutanteService } from 'src/app/services/gen-mutante.service';
@Component({
  selector: 'app-gen-mutante',
  templateUrl: './gen-mutante.component.html',
  styleUrls: ['./gen-mutante.component.css']
})
export class GenMutanteComponent implements OnInit {

  genMutante = {} as GenMutante;
  private campos: any = []; 
  private fila: any = {}; 

  constructor(private genService: GenMutanteService) { }

  ngOnInit() {
  }

  agregarFila() { 
    this.campos.push(this.fila) 
    this.fila = {}; 
  } 

  eliminarFila(index) { 
    this.campos.splice(index, 1); 
  } 

  enviarMuestra(){
    this.genMutante.adn = [];
    this.genMutante.dimension = this.campos.length;
    var arreAux = [];
    for(let a of this.campos){
      arreAux.push(a.code);      
    }	
	  this.genMutante.adn = arreAux;
    this.genService.post(this.genMutante).subscribe(data=>{
      this.genMutante=data;
    })
  }



}
