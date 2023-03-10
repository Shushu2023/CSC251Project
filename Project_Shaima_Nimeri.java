
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Project_Shaima_Nimeri {

	public static void main(String[] args)throws IOException {
				
		 String policyNumber ;     
       String providerName ;	   
		 String firstName;
	    String lastName;
       int age;
   	 String smokingStatus;	    
	  	 double height;
	    double weight;
       double bmi;
       double policyPrice;
       int smokers=0;
       int nonSmokers=0;
       File file = new File("policyInformation.txt");
       //MAKE SURE THE FILE EXISTS
		if(!file.exists()) 
		{
			System.out.println("Unable to locate file!");
			System.exit(0);// exit the program early
		}
       Scanner inputFile = new Scanner(file); // create a scanner object with the file as argument
	    while(inputFile.hasNext())
		 {
         policyNumber = inputFile.nextLine();
			providerName = inputFile.nextLine();
			firstName = inputFile.nextLine();
			lastName = inputFile.nextLine();
			age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         if(inputFile.hasNext())
			{
				inputFile.nextLine();//clear the new line
				inputFile.nextLine();//skip the blank line in the file
			}
         
         if(smokingStatus.equalsIgnoreCase("Smoker"))
         {
            smokers = smokers+1;
         }
         if(smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            nonSmokers = nonSmokers+1;
         }

         Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
	      bmi =policy.calculateBMI();
	      policyPrice = policy.calculateInsurancePolicyPrice();
         
         System.out.println("Policy Number:"+policyNumber);
	      System.out.println("Provider Name:"+ providerName);
	      System.out.println("Policyholder's First Name:"+firstName);
	      System.out.println("Policyholder's Last Name: "+lastName);
	      System.out.println("Policyholder's Age: "+age);
	      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): "+smokingStatus);
	      System.out.println("Policyholder's Height:"+height+" inches");
	      System.out.println("Policyholder's Weight: "+weight+" pounds");
	      System.out.printf("Policyholder's BMI:%.2f\n",bmi);
	      System.out.printf("Policy Price: $%.2f",policyPrice);
         System.out.println();
         System.out.println();
       }
     
       System.out.println();
       System.out.println("The number of policies with a smoker is:"+smokers);
       System.out.println("The number of policies with a non-smoker is:"+nonSmokers);	    
	    	
	} 

}
