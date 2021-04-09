import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Cust } from 'src/app/common/customer';
import { CustService } from 'src/app/services/cust.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  cust:Cust;
  response1:any;
  constructor(private http :HttpClient,private route:Router,private custService: CustService) {
    this.cust = new Cust();
   }

  ngOnInit(): void {
  }

  postdept(){
    /*this.response2=this.custService.postlogin(this.cust);*/
   this.custService.postlogin(this.cust).subscribe(async (response)=>{
      if(Boolean(response) == true)
    {
      this.custService.postcustomer(this.cust).subscribe(async (response) => {
        await sessionStorage.setItem("customer", JSON.stringify(response));
          alert('Login success');
    this.route.navigate(["/products"]);
   })}

    else
    alert("Not Successful");
    })
    
  }

}
