package chapter03.sound;

public abstract class SoundController {
    public void mute() {
        System.out.println("음소거 되었습니다.");
    }

    abstract public void volumeUp();

    abstract public void volumeDown();
}
