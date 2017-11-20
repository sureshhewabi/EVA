import 'rxjs/Rx';
import {Injectable} from '@angular/core';
import {AppSettings} from '../app.config';
import {HttpClient} from './client.service';

@Injectable()
export class ProjectService {

  constructor(private httpClient: HttpClient) {
  }

  getProjectList() {
    return this.httpClient.get(AppSettings.API_ENDPOINT + '/studies', null).map(res => res.json());
  }
}
