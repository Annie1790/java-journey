import java.util.ArrayList;

public class Count {

    public void oddNumbers() {
        //With arrays
        int[] numbers = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                continue;
            }
            System.out.println(numbers[i]);
        }
        //forEach loop, items is a new variable, numbers been declared on the top
        for (int items : numbers) {
            System.out.println(items);
        }
    }

    public static void oddNumbersWithArrayList() {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(15);
        myList.add(32);
        myList.add(12);
        myList.add(2);
        myList.add(82);
        myList.add(47);
        System.out.println(myList.toString());

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 == 0) {
                continue;
                //skips the rest of the iteration
            }
            System.out.println(myList.get(i));

        }
    }

    public static void removeElementsFromArrayList() {
        //removing an element using while
       ArrayList<Double> duble = new ArrayList<Double>();
       
       for (double i = 0; i < 10; i++) {
        duble.add(i);
       };

    //    int j = 0;
       System.out.println(duble.toString());
    // WHILE  SOLUTION:
    //    while (j < duble.size()) {
    //     if (duble.get(j) % 2 == 0) {
    //         duble.remove(j);
    //         //dont increment j on while loop, ArrayList is a generic which is dynamic, therefore the elements will shift to the left
    //     } else {
    //         j++;
    //     }
    //     System.out.println(duble.toString());
    //    }

    //FOR SOLUTION:
    // In for loop, we must increase our variable. In ArrayList, because with each addition or removing, the element will shift, we have to reduce the inner variable by one.
    // for (int i = 0; i < duble.size(); i++) {
    //     if (duble.get(i) % 2 == 0 ) {
    //         duble.remove(i);
    //         i--;
    //     }
    //     System.out.println(duble.toString());
    // }
         

    }



    public static void main(String[] args) {
        Count.removeElementsFromArrayList();
    }
}

// Build a method that filters an array for odd or even numbers (bonus points if it can do either depending on arguments passed in!).

// Build a method that returns an ArrayList of the first n primes in an array.

// Build a method that returns an ArrayList of the first n Fibonacci numbers.