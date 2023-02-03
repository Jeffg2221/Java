import java.util.ArrayList;

class ArraysAndLists { public static void main(String[] args){
    
     // What if you would like to add elements that are of different types? Well, all objects are inherited from the Object class. Therefore, we can have our generic as an object and add different types of objects! For example:

        ArrayList<Object> things = new ArrayList<Object>();
        things.add(10);
        things.add("Hello");
        things.add(new ArrayList<Integer>());
        things.add(12.5);
                
        System.out.println(things); // { 10, "Hello", [], 12.5 }
    }
}


ArrayList<Integer> myArray = new ArrayList<Integer>();
// Add items to the array (expanding the size)
    myArray.add(10); // { 10 }
    myArray.add(11); // { 10, 11 }
    System.out.println(myArray);
    // To read values from the array,
    // use .get() passing in the index
    Integer num = myArray.get(0); // 10
    System.out.println(num);
    // Overwrite values in the array
    // use .set() passing in the index 
    // and the value you want to change it to
    myArray.set(0, 9); // { 9, 11 }
    System.out.println(myArray);




