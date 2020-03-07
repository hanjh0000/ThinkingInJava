import java.util.Random;

public class Shape{
    public void draw() {

    }
    public void erase() {

    }

    public void print(){
        System.out.println("I'm shape");
    }
}

class Circle extends Shape{
    public void draw() {
        System.out.println("Cricle.draw()");
    }

    public void erase() {
        System.out.println("Cricle.erase()");
    }
    @Override
    public void print(){
        System.out.println("I'm Cricle");
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.erase();
    }
}

class Triangle extends Circle{
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    public void erase() {
        System.out.println("Triangle.erase()");
    }
}

class Square extends Shape{
    public void draw() {
        System.out.println("Square.draw()");
    }

    public void erase() {
        System.out.println("Square.erase()");
    }
}

class RandomShapeGenerator{
    private Random random = new Random();
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return new Square();
        }
    }
}

class Shapes{
    private static RandomShapeGenerator generator = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        for (int i=0;i < shapes.length;i++){
            shapes[i] = generator.next();
        }
        for (Shape shape : shapes)
            shape.draw();
    }
}