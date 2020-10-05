import java.util.Scanner;

class Secret {
    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        String password = "Chico";
        String guess    = "0";
        
        //get user input
        System.out.println("Secret Password");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Enter the Secret Password");
        System.out.println("Hint: Who's the goodest boy");
        guess = sc.nextLine();
        
        //calculate and display answer
        if (guess.equals("Chico")){
            System.out.println("Correct! Chico is the goodest boy!");
        } else {
            System.out.println("Incorrect Password! " + guess + " isn't the goodest boy");
        }
        
    }
}