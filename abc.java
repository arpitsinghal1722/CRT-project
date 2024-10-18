
public class abc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student st=new Student();
        System.out.println("before initialisation :");
        
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.fee);
        System.out.println("Enter id=");
        st.id=sc.nextInt();
        System.out.println("Enter name=");
        st.name=sc.next();
        System.out.println("Enter fee=");
        st.fee=sc.nextFloat();
        System.out.println("after initialisation :");
        System.out.println(st.id);
        System.out.println(st.name);
        System.out.println(st.fee);

    }
    /**
     * Student
     */
}
 class Student {
    int id;
    String name;
    float fee;
        
}