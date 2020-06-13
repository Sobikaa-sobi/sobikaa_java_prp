public class FlowExample7{
	public static void main(String args[]){
		char letter='A';
		if(letter>=65 && letter<=90){
			System.out.println(letter+"->"+(char)(letter+32));
		}
		else if(letter>=97 && letter<=122){
			System.out.println(letter+"->"+(char)(letter-32));
		}
	}
}