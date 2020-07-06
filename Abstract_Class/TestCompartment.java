import java.util.*;

public class TestCompartment {

	public static void main(String[] args) {
		FirstClass f=new FirstClass();
		Ladies l=new Ladies();
		General g=new General();
		Luggage lu=new Luggage();
		int a[] = new int[10];
		Random r=new Random();
		for(int i=0;i<10;i++) {
			a[i]=r.nextInt((4-1)+1)+1;
			if(a[i] == 1){
				System.out.println(f.notice());
			}
			if(a[i] == 2){
				System.out.println(l.notice());
			}
			if(a[i] == 3){
				System.out.println(g.notice());
			}
			if(a[i] == 4){
				System.out.println(lu.notice());
			}
		}
	}

}
