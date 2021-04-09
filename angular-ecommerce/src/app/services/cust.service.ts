import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Cust } from '../common/customer';

@Injectable()
export class CustService {

  response:any;
    baseUrl = "http://localhost:8080/depts";
  constructor(private http: HttpClient) { }
  postregister(cust:Cust)
      {
        this.http.post<Cust>("http://localhost:8080/depts",cust).subscribe((response)=>{
            this.response=response;
            console.log(this.response);
          })
        return this.response;
      }

      postlogin(cust:Cust)
      {
        /*this.http.post<Cust>("http://localhost:8080/login",cust).subscribe((response)=>{
            this.response=response;
            console.log(this.response);
          })
        return this.response;*/
        return this.http.post<Cust>("http://localhost:8080/login",cust);
      }
      postcustomer(cust:Cust)
      {
        /*this.http.post<Cust>("http://localhost:8080/blank",cust).subscribe((response)=>{
            this.response=response;
            console.log(this.response);
          })
        return this.response;*/
        return this.http.post<Cust>("http://localhost:8080/blank",cust);
      }

     
}
