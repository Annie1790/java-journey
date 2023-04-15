import java.util.Arrays;
import java.util.ArrayList;

public class Store {
    int quantity;
    String product;
    String brands;

    public Store(int productQty,String productType,String brandArr) {
        quantity = productQty;
        product = productType;
        brandArr = brands;
    }

        //main method 
        public static void main(String[] args) {
        Store cookieShop = new Store(10, "cookies","Oreo");
        int[] arrayOfHouseNumbers = {1,3,7,11,17};
        System.out.println(Arrays.toString(arrayOfHouseNumbers));
        System.out.println(cookieShop.toString() + "sells " + cookieShop.product + " to " + args[0]);
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(5);
        row.add(10);
        //add has 2 parameters: 1st is the value you wish to add, and 2nd is the index where you wish to add. if 2nd is blank, it adds to the end of the array.
        System.out.println(row.size());
        //size is equal to length
        System.out.println(row.get(1));
        //get is similar if we wish to read the [index] of ArrayList
        row.set(1, 29);
        //set is similar if we wish to change the value of [index]
        System.out.println(row);
        row.remove(1);
        //straightforward :)
        System.out.println(row);
        System.out.println(row.indexOf(5));
    }


}
