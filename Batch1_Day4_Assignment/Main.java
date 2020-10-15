import java.util.*;

  class Avengers
{
 Scanner sc=new Scanner(System.in);
 String name,power,planet;
 int age;
 public void getDetails()
{
 System.out.println("Enter Avenger's Name:");
 name=sc.nextLine();
 System.out.println("Enter age:");
 age=sc.nextInt();sc.nextLine();
 System.out.println("Power:");
 power=sc.nextLine();
 System.out.println("Planet:");
 planet=sc.nextLine();
 }
 public void displayDetails()
{
 System.out.println("The name of Avenger is="+ name +"Age is"+ age + "Power" + power + "Planet" + planet);
}
 }

  class Main
{
 public static void main(String[] args)
{
 Avengers[] avg = new Avengers[5];
 for(int i=0;i<5;i++)
{
  avg[i]=new Avengers();
}
 for(int i=0;i<5;i++)
{
  avg[i].getDetails();
}
 for(int i=0;i<5;i++)
{
  avg[i].displayDetails();
}
}
}
 
 
