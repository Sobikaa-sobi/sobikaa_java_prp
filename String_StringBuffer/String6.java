import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int lena = a.length();
		int lenb = b.length();
		if(lena>lenb) {
			System.out.println(b+a+b);
		}
		else {
			System.out.println(a+b+a);
		}
	}

}
