import java.util.*;
public class TASK_02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      Random random=new Random();
      int correct_no=random.nextInt(100);
        boolean guessedCorrectly=false;
        int count=0;
        while(!guessedCorrectly){
            System.out.println("Guess the no.: ");
            count++;
            int guess=sc.nextInt();
            if(guess==correct_no){
                System.out.println("Yeah! You got it right");
                System.out.println("No. of attempts:"+count);
                guessedCorrectly=true;
            }
            else if(Math.abs(guess-correct_no)>5){
                if(guess>correct_no){
                    System.out.println("The no. is too high");
                }
                else{
                    System.out.println("The no. is too low");
                }
            }
            else{
                System.out.println("You are getting closer");
            }
        }
    }
}
