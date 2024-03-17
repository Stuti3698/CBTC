package pat;
import java.util.*;
public class guess {
	public static void main(String[] args) {
		Random rand=new Random();
		int randomnum=rand.nextInt(100)+1;
		System.out.println(randomnum);
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		while(true) {
			System.out.println("Enter the number (1-100)");
			int input=sc.nextInt();
			count++;
			if(randomnum==input) {
				System.out.println("Hurray! Correct guess! You win ");
				System.out.println("You took "+count+" tries");
				break;
			}
			else if(randomnum<input) {
				System.out.println("Wrong.Your input is higher.Try again ");
			}
			else {
				System.out.println("Wrong.Your input is lower.Try again ");
			}
		}
	}
}
