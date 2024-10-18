public class test3 {
    public static void main(String[] args) {
        XYZ x = new XYZ();
        x.say();
        x.hello();

    }
}

abstract class ABC {
    ABC(int a) {
        System.out.println("constructor with parameter");
    }

    public abstract void say();

    public void hello() {
        System.out.println("hello from class ABC");

    }
}

class XYZ extends ABC {
    public XYZ() {
        super(10);
                    
    }

    @Override
    public void say() {
        System.out.println("hello from XYZ");
    }
}