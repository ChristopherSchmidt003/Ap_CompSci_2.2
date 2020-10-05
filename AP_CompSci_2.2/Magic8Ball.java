import java.util.Scanner;

class Magic8Ball {
    public static void main (String[] args){
        //declare variables
        Scanner sc = new Scanner(System.in);
        int ans = (int) (Math.random()*20) + 1;
        
        
        //get user input
        System.out.println("Magic 8 Ball");
        System.out.println("------------");
        System.out.println("");
        System.out.println("Ask away");
        sc.nextLine();
        
        
        //Calculate and display answer
        if (ans == 1) {
            System.out.println("Yessir.");
        } else if (ans == 2) {        
            System.out.println("It is best that you do not know.");
        } else if (ans == 3) {
            System.out.println("Better not tell you now.");
        } else if (ans == 4) {
            System.out.println("The answer lies with... Ryan Kao.");
        } else if (ans == 5) {
            System.out.println("Concentrate and ask again.");
        } else if (ans == 6) {
            System.out.println("It seems like you already know ;).");
        } else if (ans == 7) {
            System.out.println("It is certain.");
        } else if (ans == 8) {
            System.out.println("Search through your heart, you know it to be true.");
        } else if (ans == 9) {
            System.out.println("Probably myguy.");
        } else if (ans == 10) {
            System.out.println("No sir.");
        } else if (ans == 11) {
            System.out.println("No way.");
        } else if (ans == 12) {
            System.out.println("Doesn't look good buddy.");
        } else if (ans == 13) {
            System.out.println("Could go either way.");
        } else if (ans == 14) {
            System.out.println("I'd ask Zach, he seems to know stuff.");
        } else if (ans == 15) {
            System.out.println("Uuuuuuuhhhh..... what?");
        } else if (ans == 16) {
            System.out.println("I mean... what can I say.");
        } else if (ans == 17) {
            System.out.println("Without a doubt in my mind.");
        } else if (ans == 18) {
            System.out.println("Yes.");
        } else if (ans == 19) {
            System.out.println("Absolutely not.");
        } else if (ans == 20) {
            System.out.println("Your kidding, right.");
        }
    }
}