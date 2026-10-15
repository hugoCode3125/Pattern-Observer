package ma.horse.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private  int state;
    private List<Observer> observers = new ArrayList<Observer>();
    @Override
    public void subscribe(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(state);
        }
    }
    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return this.state;
    }

}
