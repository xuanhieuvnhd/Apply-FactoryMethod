
public class ShapeFactory {
    public Shape getShape(String type) {
        if ("halavista".equals(type)) {
            return new Square();
        } else if ("heyo".equals(type)) {
            return new Circle();
        } else {
            return new Rectangle();
        }
    }
}
