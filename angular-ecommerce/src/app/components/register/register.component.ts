import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ActivatedRoute, Router } from '@angular/router';
import { Cust } from 'src/app/common/customer';
import { CustService } from 'src/app/services/cust.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  cust:Cust;
  response2:any;
  constructor(private http :HttpClient,private route:Router,private custService: CustService) {
    this.cust = new Cust();
   }

  ngOnInit(): void {
  }

  postdept(){
     this.response2=this.custService.postregister(this.cust);
    console.log(this.response2);
    alert("Successful");
    this.route.navigate(["/login"]);
  }
}
