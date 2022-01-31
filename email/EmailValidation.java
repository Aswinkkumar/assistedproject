package email;
import java.util.Scanner;

public class EmailValidation {
	
		public static void main(String[] args) {
			String arr[]= {"aswin543@gmail.com","sravan123@yahoo.com","jhon684@gmail.com","sharanya876@gmail.com",
					"ashely56@gmail.com","devika654@gmail.com","athul178@gmail.com","chacko@yahoo.com","gouri999@gmail.com","ashish346@gmail.com"};
				
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter your email id : ");
	    String str = sc.nextLine();
	    boolean flag = false;
        
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                System.out.println("Valid mail id " );
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Not found");
        }
    }
}
	 
		   
		
