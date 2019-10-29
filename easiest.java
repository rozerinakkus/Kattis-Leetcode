import java.util.Scanner;

//Rozerin Akkus 260775633

public class easiest {
	public static void main (String [] args) {
		
		//Scanner to get user input
		Scanner myObj = new Scanner(System.in);  
		while(true) {
			//getting the number N
			int num = myObj.nextInt();
			
			//program ends if input is zero
			if(0 == num) {
				myObj.close();
				break;
			}
			
			//a temp variable to make changes on the num
			//a sum variable to find the sum of digits
			int temp = num, sum = 0;
			//continue dividing by 10 and summing the remainders until the temp/10 = 0 to find the sum of the digitd
			while(0 != temp) {
				sum += temp % 10;
				temp /= 10;
			}
			//the multiplied number must be greater than 10
			//start looping from 11 to find the smallest number i which gives the same sum when multiplied by num
			for(int i = 11; ; i++) {
				int mul = num * i, sumMul = 0;
				
				//same loop to find the sum of i*num
				while(0 != mul) {
					sumMul += mul % 10;
					mul /= 10;
				}
				
				// if sum of digits of i*num is equal to the sum of digits of the user's input, print i and break.
				if(sum == sumMul) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}