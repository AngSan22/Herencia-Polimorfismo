package uaslp.objetos.parcial2;

public class Circle extends Figure{
    private float radio;
    public Circle(){
        super("Círculo");

    }

    public Circle(float radio){
        super("Círculo");
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getArea() {
        return (float) (Math.PI * radio * radio);
    }

    public float getPerimeter() {
        return (float) (Math.PI * 2 * radio);
    }
}
