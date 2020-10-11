public class Televisor {
    private boolean isTurnedOn;

    public Televisor(boolean isTurnedOn) { this.isTurnedOn = isTurnedOn; }

    public boolean turnOn() { return isTurnedOn = true; }

    public boolean turnOff() { return isTurnedOn = false; }

    public void showStatus() {
        System.out.println("Czy telewizor włączony? " + isTurnedOn);
    }
}
