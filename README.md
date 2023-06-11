# Pizza Bill Generator:

This is a Java application that generates a bill for a pizza cafe. The cafe offers two types of pizzas: regular and deluxe, both available in veg and non-veg variants. The pizzas have a base price, and customers can choose to add extra cheese or toppings to their regular pizzas. Deluxe pizzas come with extra cheese and toppings by default. Additionally, if customers opt for takeaway, they have to pay for the paper bag that comes with it.

## Pricing Information

* Veg pizza base price: 300
* Non-veg pizza base price: 400
* Extra cheese price: 80
* Extra toppings for veg pizza: 70
* Extra toppings for non-veg pizza: 120
* Paper bag price: 20

## Classes
**The application consists of three classes:**

* **Main.java:** The driver code for the application.\
* **Pizza.java:** A base class representing a pizza. It contains common attributes and methods.\
* **DeluxePizza.java:** A class that extends the Pizza class and represents a deluxe pizza. It does not have any extra methods; the constructor handles the additional features of deluxe pizzas.

## Bill Structure Example

**Example 1:**

* Base Price Of The Pizza: 300
* Extra Cheese Added: 80
* Extra Toppings Added: 70
* Paperbag Added: 20
* Total Price: 470

**Example 2:**

* Base Price Of The Pizza: 400
* Extra Cheese Added: 80
* Extra Toppings Added: 120
* Total Price: 600

## Notes
* Customers can request extra cheese or toppings multiple times, but they should only be added to the bill once.
* Extra cheese should be added before extra toppings if a customer asks for both.
* The bill generated should have each component on a separate line.

## Feel free to explore and modify the provided skeleton code to make the application functional. Enjoy your pizza! 🍕
