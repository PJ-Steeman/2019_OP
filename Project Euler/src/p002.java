
public class p002 {

	public static void main(String[] args) {
		int max = 4000000;
		int uitkomst = 2;
		int teller = 3;
		int teller1 = 2;
		int teller2 = 1;
		
		
		while(teller < max) {
			if(teller%2 == 0) {
				uitkomst += teller;
			}
			teller2 = teller1;
			teller1 = teller;
			teller = teller1+teller2;
		}
		System.out.println(uitkomst);
	}
}
