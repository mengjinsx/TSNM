
public class Possion {
public static void main(String[] args) {
	double total = 0.0;
 for(int i=0; i<8; i++){
	 double temp = Possion.possion(i);
	 if(i<=5){
		 total += temp;
	 }
	 System.out.println(temp);
 }
 System.out.println(total);
 System.out.println((1-total));
 System.out.println(1/(1-Possion.possion(2)));
 System.out.println(1/(1-0.947));
 System.out.println(Math.pow(0.8, 3));
}
public static double possion(int k){
	double result;
	result = Math.pow(Math.E,-2)*Math.pow(2, k)/factorial(k);	
	return result;
}
public static double factorial(int n) {  
     
        double result = 1.0;  
        for (int i = 1; i <= n; i++) {  
            result *= i;  
        }  
        return result;  
    }  
  
}
