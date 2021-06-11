package programs;

import java.util.Scanner;

public class Minute_To_Year_and_Day {
	
	public static void Result(long min) {
		 if (min>0) {
	    	   long year = min/(60*24*365);
//	    	   System.out.println(year);
	    	   long day = (min/60/24)%365;
	    	   System.out.println( min +" minutes is approximately " + year + " years and "+day+" days.");
	       }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter The Minutes: ");
       Scanner sc = new Scanner(System.in);
       long min = sc.nextLong();
       Result(min);
	}

}
