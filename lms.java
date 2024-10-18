public class lms {
    public static void main(String[] args) {
        ABC a=XYZ.getObj(a.data);
        System.out.println();
        a.say();

    }
}
  class ABC {
    int data = 100;
    public void say() {
        System.out.println("data= " +data);

    }
  }
 class XYZ {
    public static ABC getObj() {
        return new ABC();
    }
 }
    
 