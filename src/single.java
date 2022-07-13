import java.util.Random;

public class single {
    public static void main(String[] args) {


        System.out.println(" ------welcome to Snake and Ladder game of single player-------");
        int numOfRoles=0;
        int totalScore=0;
        // int i =0;
        Dices roll = new Dices();




        while (totalScore<100){
            Random number = new Random();
            int dice = 1 + number.nextInt(6);
            System.out.println("the role is "+dice);
            numOfRoles++;
            totalScore =roll.play(dice);

        }

        System.out.println("no of roles to win "+ numOfRoles);
        System.out.println("total score"+totalScore);



    }

}