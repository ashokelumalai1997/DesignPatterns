public class ProxyClient {
    public static void main(String[] a){
        Image image = new ProxyImage("test.png");
        image.display();
        System.out.println("");
        image.display();
    }
}
