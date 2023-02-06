public class Main {
    public static void main(String[] args) {
        collector Man = new collector();
        System.out.println("New List:" + Man.collectAllWord());
        collector dude = new collector();
        System.out.println("New List: " + dude.collectAllRect());
    }
}