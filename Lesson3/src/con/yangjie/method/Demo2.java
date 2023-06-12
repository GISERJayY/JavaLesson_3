package con.yangjie.method;

public class Demo2 {
    public static void main(String[] args) {
        //max(1,1);
        //int max = max(1,2);
        double max = max(2.0,3.0);
        System.out.println(max);
    }
    public static int max(int number1,int number2){
        int result = 0;
        if (number1==number2){
            System.out.println("两个数相等");
            return 0;//终止方法
        }
        if(number1>number2){
             result = number1;
        }else{
            result = number2;
        }

        return result;

    }
    //方法的重载
    public static double max(double number1,double number2){
        double result = 0;
        if (number1==number2){
            System.out.println("两个数相等");
            return 0;//终止方法
        }
        if(number1>number2){
            result = number1;
        }else{
            result = number2;
        }

        return result;

    }
}
