import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by olexandra on 23.02.15.
 */
public class ConcreteSubject implements Subject{
        private List<Observer> observers = new ArrayList<>();

        public ConcreteSubject(List<Observer> observers) {
            this.observers.addAll(observers);
        }

        public void notifyObserver(Message message){
                for (Observer observer : observers) {
                        observer.notify(message);
                }
        }
        public void unregister(Observer observer){
                observers.remove(observer);
        };
        public void register(Observer observer){
                observers.add(observer);
        };
}
