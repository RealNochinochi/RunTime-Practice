public class InheritanceTriangleTask1 {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        InheritanceTriangleTask1[] ta = new InheritanceTriangleTask1[][4];

        while (x < 4) {
            ta[x] new InheritanceTriangleTask1();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.println("треугольник " + x + " ,зона");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        InheritanceTriangleTask1 t5 = ta[2];
        ta[2].area = 343;
        System.out.println(" y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}
