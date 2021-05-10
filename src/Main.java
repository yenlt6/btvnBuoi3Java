

public class Main {
    int a = 5;
     public static void main(String[] args) {
        int wid=7;
        int leng=15;
        float rad=8;
        Circle circle = new Circle(rad);
        Ractangle ractangle = new Ractangle(leng,wid);
        double areaCircle = circle.circleArea(circle);
        double circuitCircle = circle.circleCircuit(circle);
        int circuitRact= ractangle.ractangularCircuit(ractangle);
        int areaRact= ractangle.rectangularArea(ractangle);

        // in ra màn hình chu vi và diện tích kết quả tính hình tròn:
        System.out.println("Chu vi hinh tròn là:" + " " + circuitCircle + " cm");
        System.out.println("Diện tích hình tròn là: " + areaCircle + " cm2");


        //In ra màn hình kết quả tính chu vi và diện tích hình chữ nhật
        System.out.println("Chu vi hình chữ nhật là: " + circuitRact + " cm");
        System.out.println("Diện tích hình chữ nhật là: " + areaRact + " cm2");

    }
    void show() {
        System.out.println(a);
    }
}
