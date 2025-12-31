public class Ifelseladder {
    public static void main (String[] args) {
        int age = 22;
        boolean is3d = true;
        int price ;


        if (age <= 18 && is3d== true) {
            price = 10;
        }
        else if (age > 18 && is3d == false) {
            price = 15;
        }
        else if (age < 30 && is3d == true) {
            price = 25;
        }
        else if (age > 45  && is3d == true) {
            price = 35;
        }
        else{
            price = 0;
        }
        System.out.println(" Your age IS :"  + age + " \n SO Your Ticket Price IS $: " + price );
    }
}


