public class Main{

     public static void main(String[] args) {

        GravityCalculator test = new GravityCalculator(5,10,5);

        double finalPosition = test.calculateFinalPosition();

        System.out.println("after " + test.getFallingTime() + " seconds the final position is: "+finalPosition+"m");




     }


}