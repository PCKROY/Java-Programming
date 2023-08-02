package Inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        super();
        this.weight = 5;
    }
    BoxWeight(BoxWeight other){
        super(other);           // Exactly the same thing as 'Box box5 = new BoxWeight();'
        weight = other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);     // calls the parent class constructor
                           // It is used to initialize values which are present in the parent class constructor
        // If the super is not used in subclass's constructor, the default constructor from superclass will be called

        /* super keyword: When a subclass, for instances, BoxWeight, has a dependency to the super class (Box),
         we may use the super keyword. It has two use cases described below:


            1. To call the superclass constructor: For example, we have BoxWeight class which has Box as the superclass
               Now, if we use super keyword in BoxWeight class, than it will actually refer to its superclass Box.
               Similarly, if we use super keyword in Box class which doesn't have any superclass, will be referring to
               Object class as it is like the superclass from which every other classes inherited.
               So, super keyword actually points to the immediate superclass of a subclass.

            2. It can be used as the substitute of 'this' keyword but the difference is it will only be used to access
               the superclass properties i.e. super.length, super.height, super.width;
               So, if both classes have same property than to access the variable from superclass only, we can use the
               super keyword.
         */
//         System.out.println(super.weight);

        /*
        Although the subclass BoxWeight can access the all the properties of its parent class, but it will not be
        able to access those elements of the parent class that are declared as private.
         */

        this.weight = weight;

    }
}
