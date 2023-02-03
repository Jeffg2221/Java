int i = 0;
while(i < 7)
{
    System.out.println("foo");
    i++;
}

for (int i = 0; i < 7; i++){
    System.out.println("bar");
}

// for (initialization; termination; increment){
//    body statements
// }

ArrayList<String> dynamicArray = new ArrayList<String>();
dynamicArray.add("hello");
dynamicArray.add("world");
dynamicArray.add("etc");
for (int i = 0; i < dynamicArray.size(); i++){
    System.out.println(dynamicArray.get(i));
}

// There are also many times where you will find you need to assign the array element to a variable and manipulate it some way, but you don't care about the current index at all. Something like this:
for(int i = 0; i < dynamicArray.size(); i++){
    String name = dynamicArray.get(i);
    System.out.println("hello " + name);
    // other operations using name
}
// Rather than forcing an awkward declaration like this, the enhanced for loop was introduced in Java 5. Translating the above code to an enhanced for loop would look like this:
for(String name : dynamicArray){
    System.out.println("hello " + name);
    // other operations using name
}
// for(element container : collection){
// body statements
// }

ArrayList<String> snacks = new ArrayList<String> ();
snacks.add("Apples");
snacks.add("Pretzels");
snacks.add("Almonds");
snacks.add("Yogurt");
for(int i=0; i<snacks.size(); i++) {
    if(snacks.get(i).charAt(0) == 'A') {
        snacks.remove(i);
    }
}
// If we're modifying the ArrayList that we are looping over, the enhanced for loop may encounter this error. If we write a conventional for loop instead, we can get this to work.

