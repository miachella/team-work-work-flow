import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListePersonnesComponent } from './liste-personnes/liste-personnes.component';

@NgModule({
  declarations: [
    AppComponent,
    ListePersonnesComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
