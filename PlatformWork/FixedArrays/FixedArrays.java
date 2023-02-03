int[] myArray;
myArray = new int[5];    // Initialization
myArray[0] = 4;
myArray[1] = 8;
myArray[2] = 8;
myArray[3] = 5;
myArray[4] = 9;

int[] myArray = {4, 8, 8, 5, 9};

String[] fruits = {"banana", "pear", "papaya", "kiwi"};
// To swap the value at index 0 and index 3
String temp = fruits[0]; // assigns temp to "banana"
fruits[0] = fruits[3]; // { "kiwi", "pear", "papaya", "kiwi"}
fruits[3] = temp; // { "kiwi", "pear", "papaya", "banana"}

System.out.println(fruits.length); // 4
// Array is currently { "kiwi", "pear", "papaya", "banana" }
System.out.println(fruits[fruits.length - 1]) // "banana"
