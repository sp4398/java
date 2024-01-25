public class GenericPair {

    public static void main(String[] args) {
        Pairs<String, Integer> stringIntPair = new Pairs<>("Java", 2022);
        Pairs<Double, Character> doubleCharPair = new Pairs<>(3.14, 'G');

        System.out.println("First Pair: " + stringIntPair);
        System.out.println("Second Pair: " + doubleCharPair);
        stringIntPair.setFirst("Programming");
        doubleCharPair.setSecond('P');
        System.out.println("\nModified First Pair: " + stringIntPair);
        System.out.println("Modified Second Pair: " + doubleCharPair);
    }
}
