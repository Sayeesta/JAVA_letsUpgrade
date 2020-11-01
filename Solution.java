
 import java.util.*;
 public class Parent
{
 Scanner sc=new Scanner(System.in);
 String name;
 int age;
 double salary;
 String designation;
 public Parent(String name,int age,double salary,String designation)
{
 this.name=name;
 this.age=age;
 this.salary=salary;
 this.designation=designation;
}
 void getDetails()
{
 System.out.println("Name of Employee:");
 name=sc.nextLine();
 System.out.println("Age:");
 age=sc.nextInt();
 System.out.println("Salary:");
 salary=sc.nextDouble();sc.nextLine();
 System.out.println("Designation:");
 designation=sc.nextLine();
}
 void displayDetails()
{
 System.out.println(name+" "+age+" "+salary+" "+designation);
}
}
 class Solution
{
 public void main(String[] args)
{
 Parent p=new Parent();
 p.getDetails();
 p.displayDetails();

}
}
 