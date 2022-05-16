import {Component, OnInit} from '@angular/core';
import {DictionaryServiceService} from '../service/dictionary-service.service';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {DomSanitizer} from '@angular/platform-browser';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {
  word: any;
  mean: any;
  constructor(private dictionaryService: DictionaryServiceService,
              private activatedRoute: ActivatedRoute,
              private domSanitizer: DomSanitizer) {
  }

  ngOnInit() {
    this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
      const w = paramMap.get('word');
      this.word = this.dictionaryService.findWordByWord(w);
    });

  }
 /* getSrc() {
    const url = 'localhost:4200/translated/' + this.word.stt;
    return this.domSanitizer.bypassSecurityTrustResourceUrl(url);
  }*/
}
