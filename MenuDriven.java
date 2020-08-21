import java.util.Scanner;
public class MenuDriven {
    public static void main(String ay[]) throws Exception {
	char repeat;
        Scanner scan = new Scanner(System.in);
     do{
        System.out.println("\t MENU ");
        System.out.println("\t[+]ADDITION ");
        System.out.println("\t[-]SUBTRACTION ");
        System.out.println("\t[*]MULTIPLICATION");
        System.out.println("\t[/] DIVISION  ");
        System.out.println("what u want to perform");
        char c = scan.next().charAt(0); 
        System.out.println("enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        switch (c) {
            case '+':
                result = a + b;
		System.out.println("Result=" + result);
                break;
            case '-':
                result = a - b;
		System.out.println("Result=" + result);
                break;
            case '*':
                result = a * b;
		System.out.println("Result=" + result);
                break;
            case '/':
                result = a / b;
		System.out.println("Result=" + result);
                break;
	    default:
                System.out.printf("Invalid Operation");
        }//end of switch
 	
System.out.println("\n Do you want continue(y/n)");
repeat=scan.next().charAt(0);//single character input
}while(repeat=='y');

}
}

