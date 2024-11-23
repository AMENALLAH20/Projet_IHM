import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestauCardsComponent } from './restau-cards.component';

describe('RestauCardsComponent', () => {
  let component: RestauCardsComponent;
  let fixture: ComponentFixture<RestauCardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RestauCardsComponent]
    });
    fixture = TestBed.createComponent(RestauCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
