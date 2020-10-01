import { Component, OnInit } from '@angular/core';
import { Personne } from '../models/personne';
import { DataService } from '../service/data.service';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent implements OnInit {

  AllPersonne: Personne[]

  constructor(private service: DataService) { }

  ngOnInit(): void {
    this.findAll()
  }

  findAll() {
    this.service.AllPersons().subscribe(persTab => this.AllPersonne = persTab)
  }

  addToGroupe(personneClick: Personne) {
    this.service.addToGroupe(personneClick)
  }

}
