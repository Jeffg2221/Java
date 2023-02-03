public class CafeJava{
    public static void main(String[] args){
        //App variables
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly ";
        String  readyMessage = ", your order is ready ";
        String displayTotalMessage = "Your total is $";

        // Menu Variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.4;
        double lattePrice = 5.5;
        double cappuccinoPrice = 4.2;

        // Customer name  variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        String customer5 = "Jeff";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
        boolean isReadyOrder5 = true;

        // App Interactiom simulation (add your code for the challenges below)
        // Example
        System.out.println(generalGreeting + customer1); 
        //  Displays "welcome to the Cafe Java, Cinhuri"
           // 1.) Cindhuri ordered a coffee. 
        //     show her the status message.
        if(isReadyOrder1){
            System.out.println(customer1 + readyMessage);
        }else{
            System.out.println(customer1 + pendingMessage);
        }
       // 2.) Noah ordered a cappucino
        //     Check the status of his order and let him know. If it is ready, also tell him his total.
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage +  displayTotalMessage + cappuccinoPrice);
        }else{
            System.out.println(customer4 + pendingMessage);
        }
        // 3.) Sam ordered 2 lattes, and would like to know the total up front. 
        //      Also tell them their order status.
            System.out.println( displayTotalMessage + lattePrice * 2);
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage );
        }else{
            System.out.println(customer2 + pendingMessage);
        }
      // 4.) Jimmy just realized he was charged for a coffee but had ordered a latte.
        //     Tell him his new total to make up the difference.
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));
        // ** Your customer interaction print statements will go here **//

    }
}