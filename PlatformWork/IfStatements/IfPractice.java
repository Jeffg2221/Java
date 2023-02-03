if (condition) {
    // what to do if condition is true
}
// continue with program
boolean isRaining = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}


if(condition) {
    // what to do if condition is true
}
else if(2nd condition) {        
    // what to do if 2nd condition is true
}
// ... can have 0 to many else-if statements ...
else {                           
    // what to do if none of the previous conditions are met
} // can have 1 or no else statement

boolean isRaining = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else {
    System.out.println("Have fun!");
}

boolean isRaining = true;
boolean isCold = true;
    
if(isRaining) {
    System.out.println("Bring an umbrella.");
}
else if(isCold) {
    System.out.println("Wear a coat.");
}
else {
    System.out.println("Have fun!");
}
// && symbol examples
int age = 45;
    
age < 65 && age > 17; 
// evaluates to true
//(Would pay adult price)
    
age < 110 && age > 65; 
// false
// (Is not a senior, nor immortal)

int age = 77;
age < 10 || age > 65;
// true
// (Doesn't care what people think!)
