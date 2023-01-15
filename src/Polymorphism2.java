public class Polymorphism2 {
    public class MonsterTestDrive {
        public static void main(String[] args) {
            Monster[] ma = new Monster[3];
            ma[0] = new Vampire();
            ma[1] = new Dragon();
            ma[2] = new Monster();
            for (int x = 0; x < 3; x++) {
                ma[x].frighten(x);
            }
        }
    }

    public class Dragon extends Monster {
        boolean frighten(int d) {
            System.out.println("Огненое дыхание");
            return true;
        }
    }

    public class Monster {
        boolean frighten(int d) {
            System.out.println("ГРРРРРРРРРР");
            return true;
        }
    }

    public class Vampire extends Lesson7.Monsters.Monster {
        boolean frighten(int d) {
            System.out.println("Укусить?");
            return false;
        }
    }
}
