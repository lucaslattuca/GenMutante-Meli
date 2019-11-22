import { Injectable } from '@angular/core';
import { GenMutante } from '../models/genMutante';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class GenMutanteService {

  miUrl= "http://localhost:4040/mutant/";

  constructor(private http: HttpClient) { }

  getAll():Observable<GenMutante[]>{
     return this.http.get<GenMutante[]>(this.miUrl+"/lista");
  }
  getOne(id:number): Observable<GenMutante>{
    return this.http.get<GenMutante>(this.miUrl+"detalle/"+id);
  }
  delete(id:number): Observable<any>
  {
    return this.http.delete(this.miUrl+"borrar/"+id);
  }
  post(gen:GenMutante): Observable<GenMutante>{
    return this.http.post<GenMutante>(this.miUrl, gen);
  }
  put(id:number, GenMutante: GenMutante): Observable<GenMutante>{
    return this.http.put<GenMutante>(this.miUrl+id, GenMutante);
  }



}
