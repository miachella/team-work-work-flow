import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Personne } from '../models/personne';
import { Groupe } from '../models/groupe';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  /* = le groupe affiché */
  groupeCourant: Groupe

  constructor(private http: HttpClient) { }

  /* return tout les groupes */
  AllPersons(): Observable<Personne[]> {
    return this.http.get<Personne[]>('https://teamwork-workflow.herokuapp.com/personne?groupe=0')
  }

  TeamPersons(): Observable<Personne[]> {
    return this.http.get<Personne[]>('https://teamwork-workflow.herokuapp.com/personne?groupe=1')
  }

  /* ajoute le participant au groupe courrant */
  addToGroupe(personneClick: Personne) {
    this.groupeCourant.membres.push(personneClick)
  }

  
}


