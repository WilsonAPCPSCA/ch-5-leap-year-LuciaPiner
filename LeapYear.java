import java.util.Scanner;
public class LeapYear {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a year to check if it's a leap year or not: ");
	int year = in.nextInt();
	boolean isLeapYear = isLeapYear(year);
	System.out.print(isLeapYear);
}
public static boolean isLeapYear(int year){
	boolean isLeapYear = false;
	for (int i = 1; i<=1000; i++){
		if((1582+(4*i))-2 == year){
			isLeapYear = true;
		}
	}
	return isLeapYear;
}
}
