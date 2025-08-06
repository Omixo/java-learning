public class WweGame {

    static class Wrestler {

        // our class
        String name;
        String finisher;
        int power;

        void entrance() {
            System.out.println(name + " is entering the ring!");
        }

        void showFinisher() {
            System.out.println(name + "'s finisher is " + finisher);
        }
    }

    public static void main(String[] args) {
        // let's create object here bro
        Wrestler roman = new Wrestler();
        roman.name = "Roman Reigns";
        roman.finisher = "Spear";
        roman.power = 95;

        roman.entrance();
        roman.showFinisher();
    }
}


// in these we have learned the obj and class