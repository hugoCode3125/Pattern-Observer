package ma.horse.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(Observable obs) {
        if (obs instanceof ObservableImpl obsImpl) {
            System.out.println("*******OBS Impl 1*********");
            System.out.println("State Changed : " + obsImpl.getState());
            System.out.println("*******OBS Impl 1*********");
        }

    }
}
