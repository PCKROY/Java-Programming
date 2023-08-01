package Inheritance;

public class BoxColor extends BoxWeight{
    String color;

    BoxColor(){
        super();
        this.color = "White";
    }
    BoxColor(BoxColor other){
        super(other);
        this.color = other.color;
    }

    public BoxColor(double l, double w, double h, double weight, String color) {
        super(l, w, h, weight);
        this.color = color;
    }
    BoxColor(double side,double weight,String color){
        super(side,weight);
        this.color = color;
    }
}
