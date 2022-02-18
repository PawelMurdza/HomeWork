package tasks;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { { 50, 150, 300 }, { 40, 20, 10 }, { 50, 800, 900 }, {10,20,30 },{50,20,30}};

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum+=numbers[i][j];
			}
		}
		System.out.println("The sum of all numbers equals to "+sum);
	}
}
