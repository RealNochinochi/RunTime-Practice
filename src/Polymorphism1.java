public class Polymorphism1 {
    public class TestBoats {
        public static void main(String[] args) {
            Boat b1 = new Boat();
            SailBoat b2 = new SailBoat();
            Rowboat b3 = new Rowboat();

            b2.setLength(32);
            b1.move();
            b3.move();
            b2.move();
        }
    }

    public class Boat {
        private int length;

        public void setLength(int len) {
            length = len;
        }

        public int getLength() {
            return length;
        }

        public void move() {
            System.out.println("Дрейф ");
        }
    }

    public class Rowboat extends Lesson7.Boats.Boat {
        public void rowTheBoat() {
            System.out.println("Давай Наташа!");
        }
    }

    public class SailBoat extends Lesson7.Boats.Boat {
        public void move() {
            System.out.println("Поднять поруса!");
        }
    }
}
