/**
 * Created by olexandra on 23.02.15.
 */
public interface Subject {
    public void notifyObserver(Message message);
    public void unregister(Observer observer);
    public void register(Observer observer);
}
