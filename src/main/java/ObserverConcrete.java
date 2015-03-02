/**
 * Created by olexandra on 23.02.15.
 */
public class ObserverConcrete implements Observer {

public void notify(Message message){
    System.out.println(message.getDetails() + " " + message.getSubject());


}}
