import { Component, OnInit } from '@angular/core';
import { Personne } from '../models/personne';
import { DataService } from '../service/data.service';

@Component({
  selector: 'app-team',
  templateUrl: './team.component.html',
  styleUrls: ['./team.component.css']
})
export class TeamComponent implements OnInit {

  Equipe: Personne[]

  constructor(private service: DataService) { }

  ngOnInit(): void {
    this.findEquipe()
  }

  findEquipe() {
    this.service.TeamPersons().subscribe(persTab => this.Equipe = persTab)
  }

}
