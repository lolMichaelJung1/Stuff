//Michael Jung Period 6 11/29/22
class starter  {
	public static boolean checkPrime(int num1){
		int counter = 2;
		while (counter < num1){
			if (num1 % counter == 0){
				return false;
			}
			counter = counter + 1;
		}  	
		return true;
	} 
	public static void printPrimes(int num1){
		System.out.println(2);
		System.out.println(3);
		int counter = 5;
		while (counter < num1){
			if (checkPrime(counter)){
				System.out.println(counter);
			}
			if(counter%10==3){
				counter = counter +4;
			}
			else{
				counter = counter + 2;
			}
		}  
	}
	//hardcode 3 and 5
	public static boolean isPrime(int num){
		if ( num > 2 && num % 2 == 0 ) {
			System.out.println(num);
			return false;
		}
		int top = (int)Math.sqrt(num) + 1;
		if(num%3==0){
			return false;
		}
		for(int i = 7; i < top; i+=2){
			if(i%3==0 || i%5==0){
				continue;
			}
			if(num % i == 0){
				return false;
			}
		}
		System.out.println(num);
		return true; 
	}
	public static void pPrimes(int num1){
		int counter = 2;
		while (counter < num1){
			if (isPrime(counter)){
				System.out.println(counter);
			}
			counter = counter + 1;
		}  
	}
	public static void main(String args[]) {
		int x = 2147483647;
		int num1 = 2147483647;
		// printPrimes(num1);
		printPrimes(x);
		// System.out.println(3);
		// System.out.println(5);
		pPrimes(x);

	}
}