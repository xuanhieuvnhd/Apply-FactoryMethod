public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("heyo");
        System.out.println(shape1.showArea());

        Shape shape2 = shapeFactory.getShape("halavista");
        System.out.println(shape2.showArea());

        Shape shape3 = shapeFactory.getShape("hello");
        System.out.println(shape3.showArea());
    }
}
