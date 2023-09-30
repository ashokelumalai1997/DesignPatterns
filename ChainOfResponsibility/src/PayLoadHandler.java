public class PayLoadHandler implements HandlerChain{

    String payload;
    public HandlerChain next;

    public PayLoadHandler(String payload){
        this.payload=payload;
    }
    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nPayLoad:"+payload;
        if(next==null){
            return outputHeader;
        }
        return next.addHandler(outputHeader);
    }
}
