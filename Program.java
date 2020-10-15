 import java.util.*;
   class Program
{
  public static void main(String[] args)
  {
    Employee e=new Employee("Shaista",21,"Bokaro");
    Employee e1=new Employee("Saurabh",25,"Chennai");
    
    e.display();
    e1.display();
  } }   
  public class Employee
  {
      String name;
      int age;
      String city;
    
   Employee(String name,int age,String city)
  {
     this.name=name;
     this.age=age;
     this.city=city;
  }
   public void display()
  {
    System.out.println("The name is"+name);
    System.out.println("The age is"+age);
    System.out.println("The city is"+city);
  }}
  
   

 