import java.util.*;
public class address {
    String plotno;
String area;
String pinCode;
String dist;
public Address ( String plotno, String area, String pinCode, String dist;) {
this.plotno=plotno;
this.area=area;
this.dist=dist;
this.pinCode=pinCode;
}
public void printDetails() {
    System.out.println(plotno);
    System.out.println(area);
    System.out.println(dist);
    System.out.println(pinCode);
}
}