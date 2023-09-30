public class ObserverClient {
    public static void main(String[] ar){
        Editor editor =  new Editor();
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener();
        LogOpenListener logOpenListener = new LogOpenListener();
        editor.events.subscribe("open", emailNotificationListener);
        editor.events.subscribe("save", emailNotificationListener);
        editor.events.subscribe("save", logOpenListener);

        editor.openFile("a.png");
        editor.saveFile();

        editor.events.unsubscribe("save",emailNotificationListener);

        editor.openFile("b.png");
        editor.saveFile();
    }
}
