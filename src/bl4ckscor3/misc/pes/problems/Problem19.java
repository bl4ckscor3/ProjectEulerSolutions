package bl4ckscor3.misc.pes.problems;

public class Problem19 implements IProblem
{
	@Override
	public void exe()
	{
		int year = 1900;
		int month = 1;
		int day = 1;
		int weekday = 1;
		int sundays = 0;
		boolean leapYear = false;

		while(year < 2001) //check up until 31.12.2000
		{
			if(year == 1901 && month == 1 && day == 1)
				sundays = 0; //reset to start counting at that day

			if(weekday < 7) //next weekday
				weekday++;
			else //if it is the seventh weekday, it's a sunday, so reset weekday to monday
			{
				weekday = 1;

				if(day == 1) //the sunday is the first of the month so increment only then
					sundays++;
			}

			day++;

			if(leapYear) //it's a leap year and the 29th of february, so change the month and reset the day
			{
				month++;
				day = 1;
				leapYear = false; //reset as to not go into this if branch until the next leap year
			}
			else if(day > 28 && month == 2) //february
			{
				if(year % 4 == 0 && (year % 100 != 0  || year % 400 == 0)) //this is a leap year, so increment month in the next iteration
					leapYear = true;
				else //not a leap year, so we can increment
				{
					month++;
					day = 1;
				}
			}
			else if(day == 32 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) //month with 31 days, checking for 32 because day is getting incremented before this check
			{
				day = 1;

				if(month != 12) //not december, don't worry about changing the year
					month++;
				else //it's december, change the year and reset the month
				{
					year++;
					month = 1;
				}
			}
			else if(day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) //month with 30 days, checking for 31 because day is getting incremented before this check
			{
				day = 1;
				month++;
			}
		}

		System.out.println("The amount of sundays falling on the first of the month between 1.1.1901 and 31.12.2000 is " + sundays);
	}


	@Override
	public String name()
	{
		return "Counting sundays";
	}
}
