public class Pairs<F, S> {
    private F first;
    private S second;

    public Pairs(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
    public static void main(String[] args) {
        Pairs<String, Integer> stringIntPair = new Pairs<>("Hello", 42);
        System.out.println("Pair: " + stringIntPair);
        Pairs<Double, Character> doubleCharPair = new Pairs<>(3.14, 'A');
        System.out.println("Pair: " + doubleCharPair);
    }
}
