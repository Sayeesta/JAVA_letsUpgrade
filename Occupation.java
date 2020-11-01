 import java.util.*;

 class Parent
{
  void display()
{
  System.out.println("This is Parent Class");
}
}
 class Doctor extends Parent
{
  void c_display()
{
  System.out.println("This is Doctor Class");
}
}
 class Engineer extends Parent
{
  void e_display()
{
  System.out.println("This is Engineer Class");
}
}
 class Pilot extends Parent
{
 void p_display()
{
  System.out.println("This is Pilot Class");
}
}


 class Occupation
{
 public static void main(String[] args)
{
 Doctor d=new Doctor();
 d.c_display();
 Engineer e=new Engineer();
 e.e_display();
 Pilot p=new Pilot();
 p.p_display();
}}

 