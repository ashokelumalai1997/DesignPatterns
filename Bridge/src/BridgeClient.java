public class BridgeClient {

    public static void main(String[] args){
        App app1 = new FaceBook(new IOS());
        App app2 = new Instagram(new Android());

        app1.runApp();
        app2.runApp();
    }
}
