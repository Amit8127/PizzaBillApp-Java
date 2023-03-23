package pizzabillapp;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza order1 = new Pizza(true);
	    order1.takeAway();
	    System.out.println(order1.generateBill());

	    System.out.println();
	    DeluxPizza order2 = new DeluxPizza(false);
	    order2.takeAway();
	    System.out.println(order2.generateBill());
	}
}
