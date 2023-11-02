import java.util.Scanner;

class VoteAgeException extends Exception {
    public VoteAgeException(String message) {
        super(message);
    }
}
class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkVotingAge(age);
            System.out.println("You are eligible to vote!");
        } catch (VoteAgeException e) {
            System.out.println("VoteAgeException: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
    public static void checkVotingAge(int age) throws VoteAgeException {
        if (age < 18) {
            throw new VoteAgeException("You are not eligible to vote. Minimum voting age is 18.");
        }
        
    }
}

