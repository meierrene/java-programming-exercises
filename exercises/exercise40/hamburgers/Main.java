package de.renemeier.udemy.timbuchalka.exercises.exercise40.hamburgers;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}

/*Example output:

Basic hamburger on a White roll with Sausage, price is 3.56
Added Tomato for an extra 0.27
Added Lettuce for an extra 0.75
Added Cheese for an extra 1.13
Total Burger price is 5.71
Healthy hamburger on a Brown rye roll with Bacon, price is 5.67
Added Egg for an extra 5.43
Added Lentils for an extra 3.41
Total Healthy Burger price is  14.51
Cannot not add additional items to a deluxe burger
Deluxe hamburger on a White roll with Sausage & Bacon, price is 14.54
Added Chips for an extra 2.75
Added Drink for an extra 1.81
Total Deluxe Burger price is 19.10
*/