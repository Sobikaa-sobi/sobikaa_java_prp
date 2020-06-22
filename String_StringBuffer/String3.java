import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		String a = str.substring(0, 2);
		while(len>0){
			System.out.print(a);
			len--;
		}
	}
}
