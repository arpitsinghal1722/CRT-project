import java.util.*;
public class inputand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee st=new Employee();
        System.out.println("before initialisation :");
        
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.salary);
        System.out.println("Enter id=");
        st.id=sc.nextInt();
        System.out.println("Enter name=");
        st.name=sc.next();
        System.out.println("Enter salary=");
        st.salary=sc.nextFloat();
        System.out.println("after initialisation :");
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.salary);

    }
    
}
 class Employee {
    int id;
    String name;
    float salary;
        
}


