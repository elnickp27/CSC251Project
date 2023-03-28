public class Policy
{
   private int policyNumber;
   private String policyHolderFirstName;
   private String policyHolderLastName;
   private int policyHolderAge;
   private String policyHolderSmokingStatus; // Either "smoker" or "non-smoker"
   private double policyHolderHeight; // The height of the policy holder in inches
   private double policyHolderWeight; // The weight of the policy holder in pounds
   private String providerName;
   
   
   /** 
      Default constructor, will set all of the fields to the default empty value
   */
   public Policy() 
   {
      policyNumber = 0;
      policyHolderFirstName = "";
      policyHolderLastName = "";
      policyHolderAge = 0;
      policyHolderSmokingStatus = "non-smoker";
      policyHolderHeight = 0.00;
      policyHolderWeight = 0.00;
      providerName = "";
   }
   
   /**
      The actual constructor, when inputted with all of the values, will create a Policy object with set fields
      @param policyNum The policy number
      @param firstName The policy holder's first name
      @param lastName The policy holder's last name
      @param age The policy holder's age
      @param smokingStatus The policy holder's smoking status
      @param height The policy holder's height
      @param weight The policy holder's weight
      @param providerName The provider's name
   */
   public Policy(int policyNum, String firstName, String lastName, int age, String smokingStatus, double height, double weight, String providerName) 
   {
      policyNumber = policyNum;
      policyHolderFirstName = firstName;
      policyHolderLastName = lastName;
      policyHolderAge = age;
      policyHolderSmokingStatus = smokingStatus;
      policyHolderHeight = height;
      policyHolderWeight = weight;
      providerName = providerName;
   }
   

   public void setPolicyNumber(int policyNum)
   {
      policyNumber = policyNum;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }


   public void setPolicyHolderFirstName(String firstName)
   {
      policyHolderFirstName = firstName;
   }
   
   public String getPolicyHolderFirstName()
   {
      return policyHolderFirstName;
   }
   
   
   public void setPolicyHolderLastName(String lastName)
   {
      policyHolderLastName = lastName;
   }
   
   public String getPolicyHolderLastName()
   {
      return policyHolderLastName;
   }
   
   
   public void setPolicyHolderAge(int age)
   {
      policyHolderAge = age;
   }
   
   public int getPolicyHolderAge()
   {
      return policyHolderAge;
   }
   
   
   public void setPolicyHolderSmokingStatus(String smokingStatus)
   {
      policyHolderSmokingStatus = smokingStatus;
   }
   
   public String getPolicyHolderSmokingStatus()
   {
      return policyHolderSmokingStatus;
   }
   
   
   public void setPolicyHolderWeight(double weight )
   {
      policyHolderWeight = weight;
   }
   
   public double getPolicyHolderWeight()
   {
      return policyHolderWeight;
   }
  
   
   public void setPolicyHolderHeight(double height)
   {
      policyHolderHeight = height;
   }
   
   public double getPolicyHolderHeight()
   {
      return policyHolderHeight;
   }
   
   
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   
   public double getPolicyHolderBMI()
   {
      return ((policyHolderWeight * 703)/Math.pow(policyHolderHeight, 2));
   }
   
   public double getPolicyPrice()
   {
      double fee = 600.00;
      
      if (policyHolderAge > 50) {
         fee += 75;
      }
      if (policyHolderSmokingStatus.equals("smoker")) {
         fee += 100;
      }
      if (getPolicyHolderBMI() > 35) {
         fee += ((getPolicyHolderBMI() - 35) * 20);
      }
      return fee;
   }
}