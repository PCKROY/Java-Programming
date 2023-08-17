package EnumExample;

public class Basic {

    enum Week implements A{
        Saturday , Sunday , Monday , Tuesday , Wednesday , Thursday , Friday;
        // These are enums constants
        // public , static , final
        // Since it's final, we can create child enums.
        // type is Week


        Week() {
            System.out.println("Constructor is called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey, what's up");
        }
        // This(enum) is not public or protected , only private or default
        // Why? Because if we created public or protected , it will allow initialization of more than one objects.
        // We only wanted to be like constant number of objects for Week. That's why it's not public or protected.

       // Internally working : public static final Week Sunday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Sunday;                // for printing the value of enum constant method 1
        week.hello();
//        for (Week day :                // for printing the value of enum constant method 2 (for each method)
//                Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());


    }
}
                /* So when we run the code the constructor will be called for each and every constant
                   no matter for which constant we try to call it. Why it acts like that ?
            => The constructor is not public or protected rather it is only private or default.
                The reason behind it is if we create a public or protected it will allow
                initialization of more than one objects (Which violates the enum concept).
                But here we only want fixed number of objects for 'Week'.

                So, internally it works like this:
                 public static final Week Sunday = new Week();

            An enum cannot be used to create objects, and it cannot extend other classes
            (but it can implement interfaces).

            Why And When To Use Enums?
            => Use enums when you have values that you know are not going to change,
                like months, days, colors, deck of cards, etc.
               */