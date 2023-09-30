public class ChainOfResponsibilityClient {
    public static void main(String[] arg){
        AuthenticationHandler authenticationHandler = new AuthenticationHandler("12345");
        ContentTypeHandler contentTypeHandler = new ContentTypeHandler("JSON");
        PayLoadHandler payLoadHandler = new PayLoadHandler("Body:{\"username\"=\"ae\"}");

        authenticationHandler.next = contentTypeHandler;
        contentTypeHandler.next = payLoadHandler;

        String withAuthentication = authenticationHandler.addHandler("Headers with authentication");
        System.out.println(withAuthentication);

        System.out.println("");
        String withoutAuthentication = contentTypeHandler.addHandler("Headers without auth");
        System.out.println(withoutAuthentication);
    }
}
