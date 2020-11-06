package com.QuizApp;
import java.util.*;
public class Game {
    Scanner sc=new Scanner(System.in);
    Question []questions=new Question[3];
    Player player=new Player();
    public void initGame()
    {
        for(int i=0;i<3;i++)
        {
            questions[i]=new Question();

        }
        questions[0].question="Who is the Strongest Avenger?";
        questions[0].option1="hulk";
        questions[0].option2="ironman";
        questions[0].option3="Thor";
        questions[0].option4="Scallet witch";
        questions[0].correctAns=3;

        questions[1].question="Which one is not charcter in friends?";
        questions[1].option1="monica";
        questions[1].option2="chandler";
        questions[1].option3="Rachel";
        questions[1].option4="joni";
        questions[1].correctAns=4;

        questions[2].question="What is the closet planet to sun?";
        questions[2].option1="jupitor";
        questions[2].option2="moon ";
        questions[2].option3="Earth";
        questions[2].option4="Venus";
        questions[2].correctAns=3;

    }
    public void play()
    {
        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("kya bat!!kya bat!!kya bat!!");
                player.score++;
            }
            else
            {
                System.out.println("Try next time!!!!!");
            }
        }
        System.out.println(player.name+" Your score is "+player.score);
    }
}
