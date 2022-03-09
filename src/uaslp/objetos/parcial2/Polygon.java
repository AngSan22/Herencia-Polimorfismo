package uaslp.objetos.parcial2;

public class Polygon extends Figure{
    private float apotema;
    private int sidesCount;
    private  float sideLenght;

    public Polygon(){
        super("Polígono");
    }

    public Polygon(float apotema, int sidesCount, float sideLenght){
        super("Polígono");
        this.apotema = apotema;
        this.sidesCount = sidesCount;
        this.sideLenght = sideLenght;
    }

    public float getArea() {
        return getPerimeter() * apotema / 2;
    }

    public float getPerimeter() {
        return sidesCount * sideLenght;
    }
}
