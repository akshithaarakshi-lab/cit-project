public class phone {
String brand = "Apple";
String model = "18 pro max";
void call(){
    System.out.println("calling from iphone");
}
void message(){
    System.out.println("messaging from iphone");
}
    public static void main(String[] args) {
    phone p1 = new phone();
    p1.call();
    p1.message();
}
}

