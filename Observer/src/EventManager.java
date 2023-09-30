import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listners = new HashMap<>();

    public EventManager(String ... operations){
        for(String op: operations)
            listners.put(op, new ArrayList<>());
    }

    public void subscribe(String event, EventListener listener){
        List<EventListener> users = listners.get(event);
        if(!users.contains(listener)){
            users.add(listener);
        }

    }

    public void unsubscribe(String event, EventListener listener){
        List<EventListener> users = listners.get(event);
        if(users.contains(listener)){
            users.remove(listener);
        }

    }

    public void notify(String event, String file){
        List<EventListener> users = listners.get(event);
        for(EventListener user : users){
            user.notify(event,file);
        }
    }

}
