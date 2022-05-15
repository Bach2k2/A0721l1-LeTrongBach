import {Component, OnInit} from '@angular/core';
import {FormGroup, FormControl, Validators, AbstractControl} from "@angular/forms";

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  login: FormGroup
  /*accountName: string
  password: string;*/

  constructor() {
  }

  ngOnInit() {
    login: new FormGroup({
      accountName: new FormControl('', Validators.compose([Validators.required, Validators.email])),
      password: new FormControl('', Validators.compose([Validators.required, Validators.minLength(6)])),
    });
  }

  loginUser() {
      if ( this.login.value.accountName == "admin@gmail.com" && this.login.value.password == "123456")
        console.log("Congratulation! Login success");
      else {
        console.log("Sorry,Failed to login");
      }
  }
}

