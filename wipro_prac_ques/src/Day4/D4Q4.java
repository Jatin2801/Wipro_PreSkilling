/*Write a program in java to exploit constructor overloading. (cube and cuboid volume calculation)
i)  Create a class ThreeDimensionShape with three variables width, height, depth;
ii)  Create three constructors
a)     Doesn’t accepts any parameter
b)     Accepts 1 parameter of type double(length)
c)     Accepts 3 parameter of type double(width, height, depth)
iii)  Create a method volume of type double that returns a product of width, height, and depth.
iv)  in case of No argument constructor make length=width=depth = 0;
v)  in case of 1 argument constructor make length=width=depth = length; */
package Day4;
public class D4Q4 {
    public static void main(String args[]) {
        // create boxes using the various
        // constructors
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

        double volume;

        // get volume of first box
        volume = shape1.volume();
        System.out.println("Volume of shape1 is " + volume);

        // get volume of second box
        volume = shape2.volume();
        System.out.println("Volume of shape2 is " + volume);

        // get volume of cube
        volume = shape3.volume();
        System.out.println("Volume of shape3 is " + volume);
    }
}

class ThreeDimensionShape {
    double width, height, depth;

    // constructor used when all dimensions are defined
    ThreeDimensionShape(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when one dimension is defined

    ThreeDimensionShape(double l) {
        width = height = depth = l;
    }

    // constructor used when no dimension is specified
    ThreeDimensionShape() {
        width = height = depth = 0;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}