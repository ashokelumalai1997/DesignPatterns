public class SingletonStaticBlock {
    private static SingletonStaticBlock SingletonStaticBlock;

    static {
        SingletonStaticBlock = new SingletonStaticBlock();
    }

    private SingletonStaticBlock() {

    }

    public static SingletonStaticBlock getSingletonStaticBlock(){
        return SingletonStaticBlock;
    }
}
