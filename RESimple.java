import java.util.regex.*;
import java.util.Scanner;
/**
* Simple example of using regex class.
*/
public class RESimple {
	public String processInput(String theInput){
                Scanner stdIn = new Scanner(System.in);
                boolean found;
                String fromUser=null;
		if (theInput.equals("Welcome to the Register, Please Enter Your Student Number")) {
                do{
                	fromUser = stdIn.nextLine();
                	String pattern = "[0-9]+";
					found = fromUser.matches(pattern);
               		if(found == false){
                    	System.out.println("Please enter numbers\n");
                	}
            	}while(found==false);
        } 
        else if (theInput.equals("We have received your Student Number, Now enter your name")) {
        	do{
                	fromUser = stdIn.nextLine();
                	String pattern = "[A-Za-z ]+";
					found = fromUser.matches(pattern);
               		if(found == false){
                    	System.out.println("Please enter alphabets\n");
                	}
            	}while(found==false);
        } 
        else if (theInput.equalsIgnoreCase("We have received your Student Name, Press y to continue n to end")) {
				fromUser = stdIn.nextLine();
		}
		return fromUser;
	}
}