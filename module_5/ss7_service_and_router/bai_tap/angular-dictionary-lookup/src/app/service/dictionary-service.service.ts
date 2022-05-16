import {Injectable} from '@angular/core';
import {Iword} from '../iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryServiceService {

  constructor() {
  }

  wordStorage: Iword[] = [
    {
      word: 'Hello',
      mean: 'Xin chao'
    },
    {
      word: 'How are you?',
      mean: 'Ban co khoe khong?',
    }
  ];

  findWordByWord(word: string) {
    return this.wordStorage.find(item => item.word = word);
  }

  getDictionary() {
    return this.wordStorage;
  }

  translateW() {

  }
}
