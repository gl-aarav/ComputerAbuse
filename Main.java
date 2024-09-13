/*
 * Aarav Goyal
 * 10/5/2023
 * Computer Abuse
 */
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String investname, offendname;
		int abuse_num;
		System.out.println("FBI Name: SECRET_CASE");

		System.out.println("What is investigator's name?");
		investname = in.nextLine();

		System.out.println("What is the offender's name?");
		offendname = in.nextLine();

		System.out.printf("%-38s %-20s %n","What cruelty offense did you observe?", "Here are the choices:");
		System.out.printf("%-38s %-20s %n","1. Name calling at the computer.", "($49.95)");
		System.out.printf("%-38s %-20s %n","2. Finger shaking at the computer.", "($99.95)");
		System.out.printf("%-38s %-20s %n","3. Yelling loudly at the computer.", "($149.95)");
		System.out.printf("%-38s %-20s %n","4. Physically attacking the computer.", "($499.95)");
		System.out.println("\nWhich type of abuse did  the offender do 1, 2, 3, or 4. ");
		abuse_num = in.nextInt();

		if (offendname.equalsIgnoreCase("Donald") && abuse_num==4) {
			System.out.println("Donald, you have to pay $724.93 as reported by " + investname + ".");
		}
		else if (offendname.equalsIgnoreCase("Minnie") && investname.equalsIgnoreCase("Mickey") && abuse_num==3 || abuse_num==4){
			System.out.println("Fines over $100 cannot be issued against a spouse.");
		}
		else {
			switch (abuse_num){
			case 1:
				System.out.println(offendname + ", you have to pay $49.95 as reported by: " + investname);
				break;
			case 2:
				System.out.println(offendname + ", you have to pay $99.95 as reported by: " + investname);
				break;
			case 3:
				System.out.println(offendname + ", you have to pay $149.95 as reported by: " + investname);
				break;
			case 4:
				System.out.println(offendname + ", you have to pay $499.95 as reported by: " + investname);
				break;
			default:
				System.out.println("You did not enter an appropriate response. The program is ending.");


			}
		}
	}
}