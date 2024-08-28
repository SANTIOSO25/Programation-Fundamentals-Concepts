import java.util.Scanner;
public class EscenaryOneExersiceNine {

	public static void main(String[] args) {
		
		Scanner value = new Scanner(System.in);
		
		// array declaration for save numbers
		int[] numbers = new int[5];
		
		// program entrances
		System.out.print("Type a integer: ");
		numbers[0] = value.nextInt();
		System.out.print("Type a integer: ");
		numbers[1] = value.nextInt();
		System.out.print("Type a integer: ");
		numbers[2] = value.nextInt();
		System.out.print("Type a integer: ");
		numbers[3] = value.nextInt();
		System.out.print("Type a integer: ");
		numbers[4] = value.nextInt();
		
		// program identifier for minimum number position
		int minimumNumber = 0;
		
		// use of ternary operator to identify the minimum number position
		minimumNumber += numbers[0] < numbers[1] && numbers[0] < numbers[2] && numbers[0] < numbers[3] && numbers[0] < numbers[4] ? 0 : 0;
		minimumNumber += numbers[1] < numbers[0] && numbers[1] < numbers[2] && numbers[1] < numbers[3] && numbers[1] < numbers[4] ? 1 : 0;
		minimumNumber += numbers[2] < numbers[0] && numbers[2] < numbers[1] && numbers[2] < numbers[3] && numbers[2] < numbers[4] ? 2 : 0;
		minimumNumber += numbers[3] < numbers[0] && numbers[3] < numbers[1] && numbers[3] < numbers[2] && numbers[3] < numbers[4] ? 3 : 0;
		minimumNumber += numbers[4] < numbers[0] && numbers[4] < numbers[1] && numbers[4] < numbers[2] && numbers[4] < numbers[3] ? 4 : 0;
		
		// program exit
		System.out.println("the minimum number is: " + numbers[minimumNumber]);
		
	}
}