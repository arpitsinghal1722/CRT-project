public class person {
    int uid;
    String name;
    address address;
    public Person(int uid, String name, Address address) {
    
        this.uid=uid;
        this.name=name;
        this.address=address;

    }
    public void printDetails() {
        System.out.println("uid :"+uid);
        System.out.println("Name:"name);
        address.printDetails();

    }
}
