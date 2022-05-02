public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc", 12, 100, 90, 1);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 3);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}