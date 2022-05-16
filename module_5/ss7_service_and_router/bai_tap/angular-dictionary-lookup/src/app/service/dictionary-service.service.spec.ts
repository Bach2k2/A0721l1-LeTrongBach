import { TestBed } from '@angular/core/testing';

import { DictionaryServiceService } from './dictionary-service.service';

describe('DictionaryServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DictionaryServiceService = TestBed.get(DictionaryServiceService);
    expect(service).toBeTruthy();
  });
});
