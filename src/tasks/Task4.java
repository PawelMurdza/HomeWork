package tasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers={{2,5,-45,13},{15,551,13,222,0},{55,25,45},{100,400,233}};
				
		int odd=0;
		int even=0;
		
		for (int i=0; i<numbers.length;i++) {
			for (int j=0; j<numbers[i].length;j++) {
					if (numbers[i][j] % 2 == 0) {
						even+=numbers[i][j];} 
					else {
						odd+=numbers[i][j];
			}
		}
		
	}
		System.out.println("The sum of odd numbers is "+odd);
		System.out.println("The sum of even numbers is "+even);
	}
}
	


