import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int n=sc.nextInt();
		int l=str1.length();
		for(int i=0;i<n;i++) {
			System.out.print(str1.substring(l-n));
		}
	}

}
