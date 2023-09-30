public class StrategyClient {
    public static void main(String[] arg){
        LowerCaseStrategy strategy1 = new LowerCaseStrategy();
        UpperCaseStrategy strategy2 = new UpperCaseStrategy();
        RandomCaseStrategy strategy3 = new RandomCaseStrategy();
        String input = "Life is good";
        Executor executor = new Executor(strategy1);
        executor.printString(input);
        executor.strategy=strategy2;
        executor.printString(input);
        executor.strategy=strategy3;
        executor.printString(input);
    }
}
