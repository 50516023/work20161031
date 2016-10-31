package combination;

import java.util.Scanner;

public class Combination_main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Combination_lib clib = new Combination_lib();
		System.out.print("Input Number > ");
		int s= Integer.parseInt(scan.next());
		System.out.print("Input Number > ");
		int r= Integer.parseInt(scan.next());

		System.out.println(s+"C"+r+"="+clib.getFactorial(s)/(clib.getFactorial(r)*clib.getFactorial(s-r)));

	}
}
