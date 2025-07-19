public class SerieFibonacci{
	public static int fibo(int x){
		if (x>2) {
			return fibo(x-1)+fibo(x-2);
		} else {
			return 1;
		}	
	}
	public static void main(String[] args) {
		System.out.println(fibo(2));	
	}

}

