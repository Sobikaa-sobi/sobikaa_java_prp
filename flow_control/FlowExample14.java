public class FlowExample14{
	public static void main(String args[]){
		String s=args[0];
		int sum=0;
		int[] num = new int[s.length()];
		for (int i = 0; i < s.length(); i++){
        		num[i] = s.charAt(i) - '0';
    		}
		for(int j=0;j<s.length();j++){
			sum=sum+num[j];
		}
		System.out.println(sum);
	}
}