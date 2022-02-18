package tasks;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {55,40,441,-30,-14,10,6,39,67};
		int maxNum=number[0];
		int minNum=number[0];
		
		for (int i=0; i<number.length;i++) {
			if (number[i]<minNum) {
				minNum=number[i];
			}
			if(number[i]>maxNum) {
				maxNum=number[i];
			}
		}
System.out.println("Max number is "+maxNum+" and min number is "+minNum);
	}

}
