public class GravityCalculator{
    private double gravity;
    private double initialVelocity;
    private double fallingTime;
    private double initalPosition;

    public GravityCalculator(double initalVelocity, double fallingTime, double initialPosition){
        this.gravity = -9.8;
        this.initialVelocity  = initialVelocity;
        this.fallingTime = fallingTime;
        this.initalPosition = initialPosition;
    }

    public double getFallingTime(){
        return fallingTime;
    }


    public double calculateFinalPosition(){
        return 0.5 * gravity * (fallingTime * fallingTime) + initialVelocity * fallingTime + initalPosition;


    }

}