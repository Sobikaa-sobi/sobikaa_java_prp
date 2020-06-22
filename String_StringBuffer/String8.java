import java.util.Scanner;

public class String8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		StringBuffer sb=new StringBuffer(str1);
		int i=sb.indexOf("*");
		System.out.println(sb.delete(i-1,i+2));
	}

}
