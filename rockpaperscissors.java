import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
    public static void main(String[] args) {
        int userinput;
        int compinput;
        System.out.print("enter \n0 for rock"+"\n"+"1 for paper"+"\n"+"2 for scissor");
        System.out.println();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("choose a number:");
            userinput=sc.nextInt();
        }
        Random random=new Random();
        compinput=random.nextInt(3);
        if(compinput==0){
            System.out.println("computer input:rock");

        }else if(compinput==1){
            System.out.println("computer input:paper");

        }else{
            System.out.println("computer input:scissor");
        }
        if(userinput==0 && compinput==2 || userinput==1 && compinput==0 || userinput==2 && compinput==1){
            System.out.println("you win!");
        }else{
            System.out.println("you lost!");
        }
    }


}
