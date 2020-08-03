
public class p003 {

	public static void main(String[] args) {
		long value = 600851475143L;
		long counter = 2;
		while(true) {
			
		}
	}
	
	public boolean isPrime(long number) {
		for(long counter = 2; counter < number; counter++) {
			if(number%counter == 0) {
				return false;
			}
		}
		return false;
	}
}
