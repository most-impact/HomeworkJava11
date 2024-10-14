public class Main {
    public static void main(String[] args) {
        Author markTwain = new Author("Mark", "Twain");
        Author williamShakespeare = new Author("William", "Shakespeare");

        Book tomSawyer = new Book("Tom Sawyer", markTwain, 1876);
        Book romeoAndJuliet = new Book("Romeo and Juliet", williamShakespeare, 1591);

        // System.out.println(tomSawyer.getAuthor());
        // System.out.println(tomSawyer.getName());
        // System.out.println(tomSawyer.getYear());

        // System.out.println(romeoAndJuliet.getYear());
        romeoAndJuliet.setYear(1595);
        // System.out.println(romeoAndJuliet.getYear());
        // System.out.println(romeoAndJuliet.getName());
        // System.out.println(romeoAndJuliet.getAuthor());
    }
}