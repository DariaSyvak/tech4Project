package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UnderstandingDateFormat {
    public static void main(String[] args) {


        Date currentDate = new Date();
        System.out.println(currentDate);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        System.out.println("Today is = " +  sdf.format(currentDate));

        SimpleDateFormat tdt=new SimpleDateFormat( "EEEE hh:mm a");
        System.out.println(tdt.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate));


        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter your year of birth");
        int yourYear=scanner.nextInt();
        SimpleDateFormat year=new SimpleDateFormat( "yyyy");
        System.out.println("You are "+(Integer.parseInt(year.format(currentDate))-yourYear) + " years old");

    }
}
