import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		String b= sc.nextLine();
		StringBuilder sb = new StringBuilder(); 
	    for (int i = 0; i < a.length() || i < b.length(); i++) { 
	            if (i < a.length()) { 
	                sb.append(a.charAt(i)); 
	            }
	            if (i < b.length()) {
	                sb.append(b.charAt(i));
	            }
	    }
	    System.out.println(sb);
	}

}
