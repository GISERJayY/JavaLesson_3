package con.yangjie.method;

public class test {
    public static void main(String[] args) {
        printMax(35,34,31);
        //printMax(new double[]{1,2,3});

    }
    public static void printMax(double... numbers){
        System.out.println(numbers[1]);
    }
}
