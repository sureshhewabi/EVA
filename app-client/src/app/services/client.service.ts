import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';

@Injectable()
export class HttpClient {
  constructor(private http: Http) {}

  createAuthorizationHeader(headers: Headers) {
  }

  get(url, data) {
    const headers = new Headers();
    this.createAuthorizationHeader(headers);
    return this.http.get(url, {
      headers: headers,
      params: data
    });
  }

  post(url, data, responseType = null) {
    const options: any = {};
    const headers = new Headers();
    this.createAuthorizationHeader(headers);
    options.headers = headers;
    if (responseType){
      options.responseType = responseType;
    }
    return this.http.post(url, data, options);
  }

  put(url, data) {
    const headers = new Headers();
    return this.http.put(url, data, {
      headers: headers
    });
  }

  delete(url) {
    const headers = new Headers();
    return this.http.delete(url, {
      headers: headers
    });
  }
}

