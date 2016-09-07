import java.util.*;
public class random{
	public static void main(String [] args){
		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of students");
		int num_students = Integer.parseInt( scanner.next());
		System.out.println("enter number of students I want to select");
		int num_selected = Integer.parseInt( scanner.next());

		for(int i= 0; i < num_selected; i++){
			//starts from 2
			int randnum = rand.nextInt(num_students + 1) + 2;
			System.out.println(randnum);
		}
	}
}
