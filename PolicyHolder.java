public class PolicyHolder
{  //fields
 private String firstName;
 private String lastName;
 private int age;
 private String smokingStatus;
 private double height;
 private double weight;
 
 /**
 Constructor that accepts arguments for each field
 @param fName The Policyhodler's first name
 @param lName The Policyholder's last name
 @param a The Policyholder's age
 @param sStatus The Policyholder's smoking status
 @param h The Policyholder's height
 @param w The Policytholder's weight
 */
 public PolicyHolder( String fName, String lName,int a, String sStatus, double h, double w)
 {
    firstName = fName;
    lastName = lName;
    age = a;
    smokingStatus = sStatus;
    height = h;
    weight = w;
 }
 /*The copy constructor creates a copy of the PolicyHolder class that it is passed as a parameter.
   We use this to avoid secuirty holes.  See Chapter 7 for more information about this.
   @param object2 - the object to copy
 */
 public PolicyHolder(PolicyHolder object2)
 {
    firstName = object2.firstName;
    lastName = object2.lastName;
    age = object2.age;
    smokingStatus = object2.smokingStatus;
    height = object2.height;
    weight = object2.weight;
 }

 //getters//
   
 /**
 @return The Policyholder's first name
 */
 public String getFirstName()
 {
    return firstName;
 }
 
 /**
 @return The Policyholder's last name
 */
 public String getLastName()
 {
    return lastName;
 }
 
 /**
 @return The Policyholder's age
 */
 public int getAge()
 {
    return age;
 }
 
 /**
 @return The Policyholder's smoking status
 */
 public String getSmokingStatus()
 {
    return smokingStatus;
 }
 
 /**
 @return The Policyholder's height
 */
 public double getHeight()
 {
    return height;
 }
 
 /**
 @return The Policyholder's weight
 */
 public double getWeight()
 {
    return weight;
 }
 
 //setters//
    
 /**
 @param fName The Policy Holder's first name
 */
 public void setFirstName(String fName)
 {
    firstName = fName;
 }
 
 /**
 @param lName The Policy Holder's last name
 */
 public void setLastName(String lName)
 {
    lastName = lName;
 }
 
 /**
 @param a The Policy Holder's age
 */
 public void setAge(int a)
 {
    age = a;
 }
 
 /**
 @param sStatus The Policy Holder's smoking status
 */
 public void setSmokingStatus(String sStatus)
 {
    smokingStatus = sStatus;
 }
 
 /**
 @param h The Policy Holder's height
 */
 public void setHeight(double h)
 {
    height = h;
 }
 
 /**
 @param w The Policy Holder's weight
 */
 public void setWeight(double w)
 {
    weight = w;
 }
 
 /**
 Calculates the Policyholder's BMI
 @return The BMI of the Policy holder
 */
 public double getBMI()
 {
    final double CONVFACTOR = 703;
    
    return (weight * CONVFACTOR) / (height * height);
 }

  /**
    toString method
    @return - A string containing the policyHolder information
*/ 
 @Override
 public String toString() {
 	return    "\nPolicyholder's FirstName:" + firstName 
 			+ "\nPolicyholder's LastName:" + lastName 
 			+ "\nPolicyholder's Age:" + age 
 			+ "\nPolicyholder's Smoking Status (Y/N):"+ smokingStatus 
 			+ "\nPolicyholder's Height:" + height 
 			+ "\nPolicyholder's Weight:" + weight;
 }
  
  

 
}