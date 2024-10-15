public class Main {
    public static void main(String[] args) {
        Author markTwain = new Author("Mark", "Twain");
        Author williamShakespeare = new Author("William", "Shakespeare");

        Book tomSawyer = new Book("Tom Sawyer", markTwain, 1876);
        Book tomSawyer1 = new Book("Tom Sawyer", markTwain, 1876);
        Book romeoAndJuliet = new Book("Romeo and Juliet", williamShakespeare, 1591);

        System.out.println(tomSawyer.equals(tomSawyer1)); // should return true
        System.out.println(tomSawyer.equals(romeoAndJuliet)); // should return false
    }
}