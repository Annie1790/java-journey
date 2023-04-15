public class HelloWorld {
  String productType;
  double price;

  // constructor
  public HelloWorld(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  // void because it does not return anything. when we wish to return a data, we
  // should use the data type instead of void.
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  // data type: double, returns price
  public double returnPrice() {
    return price;
  }

  // main method
  public static void main(String[] args) {
    HelloWorld lemonadeStand = new HelloWorld("Lemonade", 3.75);
    HelloWorld cookieStand = new HelloWorld("cookies", 1.5);
    lemonadeStand.increasePrice(1.5);
    System.out.println(lemonadeStand.returnPrice());
    System.out.println(lemonadeStand);
    System.out.println(cookieStand);
  }
  // toString method:
  public String toString() {
    return "We are selling " + productType + " at a price of " + price + ".";
  }

}

// public class HelloWorld {
// String welcoming;
// boolean isCorrect;
// double number;
// //constructor shares the same name as the class
// public HelloWorld(String hello) {
// welcoming = hello;
// };

// public HelloWorld(boolean correct) {
// isCorrect = correct;
// }
// public HelloWorld(double getNumber) {
// number = getNumber;
// }

// public static void main(String[] args) {
// //Because of constructor overloading, a class can have multiple constructors
// as long as they have different parameter values.
// HelloWorld helloThere = new HelloWorld("Hello World!");
// HelloWorld helloAgain = new HelloWorld(true);
// HelloWorld helloBaby = new HelloWorld(19/4);
// //The first part, HelloWorld, refers to the class, and the second part @xyz
// refers to the instance’s location in the computer’s memory.
// System.out.println(helloThere.welcoming);
// System.out.println(helloAgain.isCorrect);
// System.out.println(helloBaby.number);
// }
// }

// String myLove1 = "Alex";
// String myLove2 = "AlexTheTRex";
// String myLove3 = "Alex";
// //To compare other objects, use .equals() all the time
// System.out.println(myLove1.equals(myLove2));
// System.out.println(myLove1.equals(myLove3));

// //To declare a variable which cannot be manipulated (similar to const in JS),
// use "final" keyword
// final boolean amIAddictedToAlex = true;
// System.out.println(amIAddictedToAlex);