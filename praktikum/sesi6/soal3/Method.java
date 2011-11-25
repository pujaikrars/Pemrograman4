import java.util.Scanner;
public class Method{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Person person0object = new Person();
		System.out.println("enter your name here: ");
		String name = input.nextLine();
		
		person0object.simpleMessage(name);
	}
}