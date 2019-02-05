import java.util.Scanner;
public class Recursion{

public static int factorial(int n){

	if(n == 0){return 1;}
	return n*factorial(n-1);
}

public static int sumZeroToN(int n){
	int factor = 0;	
	if(n<0){factor = -1;}
	else{factor = 1;}
	n = Math.abs(n);
	if(n == 1){return 1;}
	return factor*(n + sumZeroToN(n-1));

}

public static int sumAtoB(int a, int b){
	
	if(b == a){return a;}
	return b + sumAtoB(a,b-1);

}

public static int sumDigits(int n){

	int result = 0;
	while(n/10 != 0){
		result += n % 10;
		n = n / 10;
	}
	return result + n;
}

public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Here are all the functions: ");
	System.out.println("1) SumDigit1: Summing Digits with a while loop");
	System.out.println("2) factorial: Find factorial of an Integer");
	System.out.println("Enter a valid function name: ");
	String func = in.nextLine();
	if(func.equals("factorial")){
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		System.out.println("The answer is : " + factorial(n));
	}
	else if(func.equals("ZeroSum")){
		int n = in.nextInt();
		System.out.println(sumZeroToN(n));
	}
	else if(func.equals("SumDigit1")){
		System.out.println("Enter a number: ");
		int n = in.nextInt();
		System.out.println("The answer is : " + sumDigits(n));
	}
	else{System.out.println("Invalid Input");}
	in.close();
	
}
}
	
