package P1;
import java.util.Scanner;

public class main_code {
   
	public static void main (String[] args) {
		Scanner Sc = new Scanner(System.in);
		//ask the users how many password do they want and the length of the password 
		System.out.print("how many random passwords do you want? ");
		int total = Sc.nextInt();
		System.out.print("how many random characters long do you want? ");
		int length = Sc.nextInt();
		
		//create array to store random passwords
		String[]  randompassword = new String[total];
		
		// loop through total  number  of password
		for (int i =0; i< total;i++) {
			//generate one random password
			String randompassword1 = " ";
			for( int j =0;j<length;j++) {
				//generate one random character
				randompassword1 += randomCharacter();
			}
			//add a random password to an array
			randompassword[i] = randompassword1;
		}
		
		//print our array of password
		printpasswords(randompassword);
		//print our password strength
		System.out.println(getpasswordstrength(length));
	}
	public static String getpasswordstrength(int length) {
		if(length <5) {
			return " password strength : weak";
		}else if(length < 10 ) {
			return "  password strength : medium";
		}else {
			return " password strength : strong";
		}
	}
	 public static void printpasswords(String[] arr) {
		 for(int i = 0 ;i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
	 }
	        //0-9 48-57 in ASCII
			//A-Z 65-98 in ASCII
			//a - z 97-122 in ASCII
	public static char randomCharacter() {
		//generate  a random number  that  represents  all  possiable characters  in our password
		//10 digits + 26 uppercase + 26  lowercase Total = 62 possiable character
		int rand = (int)(Math.random()*62);
		//break rand into intervals to represent  numbers,uppercase,lowercase
		if(rand<=9) {
			//numbers 0-9 ==>48-57
			int ascii = rand + 48;
			return (char)(ascii);
		}else if(rand <=35)
		{
			//uppercase letters : 10- 35==>65-98
			int ascii = rand + 55; //65 - 10 = 55
			return (char)(ascii);
		}else {
			//lowercase : 36 - 61 ==>97-122
			int ascii = rand + 61; //97 - 36 =61
			return (char)(ascii);
		}
		
	}
}
