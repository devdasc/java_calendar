package Lab02_Calendar;
import java.util.Scanner;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month;
		Scanner input=new Scanner(System.in);
		do
		{
			System.out.print("Enter no of Month(1-12): ");
			while(!input.hasNextInt())
			{
				System.out.print("You must enter a number: ");
				input.next();
			}
			month=input.nextInt();
			if(month<1 || month>12)
				{
				System.out.println("Month must be between 1 to 12");
				}
		}while(month<1 || month>12);
		do
		{
			System.out.print("Enter Year: ");
			while(!input.hasNextInt())
			{
				System.out.print("You must enter a number: ");
				input.next();
			}
			year=input.nextInt();
			if(year<1000)
				{
				System.out.println("Year must be on or after 1000 A.D");
				}
		}while(year<1000);
		Calendar.printMonthBody(year, month);		
		input.close();	
	}
}
