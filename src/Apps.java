import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Apps {

    public static void main (String[] args ) {

      /* System.out.println("BBBBBB   UU   UU  ZZZZZZZ   IIIIIII ");
        System.out.println("BB  BB   UU   UU       ZZ      II   ");
        System.out.println("BBBBBB   UU   UU     ZZ        II    ");
        System.out.println("BB  BB   UU   UU  ZZ           II    ");
        System.out.println("BBBBBB    UUUUU  ZZZZZZZ    IIIIIIII "); */

//        System.out.println("a   a^2   a^3");
//        System.out.println("1   1      1");
//        System.out.println("2   4      8");
//        System.out.println("3   9      27");
//        System.out.println("4   16     64");

//        float x;
//        x = (float) ((float) ((9.5 * 4.5) - (2.5 * 3))/(45.5 - 3.5));
//        System.out.print(x);
//


//            int r;
//            double pi = 3.14, area;
//            Scanner s = new Scanner(System.in);
//            System.out.print("Enter radius of circle:");
//            r = s.nextInt();
//            area = pi * r * r;
//            System.out.println("Area of circle:"+area);


//       double width=0;
//       double hight=0;
//
//        Scanner scanner = new Scanner(System.in);
//        DecimalFormat df = new DecimalFormat("####0.00");
//        System.out.println("please enter the numbers: ");
//        width = scanner.nextDouble();
//        hight = scanner.nextDouble();
//        Rectangle rectangle = new Rectangle(width, hight);
//        System.out.println("area " +df.format( rectangle.getArea()));
//        System.out.println("perimeter " +df.format( rectangle.getPerimeter()));
//        double time ;
//        double distance ;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please enter the distance: ");
//        distance = scanner.nextDouble();
//        System.out.println("please enter the time: ");
//        time = scanner.nextDouble();
//        Runner runner = new Runner( time, distance);
//        DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.print("speed is "+df.format( runner.getSpeed() ));
//

      Population population = new Population(3467849, 3254697,45982 );

      System.out.println("first year " + population.getYear1());

      System.out.println("first year " + population.getYear2());

      System.out.println("first year " + population.getYear3());

      System.out.println("first year " + population.getYear4());

      System.out.println("first year " + population.getYear5());

    }

}
