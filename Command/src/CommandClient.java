public class CommandClient {

    public static void main(String[] arg){
        CommandProcessor processor = new CommandProcessor();
        processor.addCommand(new OrderAddCommand(1, 12.9))
        .addCommand(new OrderExecuteCommand(2))
                .addCommand(new OrderExecuteCommand(3))
                .addCommand(new OrderExecuteCommand(4));
        processor.execute();

    }
}
