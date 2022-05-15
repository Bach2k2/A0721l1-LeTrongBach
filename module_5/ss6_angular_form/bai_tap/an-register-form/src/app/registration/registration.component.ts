import {Component, OnInit} from '@angular/core';
import {AbstractControl, FormControl, FormGroup, FormsModule, Validators} from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  constructor() {
  }

  registerForm: FormGroup;

  countryList = [
    {
      id: 1, name: 'England'
    }, {
      id: 2,
      name: 'France'
    }, {
      id: 3, name: 'Singapore'
    }, {
      id: 4, name: 'America'
    },
  ];

  ngOnInit() {
    this.registerForm = new FormGroup({
      email: new FormControl('', Validators.compose([Validators.required, Validators.email])),
      passGroup: new FormGroup({
        password: new FormControl('', [Validators.required, Validators.minLength(6)]),
        cfPass: new FormControl('', [Validators.required, Validators.minLength(6)])
      }, comparePassword),
      country: new FormControl('', [Validators.required]),
      age: new FormControl('', [Validators.required]),
      gender: new FormControl('', [Validators.required]),
      phone: new FormControl('', [Validators.required]),
    });
  }

  onSubmit() {
    console.log(this.registerForm.value);
  }

}

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
