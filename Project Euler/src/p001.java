
public class p001 {

	public static void main(String[] args) {
		int max = 1000;
		int uitkomst = 0;
		
		for(int teller = 0; teller < max; teller ++) {
			if(teller % 3 == 0 || teller % 5 == 0) {
				uitkomst += teller;
			}
		}
		System.out.println(uitkomst);
	}
}
