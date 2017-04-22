import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

import java.text.DecimalFormat;
import java.util.*;



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


//      Population population = new Population(3467849, 3254697,45982 );
//
//      System.out.println("first year " + population.getYear1());
//
//      System.out.println("first year " + population.getYear2());
//
//      System.out.println("first year " + population.getYear3());
//
//      System.out.println("first year " + population.getYear4());
//
//      System.out.println("first year " + population.getYear5());


//        double time =1.75 ;
//        double distance = 24;
//        double speed;
//        double mile = 1;
//        double km;
//        km = mile/1.6;
//        speed = distance/time;
//        DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.print("runner runs with the speed " +df.format(speed)  + " km/h" );


//        double x, y;
//        double equation1, equation2;
//
//         x = ( 44.5 * 0.55 - 50.2 * 4.9 )/(3.4 *0.55 -2.1 *50.2 );
//         y = (3.4 * 5.9 - 44.5 * 2.1)/(3.4 * 0.55 - 50.2 * 2.1 );
//         DecimalFormat df = new DecimalFormat("####0.000");
//        System.out.print (" & " +df.format(x));
//        System.out.print (" & " +df.format(y));



//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number for radius: ");
//        double radius = scanner.nextDouble();
//        double area;
//        area = radius * radius * 3.14;
//        System.out.println(area);

//         Scanner scan = new Scanner(System.in);
//         System.out.println("please enter the value");
//         double width;
//         width = scan.nextDouble();
//         System.out.println("please enter the value");
//         double height;
//         height = scan.nextDouble();
//         double perimeter;
//         perimeter = 2 *( width + height);
//         System.out.println("the perimeter is: "+ perimeter);

//         Scanner input = new Scanner(System.in);
//         System.out.println("please enter the numbers");
//         int number1 = input.nextInt(), number2 =input.nextInt(),
//                 number3 = input.nextInt(), number4 = input.nextInt();
//
//         double avarage = (number1 + number2 + number3 + number4)/4;
//         System.out.print(avarage);
//
//        int i=1 ,j=i, k=j;
//
//        System.out.println(i + " " + j + " " + k);

//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a byte value: ");
//
//        byte byteValue = input.nextByte();
//        System.out.print(byteValue);

        Scanner input = new Scanner(System.in);
        System.out.print("please enter the seconds");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int  remainingSeconds = minutes%60;
        System.out.print(minutes + " minutes  and " + remainingSeconds + " seconds ");


    }




}
