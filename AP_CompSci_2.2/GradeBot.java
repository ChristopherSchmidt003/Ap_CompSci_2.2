import java.util.Scanner;

class GradeBot {
    public static void main (String[] args){
        //declare variables
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double score = 0;
        double grade = 0;
        
        //get user input
        System.out.println("Grade Calculator");
        System.out.println("----------------");
        System.out.println("");
        System.out.println("What was the test out of?");
        total = sc.nextDouble();
        System.out.println("What did you get?");
        score = sc.nextDouble();
        
        //calculate and display answer
        grade = 100*(score/total);
        
        if (grade > 100) {
            System.out.println("Wait a minute, that can't be right. How can your test be out of 0?");
        }else if (grade >= 85.5) {
            System.out.println("You got " + grade + "%! That's an A, Fantastic!");
        } else if (grade >= 72.5) {
            System.out.println("You got " + grade + "%! That's a B, Pretty good!");
        } else if (grade >= 65.5) {
            System.out.println("You got " + grade + "%! That's a C+, That's an ok score.");
        } else if (grade >= 59.5) {
            System.out.println("You got " + grade + "%! That's a C, maybe study some more.");
        } else if (grade >= 49.5) {
            System.out.println("You got " + grade + "%! That's a C-, you're definately gonna want to study more.");
        } else if (grade < 49.5 && grade > 0) {
            System.out.println("You got " + grade + "%! That's an F, yikes, I hope it wasn't worth that much.");
        } else {
            System.out.println("Wait a minute, that can't be right. Unless you really got a negative score. :/");
        }
    }
}