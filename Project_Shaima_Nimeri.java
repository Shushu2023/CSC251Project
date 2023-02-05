import java.util.Scanner;

public class Project_Shaima_Nimeri {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Please enter the Policy Number:");
        String policyNumber=keyboard.nextLine();
      
        System.out.print("Please enter the Provider Name:");
	    String providerName = keyboard.nextLine();
	   
	    System.out.print("Please enter the Policyholder’s First Name:");
	    String firstName = keyboard.nextLine();
	   
	    System.out.print("Please enter the Policyholder’s Last Name:");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter the Policyholder’s Age:");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker):");
	    String smokingStatus = keyboard.nextLine();
	    
	    System.out.print("Please enter the Policyholder’s Height (in inches): ");
	    double height = keyboard.nextDouble();
	    
	    System.out.print("Please enter the Policyholder’s Weight (in pounds):");
	    double weight = keyboard.nextDouble();
	    Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
	    double bmi =policy.calculateBMI();
	    double policyPrice = policy.calculateInsurancePolicyPrice();
	    
	    System.out.println("Policy Number:"+policyNumber);
	    System.out.println("Provider Name:"+ providerName);
	    System.out.println("Policyholder’s First Name:"+firstName);
	    System.out.println("Policyholder’s Last Name: "+lastName);
	    System.out.println("Policyholder’s Age: "+age);
	    System.out.println("Policyholder’s Smoking Status"+smokingStatus);
	    System.out.println("Policyholder’s Height:"+height+" inches");
	    System.out.println("Policyholder’s Weight: "+weight+" pounds");
	    System.out.printf("Policyholder’s BMI:%.2f\n",bmi);
	    System.out.printf("Policy Price: $%.2f",policyPrice);
	
	} 

}
