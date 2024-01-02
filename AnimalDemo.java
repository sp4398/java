class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        a.makeSound();

        System.out.println("\nMy Dog:");
        myDog.makeSound();

        System.out.println("\nMy Cat:");
        myCat.makeSound();
    }

}
