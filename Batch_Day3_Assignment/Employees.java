 import java.util.*;
 import java.time.*;
 
 class Employees
{
 public static void main(String[] args)
{
 String name;
 int date;
 int month;
 int year;
 double salary,annual_salary=0,tax=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Emloyee Details");
 System.out.println("Employee's Name:");
 name=sc.nextLine();
 System.out.println("Employee's DOB:");
 date=sc.nextInt();
 month=sc.nextInt();
 year=sc.nextInt();
 System.out.println("Employee's Salary");
 salary=sc.nextDouble();
 annual_salary+=salary+salary+salary+salary+salary+salary+salary+salary+salary+salary+salary+salary;
  LocalDate bDate= LocalDate.of(year,month,date);
  LocalDate cDate= LocalDate.now();
  Period diff= Period.between(bDate,cDate);
 System.out.println("Employee's Name:"+name);
 System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");
 System.out.println("age:" + diff.getYears() + "years");
 
 if(annual_salary == 6,00,000)
{
  tax=annual_salary*0.20;
  annual_salary=annual_salary-tax;
  System.out.println("Tax Amount:"+tax);
  System.out.println("Annual Salary="+annual_salary);
}
 else if(annual_salary==4,00,000)
{
  tax=annual_salary*0.15;
  System.out.println("Tax Amount:"+tax);
}
else if(annual_salary==3,00,000)
{
  tax=annual_salary*0.10;
  System.out.println("Tax Amount:"+tax);
}
 else if(annual_salary==2,00,000)
{
  tax=annual_salary*0.05;
  System.out.println("Tax Amount:"+tax);
}
}
}
  
 
 

 