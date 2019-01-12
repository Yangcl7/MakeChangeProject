package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		double change, itemPrice, cashTendered, twentyDollars, tenDollars, fiveDollars, 				   oneDollars, quarters, dime, nickles, pennies;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the total sale price?");
		itemPrice = kb.nextDouble();
		System.out.println("How much cash was tendered");
		cashTendered = kb.nextDouble();
		
		
	
		while (cashTendered > itemPrice) {
			change = cashTendered - itemPrice;
			System.out.println(change);
			return;
			
		}
			
		
		
		
		
		kb.close();
	}

}













//	In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.
//	
//	Hint: Mod operator
//	
//	User Story #1
//	The user is prompted asking for the price of the item.
//	
//	User Story #2
//	The user is then prompted asking how much money was tendered by the customer.
//	
//	User Story #3
//	Display an appropriate message if the customer provided too little money or the exact amount.
//	
//	User Story #4
//	If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.