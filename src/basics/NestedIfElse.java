package basics;

class Nerd {

    public void checkEligibility() {

        int creditscore = 900;
        double annualincome = 20000;
        boolean existingloan = true;


        if (creditscore >= 800) {
            System.out.println("Your Credit Score is : " + creditscore + "\nProcessing for checking your annual income");
            if (annualincome >= 50000) {
                System.out.println("Your annual income is : " + annualincome + "\nProcessing for checking your any existing loan");
                if (existingloan = false) {
                    System.out.println("You are eligible for this loan");
                }
                else {
                    System.out.println("You are not eligible for this loan");
                }
            }
            else {
                System.out.println("Your annual income is : " + annualincome + "\nYou annual income is does not satisfy the reuiqred range");
            }

        }
        else {
            System.out.println("Your Credit Score is : " + creditscore + "\nYour credit score does not satisfy the reuiqred range");

        }
    }
}
class NestedIfElse {
    public static void main (String[] args) {
        Nerd n = new Nerd();
        n.checkEligibility();
    }
}

