import java.util.Scanner;

public class Project_Nick_Petterson
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Policy examplePolicy = new Policy();
       
      System.out.print("Please enter the Policy Number: ");
      examplePolicy.setPolicyNumber(keyboard.nextInt());
      
      System.out.print("\nPlease enter the Provider Name: ");
      examplePolicy.setProviderName(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      examplePolicy.setPolicyHolderFirstName(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      examplePolicy.setPolicyHolderLastName(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      examplePolicy.setPolicyHolderAge(keyboard.nextInt());
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      examplePolicy.setPolicyHolderSmokingStatus(keyboard.nextLine());
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      examplePolicy.setPolicyHolderHeight(keyboard.nextDouble());
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      examplePolicy.setPolicyHolderWeight(keyboard.nextDouble());
      
      
      System.out.println("\nPolicy Number: " + examplePolicy.getPolicyNumber());
      System.out.print("\nProvider Name: " + examplePolicy.getProviderName());
      System.out.print("\nPolicyholder's First Name: " + examplePolicy.getPolicyHolderFirstName());
      System.out.print("\nPolicyholder's Last Name: " + examplePolicy.getPolicyHolderLastName());
      System.out.print("\nPolicyholder's Age: " + examplePolicy.getPolicyHolderAge());
      System.out.print("\nPolicyholder's Smoking Status: " + examplePolicy.getPolicyHolderSmokingStatus());
      System.out.print("\nPolicyholder's Height: " + examplePolicy.getPolicyHolderHeight());
      System.out.print("\nPolicyholder's Weight: " + examplePolicy.getPolicyHolderWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", examplePolicy.getPolicyHolderBMI());
      System.out.printf("\nPolicyholder's Price: $%,.2f" + examplePolicy.getPolicyPrice());
   }
}