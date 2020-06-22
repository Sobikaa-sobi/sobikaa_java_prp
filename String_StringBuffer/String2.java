import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next().toLowerCase();
		String str2=sc.next().toLowerCase();
		if((str1.charAt(str1.length()-1))==(str2.charAt(0))) {
			System.out.println(str1+str2.substring(1));
		}
		else {
			System.out.println(str1+" "+str2);
		}
	}

}
