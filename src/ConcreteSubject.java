import java.util.LinkedList;
import java.util.List;

/**
 * Created by olexandra on 23.02.15.
 */
public class ConcreteSubject implements Subject{
        List<Observer> observers = new LinkedList<Observer>();

        public void notifyObserver(Message message){
                for (Observer observer : observers) {
                        observer.notify();
                }
        }
        public void unregister(Observer observer){
                observers.remove(observer);
        };
        public void register(Observer observer){
                observers.add(observer);
        };
}
