public class StringDemo{
    public static void main(String[] args){
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println("String length is : " + length );

        String string1 = "My name is ";
        String string2 = "Jeff";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        String ninja2 = String.format("Hi %s, you owe me $%.2f !", string2, 25.0);
        System.out.println(ninja2);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.
        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding"); // a is 11
        int b = ninja3.indexOf("co"); // b is 3
        int c = ninja3.indexOf("pizza"); // c is -1, "pizza" is not found

        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());
        // Trim: The trim() method removes any trailing or leading white spaces from the string.
        String a1 = "HELLO";
        String b1 = "world";
        System.out.println(a1.toLowerCase()); // hello
        System.out.println(b1.toUpperCase()); // WORLD
        // Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.

        // Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.
        // Normal string assignment
        String a2 = "same string";
        String b2 = "same string";
        System.out.println(a == b); // true
        // Creating new strings as separate objects (another way to create a String)
        a2 = new String("same letters");
        b2 = new String("same letters");
        System.out.println(a2 == b2); // false. Not the same object in memory.
        System.out.println(a2.equals(b2)); // true. same exact characters.




        
    }
}

