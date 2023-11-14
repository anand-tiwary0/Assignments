package ca3;

public class  BoxDimension {
    float length;
    float breadth;
    float height;

    public BoxDimension(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }


    public BoxDimension() {
        //this is default constructor that will be called when no parameter is passed during
        // instantiation
        this.length = -1;
        this.breadth = -1;
        this.height = -1;
    }
}

class BoxWeight extends BoxDimension{
    float weight;

    public BoxWeight(float weight) {
        super();   //here even super() is not mentioned the default constructor of parent will be called
                    // automatically
        this.weight = weight;
    }
    public BoxWeight(float length, float breadth, float height, float weight) {
        //super() is used to call the constructor of parent and based on number of arguments to super
        // proper constructor will from parent will be called
        super(length, breadth, height);
        this.weight = weight;
    }
    public BoxWeight() {
        this.weight = -1;
    }
}

class BoxColor extends BoxWeight{
    String color;

    public BoxColor(float length, float breadth, float height, float weight, String color) {
        super(length, breadth, height, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        //here super keyword is used to access variables of parent and grandparents from child class
        return "BoxColor{" +
                "color='" + color + '\'' +
                "length='" + super.length + '\''+
                "breadth='" + super.breadth + '\''+
                "height='" + super.height + '\''+
                "weight='" + super.weight + '\''+
                '}';
    }

    public BoxColor() {
        this.color = "no-color";
    }

    public static void main(String[] args) {
        BoxDimension box = new BoxColor(45,89,34,34.5f,"red");
        System.out.println(box);
    }
}
