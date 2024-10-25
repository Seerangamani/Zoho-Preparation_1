public class javaapti {
    String name ;
    int marks ;
   static  String std ;

    public void show()
     {
        System.out.println(name +" " + marks + " " + std);
     } 
     public static void show2(javaapti obj2)
     {
        System.out.println(obj2.name +" " + obj2.marks + " " + obj2.std);
     }
     

    public static void main(String[] args) {
      javaapti obj = new javaapti();
      obj.name = "sundar";
      obj.marks = 90 ;
      javaapti.std = "VIII";
      obj.show();
      javaapti obj2 = new javaapti();
      obj2.name = "sundar";
      obj2.marks = 90 ;
      javaapti.std = "VIII";
      javaapti.show2(obj2);

    }
 
}
