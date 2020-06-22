import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		if(len%2==0) {
			System.out.println(str.substring(0, (len/2)));
		}
		else {
			System.out.println("null");
		}
	}

}
