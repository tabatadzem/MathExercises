/**
 * Created by Maestro on 20.04.2017.
 */
public class Runner {
    private double mTime;
    private  double mDistance;
    private double speed;

    public Runner(double time, double distance) {
        mTime = time;
        mDistance = distance;
    }
    public double getSpeed(){
        speed = mDistance/mTime;
        return speed;
    }


}
