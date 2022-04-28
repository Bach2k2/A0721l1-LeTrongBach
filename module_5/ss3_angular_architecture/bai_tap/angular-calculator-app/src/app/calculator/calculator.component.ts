import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  first: number;
  second:number;
  operator:string;
  result:number;
  constructor() { }

  ngOnInit() {
  }

  onFirstChange(value) {
    this.first=value;
  }
  onSelectOperator(value){
  this.operator=value;
  }
  onSecondChange(value){
  this.second=value;
  }
  calculate()
  {
    switch (this.operator) {
      case "+":
      {
        this.result=this.first+this.second;
        break;
      }
      case "-":
      {
        this.result=this.first-this.second;
        break;
      }
      case "x":
      {
        this.result=this.first*this.second;
        break;
      }
      case "%":
      {
        this.result=this.first/this.second;
        break;
      }
    }
  }
}
