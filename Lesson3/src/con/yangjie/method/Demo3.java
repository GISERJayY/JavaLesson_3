package con.yangjie.method;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            System.out.println("args["+i+"]"+args[i]);
            // javac Demo3.java 先对代码进行编译
            // 再传参数 java com.yangjie.method.Demo3
        }
    }
}
