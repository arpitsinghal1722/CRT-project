import java.util.*;
public class test {
    public static void main(String[] args) {
        MyUtils myUtils=new MyUtils();
        myUtils.saySomething();
        myUtils.saySomething();
        myUtils.saySomething();
        myUtils.saySomething();
        myUtils.saySomething();
        myUtils.saySomething();
        myUtils.getFact();
    }
}
class MyUtils{
    public void saySomething() {
        System.out.println("hello");

    }
    public void getFact() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ::");
        int num=sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++) {
            fact=fact*i;
        }
        System.out.println("factorial="+fact);
}
}