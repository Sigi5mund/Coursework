public class Runner {

    public static void main(String[] args) {
        Bear bear = new Bear("Balu",5, 95.82);
        bear.setName("Baloo");
        String bearName = bear.getName();
        System.out.println(bearName);
    }
}
