package tasks;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of integers in an array ");
		
		int b = a.nextInt();
		int[] numbers= new int[b];
		System.out.println("Enter your numbers");
		
		for (int i=0;i<b;i++) {
		numbers [i] = a.nextInt();
		}
		
		int sum=0;
		for(int j=0; j<numbers.length;j++) {
		sum +=numbers[j];
		}
		System.out.println(sum);
	}

}
