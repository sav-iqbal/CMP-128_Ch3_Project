/*
   Author: Savaas Iqbal
   Purpose: This program allows the user to award ponts to customers based on books purchased each month
            This program displays the amount of discount and total amount of purchase when ordering packages
            This program asks the user to enter "air", "water", or "steel" and the distance the sound wave will travel the medium
   Date: 10/3/2022
*/
import java.util.Scanner; 

public class Ch3Project {
   public static void main (String [] args){
      Scanner keyboard = new Scanner(System.in); //Scanner Object
      //Book Club Points
      System.out.println("Enter the number of books you have purchased this month.");
      int books; 
      int points; 
      
      String booksStr = keyboard.nextLine(); // reads in number of books 
      books = Integer.valueOf(booksStr); // convert to int
      if (books == 0) {
         points = 0; 
      }
      
      else if (books == 1) {
         points = 5; 
      }
      
      else if (books == 2) {
         points = 15; 
      } 
      
      else if (books == 3) {
         points = 30; 
      } 
      
      else if (books >= 4){
         points = 60; 
      }
      
      else { //in case user doesn't enter valid number 
         System.out.println("You have not entered a valid number of books. You receive 0.");
         points = 0; 
      }
      System.out.println("You have purchashed " + books + " books in the last month. \nYou have earned " + points + " points.");
      //Software Sales
      System.out.println("***\nEnter the number of packages purchased.");
      String numPackageStr = keyboard.nextLine(); // read in number of packages
      double numPackage = Integer.valueOf(numPackageStr); // convert to int
      double packageCost = 99 * numPackage; // cost of all the packages
      double discount = 0; 
      
      if (numPackage >= 10 && numPackage <= 19) {
        discount = 20; 
      }
      
      else if (numPackage >=20 && numPackage <= 49){
         discount = 30; 
      }
      
      else if (numPackage >=50 && numPackage <= 99) {
         discount = 40; 
      }
      
      else if (numPackage >= 100){
         discount = 50; 
      }
      
      else {
         discount = 0; 
      }
      double totalPurchase = packageCost * (100-discount) / 100; //total cost w/ discount factored
      System.out.println("The amount of discount is " + discount + "% off. \nThe total amount of the purchase is now $" + totalPurchase); 
      
      //The Speed of Sound 
      System.out.println("***\nEnter which medium sound will travel through: air (A), water (W), or steel (S). "); 
      String input = keyboard.nextLine(); //store medium
      System.out.println("Enter the distance the sound wave will travel."); 
      String distanceStr = keyboard.nextLine(); //store distance
      double distance = Double.parseDouble(distanceStr); //convert distance to double
      
      double time = 0; 
      char medium = input.toUpperCase().charAt(0); // uppercase all entered value, take first letter
      String mediumName= ""; 
      switch (medium){
         case 'A' : time = distance / 1100; mediumName = "air";  
            break;
         case 'W' : time = distance / 4900; mediumName = "water"; 
            break; 
         case 'S' : time = distance / 16400; mediumName = "steel";
            break; 
      }
      System.out.println("It will take " + time + " seconds for sound to travel through " + mediumName + "."); 
   }
}     
      
      
/*Output
  
   Enter the number of books you have purchased this month.
 2
 You have purchashed 2 books in the last month. 
 You have earned 15 points.
 ***
 Enter the number of packages purchased.
 5
 The amount of discount is 0.0% off. 
 The total amount of the purchase is now $495.0
 ***
 Enter which medium sound will travel through: air (A), water (W), or steel (S). 
 s
 Enter the distance the sound wave will travel.
 200
 It will take 0.012195121951219513 seconds for sound to travel through steel.
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Ch3Project
 Enter the number of books you have purchased this month.
 3
 You have purchashed 3 books in the last month. 
 You have earned 30 points.
 ***
 Enter the number of packages purchased.
 5
 The amount of discount is 0.0% off. 
 The total amount of the purchase is now $495.0
 ***
 Enter which medium sound will travel through: air (A), water (W), or steel (S). 
 A
 Enter the distance the sound wave will travel.
 2200
 It will take 2.0 seconds for sound to travel through air.
 
  ----jGRASP: operation complete.
 
  
  
  */
