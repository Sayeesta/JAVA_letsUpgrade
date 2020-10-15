 import java.util.*;

 public class Grade
{
 public static void main(String[] args)
{
 int marks[]=new int[5];
 int i;
 float total=0,percentage;
 Scanner sc=new Scanner(System.in);
 for(i=0;i<5;i++)
{
  System.out.println("Enter marks of subjects"+(i+1)+":");
  marks[i]=sc.nextInt();
 total+=marks[i];
}
 percentage=(total/500)*100;
 System.out.println("Percentage: "+percentage);
if(percentage>=80)
{
 System.out.println("Grade A");
}
else if(percentage<80 && percentage>=60)
{
 System.out.println("Grade B");
}
else if(percentage<60 && percentage>=40)
{
System.out.println("Grade C");
}
 else
{
 System.out.println("Grade D");
}}}
