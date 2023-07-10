
class complexnumber{
    int real;
    int img;

    complexnumber(int real , int img){       // constructor method
       this.real = real;
        this.img = img;
    }

//    void print(){         // don't need print() method if we use toString method
//        // 2 + 3i
//
//        System.out.println(this.real + " + " + this.img + "i");
//    }

    complexnumber add(complexnumber y){
        int sum_real = this.real + y.real;
        int sum_img = this.img + y.img;
        complexnumber result = new complexnumber(sum_real,sum_img);
        return result;
    }
    public String toString(){
        return this.real + " + " + this.img + "i";
    }
}
public class complexProblem {
    public static void main(String[] args) {

        complexnumber x = new complexnumber(4,3);
//        x.real = 4;
//        x.img = 3;
//        x.print();                // print() method
        System.out.println(x);      // toString method
        complexnumber y = new complexnumber(-5,3);
//        y.real = -5;
//        y.img = 3;
//        y.print();                // print() method
        System.out.println(y);      // toString method

        complexnumber z = x.add(y);
//        z.print();                // print() method
        System.out.println(z);      // toString method




    }
}
