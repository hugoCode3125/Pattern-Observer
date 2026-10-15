package ma.horse.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("*******OBS Impl 1*********");
        System.out.println("State Changed : " + newState);
        System.out.println("*******OBS Impl 1*********");
    }
}
