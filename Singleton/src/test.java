public class test {


    public static void main(String[] args) {

        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);

        SingletonStaticBlock singletonStaticLock1 = SingletonStaticBlock.getSingletonStaticBlock();
        SingletonStaticBlock singletonStaticLock2 = SingletonStaticBlock.getSingletonStaticBlock();

        System.out.println(singletonStaticLock1);
        System.out.println(singletonStaticLock2);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.println(singletonLazy1);
        System.out.println(singletonLazy2);

        SingletonThreadSafe singletonThreadSafe1 =  SingletonThreadSafe.getSingletonThreadSafeInstace();
        SingletonThreadSafe singletonThreadSafe2 =  SingletonThreadSafe.getSingletonThreadSafeInstace();

        System.out.println(singletonThreadSafe1);
        System.out.println(singletonThreadSafe2);

        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();

        System.out.println(singletonBillPugh1);
        System.out.println(singletonBillPugh2);
    }
}
