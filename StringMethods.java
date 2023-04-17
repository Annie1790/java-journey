public class StringMethods {
    
    public static void main(String[] args) {
        //String methods:
        //.length() -> returns the total characters of a String
        String fruit = "Banana";
        System.out.println(fruit.length());

        //.concat() -> operation of joining two strings together
        String firstName = "Aniko";
        String lastName = "Buday";
        System.out.println(firstName.concat(lastName));

        //.equals() -> test equality in strings
        String flavor1 = "mango";
        String flavor2 = "peach";
        System.out.println(flavor1.equals("mango"));
        System.out.println(flavor2.equals("mango"));

        //.compareTo() -> the characters are converted to Unicode, will return an int that represents the difference between the two strings
        //if the method returns 0, the strings are equal
        //if the value is less than 0, the string object is less than the String argument
        //if the value is more than 0, the string object is more than the String argument
        System.out.println(flavor1.compareTo("mango"));
        System.out.println(flavor2.compareTo("mango"));

        //.indexOf() -> returns the index of the first occurence of the argument. First arg is the data we're looking for, second arg is the index the search can start from
        //if it doesnt find anything, it will return -1
        String letters = "abcdefgh";
        System.out.println(letters.indexOf("g", 0));

        //.charAt() -> returns the character located at a string specified index
        System.out.println(letters.charAt(2));

        //.substring() -> returns a part of a string. first arg: starting point of extracting, second arg: end of extracting
        System.out.println(letters.substring(2, 4));

        //.toUpperCase() .toLowerCase() -> string value converted to the right case
        System.out.println(letters.toUpperCase());
    }
}
