public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder; //Instance of the PolicyHolder class
   private static int noOfPolicies=0; // static field to keep track of no of policies


  /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   @param holder- PolicyHolder object   */
   public Policy(String pNumber, String pName, PolicyHolder holder)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyHolder = new PolicyHolder(holder);//we use the copy contructor of the PolicyHolder class to avoid security holes
      noOfPolicies++;
      
   }
   
   //getters//
   /**
   @return The Policy Number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   @return The Policy Provider's Name
   */
   public String getProviderName()
   {
      return providerName;
   }
    /**
      getPolicyHolder method
      @return - return a reference to a copy of this Policy's PolicyHolder  object
  */

   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }
   
    /**
      getNoOfPolicies static method
      @return - return the number of policies generated  */

   public static int getNoOfPolicies() {
		return noOfPolicies;
	}


      //setters//
   
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
   @param pName The Policy Provider's name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
     /**
      @param holder - a PolicyHolder object  
   */  
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }

   
  /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policy holder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (policyHolder.getWeight() * CONVFACTOR) / (policyHolder.getHeight() * policyHolder.getHeight());
   }
   
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(policyHolder.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(policyHolder.getBMI() > BMI_THRESHOLD)
         price += ((policyHolder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }




    /**
      toString method
      @return - A string containing the course information
  */ 
      
  /** We make use of the String.format method to format the policy holder BMI
   *  and the policy price. See Chapter 3 for information about this method.*/
  
   @Override
   public String toString() {
   	return "Policy Number:" + policyNumber 
   			+ "\nProvider Name:" + providerName 
   			+ policyHolder.toString()
   			+ String.format("\nPolicyholder's BMI:%.2f" ,getBMI())
   			+ String.format("\nPolicy Price: $%.2f", getPrice());
   			
   }


  //  //Displays information about the Policy
//    public void displayInformation()
//    {
//       System.out.println("Policy Number: " + policyNumber);
//       System.out.println("Provider Name: " + providerName);
//       System.out.println("Policyholder's First Name: " + policyHolder.getFirstName());
//       System.out.println("Policyholder's Last Name: " + policyHolder.getLastName);
//       System.out.println("Policyholder's Age: " + age);
//       System.out.println("Policyholder's Smoking Status (Y/N): " + policyHolder.getSmokingStatus);
//       System.out.println("Policyholder's Height: " +policyHolder.getHeight() + " inches");
//       System.out.println("Policyholder's Weight: " + policyHolder.getweight() + " pounds");
//       System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
//       System.out.printf("Policy Price: $%.2f\n", getPrice());
//    }
  
}