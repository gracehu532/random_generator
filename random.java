//Random number generator to select participants
//for WHACK (Wellesley College Hackathon)

import java.util.*;
public class random{
	public static void main(String [] args){
		Random rand = new Random();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of students");
		int num_students = Integer.parseInt( scanner.next());
		System.out.println("enter number of students I want to select");
		int num_selected = Integer.parseInt( scanner.next());
		
		//keeps track of whether random number was already generated
		//default value is false
		boolean [] num_Generated = new boolean[num_students + 1]; 	

		int [] array  = new int[num_selected];
		for(int i= 0; i < num_selected; i++){
			//starts from 2
			int randnum;
			int count = 0;
			do{
				randnum  = rand.nextInt(num_students -1) + 2;
				if(count > 1)
					System.out.println("Repeated randnum is " + randnum);
				count++;

				System.out.println("Problem here " + randnum);
			}while(num_Generated[randnum] == true);
			num_Generated[randnum] = true;
			array[i] = randnum;
		}
		Arrays.sort(array);
		System.out.println("Here are the random numbers:\n");
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}
}
