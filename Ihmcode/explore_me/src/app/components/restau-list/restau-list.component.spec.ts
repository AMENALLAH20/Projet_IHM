import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestauListComponent } from './restau-list.component';

describe('RestauListComponent', () => {
  let component: RestauListComponent;
  let fixture: ComponentFixture<RestauListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RestauListComponent]
    });
    fixture = TestBed.createComponent(RestauListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
