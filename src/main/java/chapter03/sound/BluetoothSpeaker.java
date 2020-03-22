package chapter03.sound;

public class BluetoothSpeaker extends SoundRegulator implements Bluetooth{
    @Override
    public void volumeUp() {
        System.out.println("볼륨이 1 증가했습니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("볼륨이 1 감소했습니다.");
    }

    @Override
    public void mute() {
        System.out.println("음소거 되었습니다.");
    }

    @Override
    public void pairOn() {
        System.out.println("페어링 되었습니다.");
    }

    @Override
    public void pairOff() {
        System.out.println("페어링이 해제 되었습니다.");
    }
}
