import java.util.*;
class addition{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		int value1, value2, answer;
		System.out.println("Enter the first number: ");
		value1 = sc.nextInt();
		System.out.println("Enter the Second number: ");
		value2 = sc.nextInt();

		answer = value1+value2;

		System.out.println("The addition of "+value1+ " and "+value2+" is "+answer);

		
	 
	}
}