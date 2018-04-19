
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month =10;
		String week= "Wednesday";
		
		switch(week)
		{
			case "monday":
				System.out.println("Day1");
			break;
		case "Tuesday":
				System.out.println("Day2");
				break;
			case "Wednesday":
				System.out.println("Day3");
				break;
			case "Thurday":
				System.out.println("Day4");
				break;
			case "Friday":
				System.out.println("Day5");
				break;
			case "Saturday":
				System.out.println("Day6");
				break;
			case "Sunday":
				System.out.println("Day7");
		}
		
		switch(month)
		{
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("June");
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("Aug");
				break;
		
			case 9:
				System.out.println("Sep");
				break;
			case 10:
				
				System.out.println("Oct");
		break;
			case 11:
				System.out.println("Nov");
				break;
			case 12:
				System.out.println("Dec");
				break;
		}
	}

}
