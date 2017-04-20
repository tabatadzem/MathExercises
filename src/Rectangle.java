/**
 * Created by Maestro on 20.04.2017.
 */
public class Rectangle {
    private double  mArea, mPerimeter;
    private double mW,mH;


    public Rectangle(double w, double h) {
        mW = w;
        mH = h;
    }

    public double getArea(){
        mArea = mW*mH;
        return  mArea;
    }

    public double getPerimeter(){
        mPerimeter = 2*(mW+mH);
        return  mPerimeter;
    }





}
