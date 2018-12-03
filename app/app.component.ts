import { Component } from '@angular/core';
import { ReactiveFormComponent } from './reactive-form.component';
import { TemplateDrivenFormComponent } from './template-driven-form.component';

@Component({
  selector: 'app-root',
  template: '<app-reactive></app-reactive>  <app-template></app-template>'
  
})
export class AppComponent {
  title = 'app';
}
