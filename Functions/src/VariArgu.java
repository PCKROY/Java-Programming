public class VariArgu {             // variargu = Variables Arguments

    static float getavg(float...variargu){
        float total = 0;

        for(float num : variargu){
            total = total + num ;
        }

        return total / variargu.length;
    }
    public static void main(String[] args) {
        float avg = getavg(2,5,6,8,9,10,45);
        float avg1 = getavg(0,3,5,1,7);

        System.out.println(avg);
        System.out.println(avg1);
    }
}
