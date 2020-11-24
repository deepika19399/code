import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ViewEmployeeComponent } from './view-employee/view-employee.component';

const routes: Routes = [
 {path:'viewEmployee',component: ViewEmployeeComponent}, ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
