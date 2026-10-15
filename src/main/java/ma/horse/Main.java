package ma.horse;

import ma.horse.obs.ObservableImpl;
import ma.horse.obs.ObserverImpl;
import ma.horse.obs.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObservableImpl obs = new ObservableImpl();

        ObserverImpl observer1 = new ObserverImpl();
        ObserverImpl2 observer2 = new ObserverImpl2();

        obs.subscribe(observer1);
        obs.subscribe(observer2);

        obs.setState(1);
        obs.setState(10);
        obs.unsubscribe(observer1);
        obs.setState(100);

    }
}