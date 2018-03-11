import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap();

        favouriteFruits.put("Sophie", "Blueberry");
        favouriteFruits.put("Fraser", "Banana");
        favouriteFruits.put("Alex", "Mango");

        System.out.println(favouriteFruits.get("Sophie"));
        favouriteFruits.put("Sophie", "Apple");
        System.out.println(favouriteFruits.get("Sophie"));
    }

}
