public class fibonacci {

	static void fillAux(long aux[]) { 
		for (int i = 0; i < aux.length; i++) aux[i] = -1; 
	} 
	  
	static long fibRec(int n,long aux[]) { 
	    if (aux[n] == -1) { 
	      if (n <= 1) aux[n] = n; 
	      else aux[n] = fibRec(n-1,aux) + fibRec(n-2,aux); 
	    } 
	    return aux[n]; 
	} 
	static long fib(int n) {
		long aux[] = new long[n+1];
		fillAux(aux);
		return fibRec(n,aux);
	}
	public static void main(String[] args) { 
		int num = 0;
		System.out.println(fib(num));
	} 
}