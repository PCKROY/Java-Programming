package ExceptionHandling;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}

//                  What's the difference between error and exception ?

            /* Error is basically caused by the lack of resources
            i.e. stack overflow. Error is not recoverable or can be handled.

            Exception is an event that disrupts the normal flow of the program.
             It is an object which is thrown at runtime. i.e. dividing something
             by 0(arithmetic exception)
             In Java, there is a class called "throwable" which is responsible for
              handling the exceptions.

              Exceptions are of two types:
              i) checked: These are the exceptions checked during the compile-time.
                  for instance, you want to open a file but the file location provided
                  on the code is wrong. Then there will occur an exception.

              ii) Unchecked: These are the exceptions checked during the run-time.
                   for instance, arithmetic exceptions.
         */
