public class Policy {
	
	private String policyNumber = null;
	private String providerName= null;
	private String policyHolderFirstName= null;
	private String policyHolderLastName= null;
	private int age= 0;
	private String smokingStatus= null;
	private double  policyHolderHeight= 0;
	private double policyHolderWeight= 0;
	
	public Policy() {
	
	}

	public Policy(String policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
			int age, String smokingStatus, double policyHolderHeight, double policyHolderWeight) {
		
		this.policyNumber = policyNumber;
		this.providerName = providerName;
		this.policyHolderFirstName = policyHolderFirstName;
		this.policyHolderLastName = policyHolderLastName;
		this.age = age;
		this.smokingStatus = smokingStatus;
		this.policyHolderHeight = policyHolderHeight;
		this.policyHolderWeight = policyHolderWeight;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getPolicyHolderFirstName() {
		return policyHolderFirstName;
	}

	public void setPolicyHolderFirstName(String policyHolderFirstName) {
		this.policyHolderFirstName = policyHolderFirstName;
	}

	public String getPolicyHolderLastName() {
		return policyHolderLastName;
	}

	public void setPolicyHolderLastName(String policyHolderLastName) {
		this.policyHolderLastName = policyHolderLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSmokingStatus() {
		return smokingStatus;
	}

	public void setSmokingStatus(String smokingStatus) {
		this.smokingStatus = smokingStatus;
	}

	public double getPolicyHolderHeight() {
		return policyHolderHeight;
	}

	public void setPolicyHolderHeight(double  policyHolderHeight) {
		this.policyHolderHeight = policyHolderHeight;
	}

	public double  getPolicyHolderWeight() {
		return policyHolderWeight;
	}

	public void setPolicyHolderWeight(double policyHolderWeight) {
		this.policyHolderWeight = policyHolderWeight;
	}
   /**
      The calculateBMI method calculates the policy holder weight and 
      returns the bmi of the policy holder
      @return policy holder BMI
     
   */
	public double calculateBMI() {
		
		double bmi = (this.policyHolderWeight*703)/Math.pow(this.policyHolderWeight,2);
		return bmi;
	}
   /**
      The calculateInsurancePolicyPrice method calculates the insurace policy price
      and returns the price of the insurance policy
      @return The price of the insuralnce policy
   */

	public double calculateInsurancePolicyPrice() {
		double price =0;
		int baseFee = 600;
		
		if(this.age>50)
		{	
			price = baseFee+75;
		}
		
		if(this.smokingStatus.equals("Smoker")) 
		{
			price = baseFee+100;
		}
		
		if(this.calculateBMI()>35) {
			price = baseFee + ((this.calculateBMI()-35)*20);
		}
		return price;
	}
	

}