package uaslp.objetos.parcial2;

public class Rectangle extends Figure{
    private float base;
    private float height;

    public Rectangle(){
        super("Rectángulo");
    }

    public Rectangle(float base, float height){
        super("Rectángulo");
        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return base * height;
    }

    public float getPerimeter() {
        return 2*(base + height);
    }
}
