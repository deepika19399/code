import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeecountComponent } from './employeecount/employeecount.component';
import { LifecycleComponent } from './lifecycle/lifecycle.component';
import { ViewEmployeeComponent } from './view-employee/view-employee.component';
import { EditEmployeeComponent } from './edit-employee/edit-employee.component';
import { QuantityIncrementComponent } from './quantity-increment/quantity-increment.component';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeelistComponent,
    EmployeecountComponent,
    LifecycleComponent,
    ViewEmployeeComponent,
    EditEmployeeComponent,
    QuantityIncrementComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
