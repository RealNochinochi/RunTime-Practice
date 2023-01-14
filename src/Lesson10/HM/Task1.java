package Lesson10.HM;

public class Task1 {
    public class Of76 extends Clowns {
        public static void main(String[] args) {
            Nose[] i = new Nose[3];
            i[0] = new Clowns();
            i[1] = new Acts();
            i[2] = new Lesson10.HM.Of76();
            for (int x = 0; x < 3; x++) {
                System.out.println(i[x].iMethod() + " " + i[x].getClass());
            }
        }
    }

    public class Picasso implements Nose {

        @Override
        public int iMethod() {
            return 7;
        }
    }

    public class Clowns extends Lesson10.HM.Picasso {

        @Override
        public int iMethod() {
            return 5;
        }
    }

    public class Acts extends Lesson10.HM.Picasso {

    }

    public interface Nose {
        int iMethod();
    }
}
