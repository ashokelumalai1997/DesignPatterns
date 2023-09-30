public class FacadeClient {

    public static void main(String[] args){
        NetworkAccessFacaded facaded = new NetworkAccessFacaded();
        facaded.communicate();
    }
}
