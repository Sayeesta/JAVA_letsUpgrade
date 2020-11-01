 import java.util.*;


 public class Project
{
 public static void main(String[] args)
{

  Game game=new Game();
  game.initGame();
  game.play();

}
}
 
 public class Questions
{
 Scanner sc=new Scanner(System.in);
 String questions,option1,option2,option3,option4;
 int correctAns,userAns;

 public boolean askQuestion()
{
 System.out.println(question);
 System.out.println("1. "+option1);
 System.out.println("2. "+option2);
 System.out.println("3. "+option3);
 System.out.println("4. "+option4);
 System.out.println("Please choose an option");
 int userAns=sc.nextInt();
 if(userAnswer==correctAnswer)
{
  return true;
}
 return false;
 
} 
}

 public class Player
{
 String name;
 int score=0;
 public void getDetails()
{ 
  System.out.println("Enter player name:");
  name=sc.nextLine();
  
}
}
 public class Game
{
 Question[] questions=new Question[3];
 Player[] player=new Player();
 public void initGame()
{
 for(int i=0;i<3;i++)
{
 questions[i]=new Question();
}
 questions[0].question="Who is the strongest?";
 questions[0].option1="Ironman";
 questions[0].option2="Thor";
 questions[0].option3="Hulk";
 questions[0].option4="Scarlet Witch";
 questions[0].currectAnswer=2;
 
 questions[1].question="What is the closest planet to sun?";
 questions[1].option1="Earth";
 questions[1].option2="Venus";
 questions[1].option3="Mercury";
 questions[1].option4="Jupiter";
 questions[1].currectAnswer=3;

 questions[2].question="What is the capital of Australia?";
 questions[2].option1="Sydney";
 questions[2].option2="Melbourne";
 questions[2].option3="Perth";
 questions[2].option4="Canberra";
 questions[2].currectAnswer=4;
}
 public void play()
{
  player.getDetails();
  for(int i=0;i<3;i++)
{
  boolean status=questiona[i].askQuestion();
  if(status==true)
{  
   System.out.println("Bohat hi unda khele h aap");
   player.score++;
}
  else
{
   System.out.println("Maaf krna mai apki sahayta nhi kr sakta");
}
}
 System.out.println(player.name+" your score is "+player.score);
}
}



 




 




 
 




 






 