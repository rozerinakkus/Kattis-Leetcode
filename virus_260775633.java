import java.util.Scanner;

public class virus_260775633{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		scan.close();
		
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2  =new StringBuilder(str2);
		
		int i = 0;
		 while((sb1.length()!= i && sb2.length() != i) && sb1.charAt(i) == sb2.charAt(i)){
			 i++;
		 }
		 
		 sb1.delete(0, i);
		 sb2.delete(0, i);
		 
		 while((sb1.length()!= 0 && sb2.length() != 0) && sb1.charAt(sb1.length()-1) == sb2.charAt(sb2.length()-1)) {
			 sb1.deleteCharAt(sb1.length()-1);
			 sb2.deleteCharAt(sb2.length()-1);
		 }
		 
		 System.out.println(sb2.length());
		 
		 
		 
		 }}
