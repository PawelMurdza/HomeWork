package tasks;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number");
		int b = a.nextInt(); 
		
		int i=0;
		int j=0;
		int k=0;      
		     
		  j=b/2;      
		  
		  if(b==0||b==1){  
		   System.out.println(b+" is not prime number");      
		  
		  }else{  
		   for(i=2;i<=j;i++){      
			   if(b%i==0){      
		     System.out.println(b+" is not prime number");      
		     
		     k=1;      
		     break;      
		    }      
		   }      
		   if(k==0)  { System.out.println(b+" is a prime number"); }  
		  } 
		}    
		}   
	
