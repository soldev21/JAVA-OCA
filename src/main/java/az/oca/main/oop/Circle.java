package az.oca.main.oop;

public class Circle {

    private float radius;
    private float area;

    public Circle(float radius){
        setRadius(radius);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        if (radius<=0) throw new RuntimeException("Radius of circle must be greater than 0 sent value is "+radius);
        this.radius = radius;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        if (area<=0) throw new RuntimeException("Area of circle must be greater than 0 sent value is "+area);
        this.area = area;
    }
}
