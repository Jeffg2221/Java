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

int age = 16;
!(age < 16)
// true
// (May obtain a drivers license)


public final class Main{
    public static void main(String[] args){
    int temperature = 85;
    boolean isCloudy = True;
    if(temperature < 40 && isCloudy){
        System.out.println("It might snow");
    } else if(isCloudy){
        System.out.println("It might rain");
    }else{
        System.out.println("We should have nice weather today.");
        }
    }

}