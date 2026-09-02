public class Unit0Exercises {
    public static void main(String[] args) {
        int score = 85;
        score += 5;
        double price = 19.99;
                price += 2.50;

        boolean isPassing = true;
        final double TAX_RATE = 0.0925;
        char grade = 'A';
        System.out.println(grade);

        System.out.println("---Variable Snapshot---");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);

        score = 90;
        price = 22.49;
        isPassing = false;

        System.out.println("---After Updates---");
        System.out.println("Score: " + score);
        System.out.println("Price: " + price);
        System.out.println("Passing: " + isPassing);
    }
}