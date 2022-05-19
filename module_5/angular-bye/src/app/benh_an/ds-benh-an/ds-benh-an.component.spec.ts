import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DsBenhAnComponent } from './ds-benh-an.component';

describe('DsBenhAnComponent', () => {
  let component: DsBenhAnComponent;
  let fixture: ComponentFixture<DsBenhAnComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DsBenhAnComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DsBenhAnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
