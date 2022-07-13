import java.util.Random;

public class Dices {

    int startPostion = 0;

    public int play(int dices) {
        Random number = new Random();
        int random1 = 1 + number.nextInt(3);
        switch (random1) {
            case 1:
                System.out.println("No Play");
                break;
            case 2:
                startPostion = startPostion + dices;
                if (startPostion > 100) {
                    System.out.println("not proper roll");
                    startPostion = startPostion - dices;
                } else {
                    System.out.println("it's a ladder");
                    System.out.println("the roll is " + dices + " current position is " + startPostion);
                }
                break;
            case 3:
                startPostion = startPostion - dices;

                if (startPostion <= 0) {
                    startPostion = 0;
                } else {
                    System.out.println("it's a snake");
                    System.out.println("the roll is " + dices + " current position is " + startPostion);
                }
                break;
        }
        return startPostion;
    }
}