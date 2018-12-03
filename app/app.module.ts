import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule, PatternValidator } from '@angular/forms';
import { AppComponent } from './app.component';

import { ReactiveFormComponent } from './reactive-form.component';
import { TemplateDrivenFormComponent } from './template-driven-form.component';
import { UserService } from './user-service';

@NgModule({
  declarations: [
    AppComponent,
    ReactiveFormComponent,
      TemplateDrivenFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
      ReactiveFormsModule
  ],
  providers: [UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
