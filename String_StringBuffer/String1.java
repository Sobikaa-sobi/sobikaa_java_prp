import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer sb=new StringBuffer(str);
		String str2=sb.reverse().toString();
		if(str.equals(str2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
