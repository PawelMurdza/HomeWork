package tasks;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	    int x = 55;
        int y = 80;
       
        System.out.println("Before x = "+x+" and y = "+y);
        
        x= x+y;
        y= x-y;
        x= x-y;
        
        System.out.println("After x = "+ x +" and y = "+y);
       
    }
}