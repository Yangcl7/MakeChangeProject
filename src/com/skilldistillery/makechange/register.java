package com.skilldistillery.makechange;

public class Register {

	int twentyDollars, tenDollars, fiveDollars, oneDollars, quarters, dimes, nickles, pennies;
	
	public double cashTendered(double itemPrice, double cashTendered) {
		// give valus to the ints
		
		int change =(int) ((cashTendered - itemPrice) * 100); 
		System.out.println("\nYour change is:");
		
		if (change >= 2000) {
			twentyDollars = change / 2000;
			change = change % 2000;
			System.out.println(twentyDollars + " twentyDollar bills");
//			System.out.println(change + " Change");
		}
		if (change >= 1000) {
			tenDollars = change /1000;
			change = change % 1000;
			System.out.println(tenDollars + " ten dollar bills");
//			System.out.println(change + "Change");
		}
		if (change >= 500) {
			fiveDollars = change / 500;
			change = change % 500;
			System.out.println(fiveDollars + " five dollar bills");
		}
		if (change >= 100) {
			oneDollars = change / 100;
			change = change % 100;
			System.out.println(oneDollars + " one dollar bills");
		}
		if (change >= 25 ) {
			quarters = change / 25;
			change = change % 25;
			System.out.println(quarters + " quarters");
		}
		if (change >= 10 ) {
			dimes = change / 10;
			change = change % 10;
			System.out.println(dimes + " dimes" );
		}
		if (change >= 5) {
			nickles =  change / 5;
			change = change % 5;
			System.out.println(nickles + " nickles");
		}
		if (change >= 1){
			pennies =  change / 1;
			change = change % 2;
			System.out.println(pennies + " pennies");
		}

			
		
		
		
		return change;
	}
}
