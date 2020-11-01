import java.util.*;
 public class Solution1
{
 public static void main(String[] args)
{
 Student std=new Student[3];
 for(int i=0;i<3;i++)
{
 std[i]=new Student();
}
for(int i=0;i<3;i++)
{
 std[i].getDetails();
}
for(int i=0;i<3;i++)
{
 std[i].displayDetails();
} 
 
}}
class Student
{
 Scanner sc=new Scanner(System.in);
 private int id;
 private String name;
 private String address;
 Student(int id,String name,String address)
{
 this.id=id;
 this.name=name;
 this.address=address;
}
 public int getInt()
{
 return id;
}
 public String getName()
{
 return name;
}
 public String getAddress()
{
 return address;
}
public void getDetails()
{
  int id=sc.nextInt();
  String name=sc.nextLine();
  String address=sc.nextLine();
}
public void displayDetails()
{
 System.out.println("Name:"+name+"Id:"+id+"Address:"+address);
}
}
 
 