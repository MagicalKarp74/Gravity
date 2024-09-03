public class GravityCalculator{
    private double gravity;
    private double initialVelocity;
    private double fallingTime;
    private double initalPosition;

    public Gravity Calculator( initalVelocity, fallingTime, initialPosition){
        this.gravity = -9.8;
        this.initalVelocity  = intialVelocity;
        this.fallingTime = fallingTime;
        this.initalPosition = initialPosition;
    }

    public static calculateFinalPosition(){

        return 0.5 * gravity * (fallingTime * fallingTime) + initialVelocity * fallingTime + initalPosition;



    }

}