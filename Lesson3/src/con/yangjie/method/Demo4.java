package con.yangjie.method;

public class Demo4 {
    public static void main(String[] args) {
        printMax(35,34,31);
        printMax(new double[]{1,2,3});

    }
    public static void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("no argument passed");
            return;
        }
        double result = numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>result){    //result以及赋予初始值 result：35
                result = numbers[i];
            }

        }
        System.out.println(result);
    }
}
