import java.util.ArrayList;
import java.util.Scanner;


public class Q10502 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cs = input.nextInt();
		while(cs-- > 0){
			int n = input.nextInt();
			if(n < 10){
				System.out.println(n);
			}
			else{
				if(is_prime(n)){
					System.out.println("-1");
				}
				else{					
					ArrayList<Integer> factors = new ArrayList<Integer>();
					boolean is_possible = true;
					
					/*for(int i=2; i<=n; ++i){
						if((n%i==0) && (is_prime(i))){
							if(i > 9){
								is_possible = false;
								break;
							}
							while((n > 0) && (n % i == 0)){
								n = n / i;
								factors.add(i);
							}
						}
					}*/
					for(int i=9; i>1; --i){
						while((n > 0) && (n % i == 0)){
							n = n / i;
							factors.add(i);
						}
					}
					if(n > 10){
						System.out.println("-1");
					}
					else{
						StringBuffer Q = new StringBuffer(factors.toString().replaceAll("\\D", ""));												
						System.out.println(Q.reverse());
					}
					/*if(is_possible){
						String Q = factors.toString();
						Q = Q.replaceAll("\\D", "");
						System.out.println(Q);
					}
					else{
						System.out.println("-1");
					}*/
				}
			}
		}
	}
	public static boolean is_prime(int n){
		
		if(n < 2){
			return false;
		}
		for(int i=2; i*i<=n; ++i){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
