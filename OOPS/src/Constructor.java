
class Car {
    String model;      //
    String color;    // Known as Data Members
    int price;      //
    Boolean isLocked = false;

    Car(String modelname, String colorname, int pricevalue){
        System.out.println("In the parametrised constructor ");
        model = modelname;
        color = colorname;
        setPrice(pricevalue);
    }

    Car(){
        System.out.println("In the default constructor ");
        model = "BMW";
        color = "Black";
        price = 700000;

    }
    void drive() {System.out.println("Vroom Vroom Vroom ");}
    void lock() {
        isLocked =  true;
        System.out.println("The car is locked ");
    }
    void unlock(){
        isLocked = false;
        System.out.println("The car is unlocked ");
    }
    /// Getter method for Price property
    float getPrice(){
        return price;
    }
    /// Setter method for price property
    void setPrice(int pricevalue){
        if(pricevalue < 0){
            pricevalue = 0;
        }
        price = pricevalue;
    }


}
class main {
    public static void main(String[] args) {
        Car c1 = new Car("Audi","Red",500000);
        Car c2 = new Car();

        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println();

        System.out.println(c2.model);
        System.out.println(c2.color);
        System.out.println(c2.price);

//        System.out.println(c1.model);   // Audi
//        System.out.println(c1.color);   // Black
//        System.out.println(c1.price);  //  1000000
//        System.out.println();
//
//        c2.model = "Volkswagen";
//        c2.price = 1200000;
//        c2.color = "Gray";
//        System.out.println(c2.model);   // Volkswagen
//        System.out.println(c2.price);   // 1200000
//        System.out.println(c2.color);   // Gray
//        System.out.println();
//
//        c1.drive();
//        c2.drive();
//        System.out.println();
//
//        c1.lock();
//        c2.unlock();
//
//        System.out.println(c1.isLocked);
//        System.out.println(c2.isLocked);
//
//        c2.price =  -50000;
//        System.out.println(c2.price);
//
//        c2.setPrice(-50000);
//        System.out.println(c2.getPrice());  // set price value to 0 for less than 0 price


    }

}


