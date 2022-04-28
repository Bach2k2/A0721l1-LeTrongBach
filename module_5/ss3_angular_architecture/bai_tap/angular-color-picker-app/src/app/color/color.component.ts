import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-color',
  templateUrl: './color.component.html',
  styleUrls: ['./color.component.css']
})
export class ColorComponent implements OnInit {
  test: any;
  constructor() {
  }

  ngOnInit() {
  }
  onChangeColor(value) {
    this.test = value;
  }
}
