public class SingletonThreadSafe {
    private static SingletonThreadSafe singletonThreadSafeInstace;

    private SingletonThreadSafe(){

    }

    public static SingletonThreadSafe getSingletonThreadSafeInstace(){
        synchronized (SingletonThreadSafe.class){
            if(singletonThreadSafeInstace==null){
                singletonThreadSafeInstace = new SingletonThreadSafe();
            }
        }
        return singletonThreadSafeInstace;
    }
}
