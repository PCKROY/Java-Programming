package Inheritance;

public class main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);
//        box.getL();

        Box box1 = new Box(6.0);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new Box(6.0,8.0,10.0);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Box box3 = new Box(box2);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);

        BoxWeight box4 = new BoxWeight(8,7,5,55);
        System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight);


        Box box5 = new BoxWeight(5,7,9,5);   // Here box5 is a reference type of Box(Parent) class which is
//                                                          // referring to an object of BoxWeight(child) class. So, a
//                                                         // parent is referring its child
//
        System.out.println(box5.w);
//      System.out.println(box5.weight);    // Box class doesn't recognize weight property as it is
                                           //initialized in its child class.child class can recognize
                                          //the properties from its parent class , but
                                         // parent class cannot do the same.


        // There are many variables in both parent and child classes.
        //We are given access to variables that are in the reference type i.e. BoxWeight.
        //Hence, we should have access to weight variable
        // means once we are trying to access it should be initialized first.
        // But here, when the object itself is of type parent class,
        // how can it call the constructor of child class ?
        // That is why is an error

        // BoxWeight box6 = new Box(2,4,6);    // We cannot refer a child to it's parent
//        System.out.println(box6.l);



        BoxPrice box8 = new BoxPrice(6,55,160);
        System.out.println(box8.cost);

        BoxColor box20 = new BoxColor();
        System.out.println(box20.color);     // White






    }
}
