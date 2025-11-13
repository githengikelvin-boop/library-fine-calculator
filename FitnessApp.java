import java.util.Scanner;
public class FitnessApp{
    public static String getFitnessApp(int steps){
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000 && steps < 10000) {
            return"Good";
        } else if (steps >= 4000 && steps < 7000) {
            return "Average";
        } else {
            return "Poor";
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("Enter your steps for today: ");
            int steps = input.nextInt();
            String fitnesslevel = getFitnessApp(steps);
            System.out.println("Your fitness level is: " + fitnesslevel);
            input.close();
    }

}