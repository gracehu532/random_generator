import java.util.*;
public class random{
	public static void main(String [] args){
		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of students");
		int num_students = Integer.parseInt( scanner.next());
		System.out.println("enter number of students I want to select");
		int num_selected = Integer.parseInt( scanner.next());
		
		int [] array  = new int[num_selected];
		for(int i= 0; i < num_selected; i++){
			//starts from 2
			int randnum = rand.nextInt(num_students + 1) + 2;
			array[i] = randnum;
		}
		Arrays.sort(array);
		System.out.println("Here are the random numbers:\n");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
