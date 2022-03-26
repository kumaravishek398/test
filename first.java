import java.util.Scanner;
class first
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter your age");
		int age =sc.nextInt();

		if (age>20)
		
			System.out.println("you can marry");
		else
			System.out.println("control yourself");
		
	}
}
