package Lab02_Calendar;

public class Calendar 
{
	  public static void printMonthBody(int year, int month)
	  {
		  // calls the method that returns the month name
		  printMonthName(year, month);
		  //calculate the first date of the month
		  int startDay=getStartDay(year, month);
		  // calculate the number of days in the month
		  int noOfDaysInMonth=getNoOfDaysInMonth(year, month);
		  for(int i=0;i<startDay;i++)
		  {
			  System.out.print("    ");		 	  
		  }
		  for(int j=1;j<=noOfDaysInMonth;j++)
		  {
			  System.out.printf("%3d ",j);
			  if((j+startDay)%7==0)
			  {  
				  System.out.println(); 
			  } 
		  }
	  }
	  public static int getTotalNoOfDays(int year, int month)
	  {
		  int total=0; 
		  // Start calculating from year 1st January 1000
		  for(int i=1000;i<year;i++)
		  {
			  if(isLeapYear(i))
			  {
				  total=total+366;
			  }
			  else 
			  {
				  total=total+365;
			  }
		  }
		  for(int j=1;j<month;j++)
		  {
			  total=total+getNoOfDaysInMonth(year,j);
		  }
		  return total;
	  }// to calculate whether a year is a leap year
	  public static Boolean isLeapYear(int year){
			if(year%400==0||(year%4==0 && year%100!=0))
				return true;
			else return false;
		}// to decide which month it is
	  public static int getNoOfDaysInMonth(int year, int month)
	  {
		  if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			  {return 31;}
		  if(month==4||month==6||month==9||month==11)
			  {return 30;}
		  if(month==2)
			  {return isLeapYear(year)? 29:28;}
		  return 0; 
	  }
  public static int  getStartDay(int year, int month)
  {
	  final int START_DAY_OF_1_JANUARY_1000=3;
	  // calculate the number of days from  1st January 1000 to inserted date
	  int totalNumberOfDays=getTotalNoOfDays(year,month);
	  
	  return (totalNumberOfDays+START_DAY_OF_1_JANUARY_1000)%7;
	  
  }

  // to print the month name like January 1800
  public static void printMonthName(int year,int month)
  {
	  System.out.println("    "+getMonthName(month)+" "+year);
	  System.out.println("============================");
	  System.out.println("Sun Mon Tue Wed Thu Fri Sat");
  }
 
  public static String getMonthName(int month)
  {
	  String monthName="";
	  switch(month)
	  {
	  case 1:monthName="January";
	  break;
	  case 2:monthName="February";
	  break;
	  case 3:monthName="March";
	  break;
	  case 4:monthName="April";
	  break;
	  case 5:monthName="May";
	  break;
	  case 6:monthName="June";
	  break;
	  case 7:monthName="July";
	  break;
	  case 8:monthName="August";
	  break;
	  case 9:monthName="September";
	  break;
	  case 10:monthName="October";
	  break;
	  case 11:monthName="November";
	  break;
	  case 12:monthName="December";
	  break;
	  }
	  return monthName;
  }
  
}
