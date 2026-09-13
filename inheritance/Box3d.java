package inheritance;

class Box {

    private double l;
    private double h;
    private double w;

    public Box(double length, double height, double width) {
        l = length;
        h = height;
        w = width;
    }

    public void area() {
        System.out.println("Area: " + (2 * l * h) + (2 * l * w) + (2 * h * w));
    }

    public void volumn() {
        System.out.println("volume of box : " + (l * h * w));
    }

}

public class Box3d extends Box {

    Box3d(double length, double height, double width){
        super(length, height, width);
    }
    public static void main(String[] args) {
        Box3d box = new Box3d(5.0, 6.0, 7.0);
        box.area();
        box.volumn();
    }

}
// Create class Box and Box3d. Box3d is extended class of Box. The above two
// classes going to fulfill the following requirement.
// Include constructor, set value of length, breadth, height. Find out area and
// volume.