// import java.util.date;
import java.util.ArrayList;
import java.util.Arrays;

class CafeUtil{
        // , write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.
        // Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.
        public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum += i;
            System.out.println(sum);
        }
        return sum;
        }
        // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
        public double getOrderTotal(double[]prices){
        double sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < prices.length; i++) {  
        sum += prices[i];  
        }  
        System.out.println(sum);
        return sum;
    }
        public void displayMenu(ArrayList<String> menu){
            for(int i =0 ; i< menu.size();i++){
                System.out.println(i + " - " +menu.get(i));
            }
            // for(String menuItem: menu){
            //     System.out.println(menuItem);
            // }
        }

        public String addCustomer(){

        }
}  

