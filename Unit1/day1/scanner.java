import java.util.Scanner;
public class scanner
{
    public static void main(String[] args)
    {
        String name;
        Scanner input=new Scanner(System.in);       		//Read input from keyboard
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println("Name is: "+name);

        String workPlace="PESU Bangalore";

        Scanner scan=new Scanner(workPlace);          	//Read input from String
        scan.useDelimiter(",");
        System.out.println("Works at: "+scan.next());
    }
}
