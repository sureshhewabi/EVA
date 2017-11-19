import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import 'materialize-css';
import { MaterializeModule } from 'angular2-materialize';
import { DataTablesModule } from 'angular-datatables';

import { AppComponent } from './app.component';
import { routing} from './app.routing';
import { HttpModule} from '@angular/http';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';

import {HttpClient, ProjectService } from './services/index.service';
import { ProjectComponent } from './components/project/project.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ProjectComponent
  ],
  imports: [
    BrowserModule,
    routing,
    HttpModule,
    MaterializeModule,
    DataTablesModule
  ],
  providers: [
    HttpClient,
    ProjectService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
