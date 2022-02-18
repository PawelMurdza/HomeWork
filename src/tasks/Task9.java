package tasks;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]= {55,40,100,-30,-14,300,6,39,67,450};
		int max=0;
		int secondMax=0;
			
		for (int i = 0; i < number.length; i++) {
			 if (number[i] > max) {
				 secondMax = max;
				 max = number[i];
				 } 
			 else if (number[i] > secondMax) {
				secondMax = number[i];
			
				}
			}
				 
	 System.out.println(secondMax);
				 
	}
}
    
	

