import { TestBed } from '@angular/core/testing';

import { BenhAnService } from './benh-an.service';

describe('BenhAnService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BenhAnService = TestBed.get(BenhAnService);
    expect(service).toBeTruthy();
  });
});
