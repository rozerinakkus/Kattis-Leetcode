import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class cetvrta {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> xAxis = new ArrayList<>();
		ArrayList<Integer> yAxis = new ArrayList<>();

		for(int i=0; i<3; i++) {
			StringTokenizer line = new StringTokenizer(scan.nextLine());
			 Integer x = Integer.parseInt(line.nextToken());
			 Integer y=  Integer.parseInt(line.nextToken());
			if((xAxis.contains(x)) || (yAxis.contains(y))) {
				if(xAxis.contains(x) && yAxis.contains(y)) {
					xAxis.remove(x);
					yAxis.remove(y);
				}
				else if(xAxis.contains(x) && !(yAxis.contains(y)) ) {
					xAxis.remove(x);
					yAxis.add(y);
				}
				else if(yAxis.contains(y)  && !(xAxis.contains(x)) ) {
					yAxis.remove(y);
					xAxis.add(x);
				}
			}
			else {
				xAxis.add(x);
				yAxis.add(y);
			}
		}
		scan.close();
		System.out.println(xAxis.get(0)+" "+ yAxis.get(0));
	}
}
