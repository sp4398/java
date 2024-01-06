class HillStations {
    String location() {
        return "Generic hill station location";
    }

    String famousFor() {
        return "Scenic beauty and pleasant climate";
    }
}

class Manali extends HillStations {
    @Override
    String location() {
        return "Manali, Himachal Pradesh";
    }
    //override
    @Override
    String famousFor() {
        return "Adventure sports and Solang Valley";
    }
}
class Mussoorie extends HillStations {
    @Override
    String location() {
        return "Mussoorie, Uttarakhand";
    }

    @Override
    String famousFor() {
        return "Kempty Falls and Mall Road";
    }
}

class Gulmarg extends HillStations {
    @Override
    String location() {
        return "Gulmarg, Jammu and Kashmir";
    }

    @Override
    String famousFor() {
        return "Skiing and Gulmarg Gondola";
    }
}

public class Main {
    public static void main(String[] args) {
        HillStations hillstation = new HillStations();
        System.out.println("Parent class:");
        System.out.println("Location: " + hillstation.location());
        System.out.println("Famous for: " + hillstation.famousFor());

        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        System.out.println("\nSubclasses:");
        System.out.println("Manali - Location: " + manali.location());
        System.out.println("Manali - Famous for: " + manali.famousFor());

        System.out.println("Mussoorie - Location: " + mussoorie.location());
        System.out.println("Mussoorie - Famous for: " + mussoorie.famousFor());

        System.out.println("Gulmarg - Location: " + gulmarg.location());
        System.out.println("Gulmarg - Famous for: " + gulmarg.famousFor());


    }
}
