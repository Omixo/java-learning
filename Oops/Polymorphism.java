class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Tiger extends Animal {
    void makeSound() {
        System.out.println("Roar");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myTiger = new Tiger();

        myDog.makeSound();    // Outputs: Bark
        myTiger.makeSound();  // Outputs: Roar
    }
}
