public class NetworkAccessFacaded {

    private Conn conn = new Conn();
    private Cache cache = new Cache();
    private Interceptor interceptor  = new Interceptor();
    private Converter converter = new Converter();

    public void communicate(){
        cache.cache();
        conn.send("Some data");
        conn.receive();
        interceptor.intercept();
        converter.Convert();
    }
}
