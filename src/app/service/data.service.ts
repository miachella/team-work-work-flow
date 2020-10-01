import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Personne } from '../models/personne';
import { Groupe } from '../models/groupe';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  groupeCourant: Groupe

  constructor(private http: HttpClient) { }

  /* return tout les groupes */
  AllPersons(): Observable<Personne[]> {
    return this.http.get<Personne[]>('https://teamwork-workflow.herokuapp.com/personne')
  }

  addToGroupe(personneClick: Personne) {
    this.groupeCourant.membres.push(personneClick)
  }
}


