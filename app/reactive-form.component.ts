import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, Validators, FormGroup } from '@angular/forms';
import { UserService } from './user-service';
import { User } from './user';
import * as caas_en from './content/label_msg_en.json';
import * as caas_de from './content/label_msg_de.json';

@Component({
   selector: 'app-reactive',
   templateUrl: './reactive-form.component.html'
})
export class ReactiveFormComponent implements OnInit {
  unamePattern = '^[a-z0-9_-]{8,15}$';
  pwdPattern = '^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\s).{6,12}$';
  mobnumPattern = '^((\\+44-?)|0)?[0-9]{10}$';
  emailPattern = '^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$';

  pageLabel = '';
  pageMessage = '';
  unameLabel = '';
  unamError1 = '';
  unamError2 = '';
  pwdLabel = '';
  pwdError1 = '';
  pwdError2 = '';
  mobnumLabel = '';
  mobnumError1 = '';
  mobnumError2 = '';
  emailLabel = '';
  emailError1 = '';
  emailError2 = '';


  isValidFormSubmitted = null;
  
  userForm: FormGroup;

  constructor(private formBuilder:FormBuilder, private userService: UserService) {

    this.userForm = this.formBuilder.group({
      username: ['', [Validators.required, Validators.pattern(this.unamePattern)]],
      password: ['', [Validators.required, Validators.pattern(this.pwdPattern)]],
      mobileNumber: ['', [Validators.required, Validators.pattern(this.mobnumPattern)]],
      email: ['', [Validators.required, Validators.pattern(this.emailPattern)]],
    });
  }
  ngOnInit() {
      console.log('Label = ' + JSON.stringify(caas_en));
      const name = (<any>caas_en).pageLabel;
      console.log('PAge Label = ' + name);
      const name_de = (<any>caas_de).pageLabel;
      console.log('PAge Label DE = ' + name_de);
      console.log('Language = ' + navigator.language);
      // Service will be called here with language. Now, using browser language. But we can also use profile language
      this.pageLabel = (<any>caas_en).pageLabel;
      this.pageMessage = (<any>caas_en).pageMessage;
      this.unameLabel = (<any>caas_en).unameLabel;
      this.unamError1 = (<any>caas_en).unamError1;
      this.unamError2 = (<any>caas_en).unamError2;
      this.pwdLabel = (<any>caas_en).pwdLabel;
      this.pwdError1 = (<any>caas_en).pwdError1;
      this.pwdError2 = (<any>caas_en).pwdError2 ;
      this.mobnumLabel = (<any>caas_en).mobnumLabel;
      this.mobnumError1 = (<any>caas_en).mobnumError1;
      this.mobnumError2 = (<any>caas_en).mobnumError2;

      this.emailLabel = (<any>caas_en).emailLabel;
      this.emailError1 = (<any>caas_en).emailError1;
      this.emailError2 = (<any>caas_en).emailError2;


  }
  onFormSubmit() {
     this.isValidFormSubmitted = false;
     if (this.userForm.invalid) {
        return;
     }
     this.isValidFormSubmitted = true;
     const user: User = this.userForm.value;
     this.userService.createUser(user);
     this.userForm.reset();
  }
  get username() {
     return this.userForm.get('username');
  }
  get password() {
     return this.userForm.get('password');
  }  
  get mobileNumber() {
     return this.userForm.get('mobileNumber');
  }    
  get email() {
     return this.userForm.get('email');
  }      
}
