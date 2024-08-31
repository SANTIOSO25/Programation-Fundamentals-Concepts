import java.util.Scanner;
public class EscenaryTwoExcersiceOne {

    public static void main(String[] args) {
    	
    	// declaration of necesary variables
    	Scanner value = new Scanner(System.in);
    	long minimumLimit = -3000000000L;
    	long maximumLimit = 3000000000L;
    	long number;
    	int counter = 0;
    	
    	// capture in a variable a number typed from console
    	System.out.print("Type a number between -3000000000 and 3000000000: ");
    	number = value.nextLong();
    	
    	// evaluate the captured number for consider a successful entry or a wrong entry
    	while(number < minimumLimit || number > maximumLimit) {
    		System.out.print("You has wrong type a number. Please type a number between -3000000000 and 3000000000: ");
        	number = value.nextLong();
    	}
    	
    	// divide by 10 except the number 0
    	if(number == 0) {
    		counter = 1;
    	}else {
    		while(number < 0 || number > 0) {
    			number = number/10;
    			counter++;
    		}
    	}
    	
    	// program exit
    	System.out.println(counter);
    }
}