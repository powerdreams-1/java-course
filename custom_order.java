// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {

    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
     // System.out.println("Hello World!"); // print Hello World to console
        

    // TEST CODE
    
    // STEP 2 CREATE A SCANNER OBEJCT, DECLARE VARAIBLES, & PRINT STATEMENTS
	  
messages:


Scanner keyboard = new Scanner (System.in); 

String firstName; // User's first name
String itemOrder; // Item ordered
String frostingType; // Frosting ordered
String fillingType; // Filling ordered
String toppings; // Toppings ordered
String input;  // User input

double cost = 15.00; // Cost of cake and cupcakes
final double TAX_RATE = .08;  // Sales tax rate
double tax; // Amount of tax

 

// Introduce shop and prompt user to input first name

System.out.println("Welcome to Java's Cake & Cupcake Shop!");
System.out.println("We make custom cakes with our secret cake batter!");	  
	  
    // TEST CODE
    
    // STEP 3 INPUT YOUR NAME AND PREPARE TO VIEW MENU
   
	lab bot opened this issue 2 hours ago · 2 comments
Comments
@github-learning-lab github-learning-lab bot commented 2 hours ago
Variables
In this section, you will create a scanner object to take in user input, declare variables that will store information, and print out a friendly message!

You can comment out our 'Hello world' statement by adding // to the start of that line:

// System.out.println("Hello World!");
Type the following code under Step 2. It will create your scanner object, create your string variables that store text information, and double variables that store numeric values. Most of these variables don't have any values yet (except "cost" and "TAX_RATE"). We are just declairing their name and data type.

The Scanner object has pre-built methods we will use to process user input. Notice how we imported it at the top of the file?

Scanner keyboard = new Scanner (System.in); 

String firstName; // User's first name
String itemOrder; // Item ordered
String frostingType; // Frosting ordered
String fillingType; // Filling ordered
String toppings; // Toppings ordered
String input;  // User input

double cost = 15.00; // Cost of cake and cupcakes
final double TAX_RATE = .08;  // Sales tax rate
double tax; // Amount of tax


// Introduce shop and prompt user to input first name

System.out.println("Welcome to Java's Cake & Cupcake Shop!");
System.out.println("We make custom cakes with our secret cake batter!");

Step 3

System.out.print("What is your first name? ");
firstName = keyboard.nextLine();

System.out.print(firstName + ", please see our MENU below: ");
System.out.print("\n"); // skips a line  
      
    // TEST CODE     
    
    // STEP 4 DISPLAY MENU

System.out.println("_______________________________________________");      
System.out.println("        MENU         QUANTITY    BASE COST  ");
System.out.println("_______________________________________________"); 
System.out.println("        Cake                     1            $15     ");
System.out.println("   Set of Cupcakes       6            $15     ");
System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
System.out.println("Frostings (vanilla, chocolate, strawberry, coco)");
System.out.println("Fillings (mocha, mint, lemon, caramel, vanilla)");
System.out.println("Toppings (sprinkles, cinnamon, cocoa, nuts)");
System.out.println("_______________________________________________");
      

    // TEST CODE     
    
    // STEP 5 PROMPT USER TO ORDER

  
	  
	  
	  
      
    // TEST CODE
      
    // STEP 6 PROMPT USER TO CHOOSE FROSTING

   
	 
	 
	 
      
    //TEST CODE
      
    // STEP 7 PROMPT USER TO CHOOSE FILLING


	  
	  
      
    // TEST CODE
      
    // STEP 8 PROMPT USER TO CHOOSE TOPPINGS


	
      
      
    // TEST CODE
      
    // STEP 9 DISPLAY ORDER CONFIRMATION


      
	  
	  
	  
    
    // TEST CODE
      
    // STEP 10 DISPLAY COST AND SALES TAX
  
    }   
}
