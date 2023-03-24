import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
       //we also need to gather information about the PolicyHolder for the Policy

         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
            
         //now we create out PolicyHolder object using the information we gathered
         PolicyHolder myPolicyHolder = new PolicyHolder(firstName, lastName, age,smokingStatus, height,weight);

            
         //create a Policy object and add it to our ArrayList
         policyList.add(new Policy(policyNumber, providerName, myPolicyHolder));
      
      }
      
      //print out information about each Policy object
      for(int i =0; i<policyList.size(); i++)
      { 
         //display information about the Policy
//         System.out.println("Policy Information:");
         System.out.println(policyList.get(i));//notice how the toString() method does not need to be explicitly called when printing out information of our Course class
         System.out.println();//print a blank line between Courses for easier readability
        //  
//            if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
//            numSmokers++;
      }
      
      //print out the number of smokers and non-smokers
      //  System.out.println("The number of policies with a smoker is: " + numSmokers);
//        System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   }
}
