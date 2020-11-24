import { Component, OnInit } from '@angular/core';
import { ViewEmp } from '../Employee';
//import{Employee,OnInit } from '@angular/cli';
@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {
  pageHeader: string = 'Employee Details..';
  employeeId: number = 10;
  Name: string = 'Rajan';
  salary: number = 35000;
  IsPermanent: Boolean;
  DepartmentId: number = 3 ;
  DepartmentName: string =  "payroll" ;
  constructor() { }

  ngOnInit(): void {
  }
    empl: ViewEmp ={
      skill:[
        {skill_id:1,skill_name:"CSS"},
        {skill_id:2,skill_name:"J2EE"},
        {skill_id:3,skill_name:"HTML"},
      ]
      }
}
