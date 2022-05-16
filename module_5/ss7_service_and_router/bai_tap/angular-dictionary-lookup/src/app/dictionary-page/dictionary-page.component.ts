import { Component, OnInit } from '@angular/core';
import {Iword} from '../iword';
import {DictionaryServiceService} from '../service/dictionary-service.service';

@Component({
  selector: 'app-dictionary-page',
  templateUrl: './dictionary-page.component.html',
  styleUrls: ['./dictionary-page.component.css']
})
export class DictionaryPageComponent implements OnInit {

  wordsCollect: Iword[] = [];

  constructor(private dictionaryService: DictionaryServiceService) {
  }

  ngOnInit() {
    this.getAll();
  }
  getAll()  {
    this.wordsCollect = this.dictionaryService.wordStorage;
  }
}
