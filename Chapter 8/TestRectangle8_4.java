public class TestRectangle8_4 {
    public static void main(String[] args) {
        Rectangle8_4 r = new Rectangle8_4();
        r.setLength(5.5);
        r.setWidth(3.2);
        System.out.printf("Length: %.2f, Width: %.2f%n", r.getLength(), r.getWidth());
        System.out.printf("Area: %.2f%n", r.getArea());
        System.out.printf("Perimeter: %.2f%n", r.getPerimeter());
    }
}