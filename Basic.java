package learning;
import java.util.Scanner;

public class Basic {
	
	int[] x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Basic obj1 = new Basic();
		Scanner s = new Scanner(System.in);
		System.out.println("enter number of objects : ");
		int a = s.nextInt();
		
		for(int i=0;i<a;i++) {
			obj1.x[i]=i+1;
		}
		
		System.out.println(obj1.x);

	}

}
