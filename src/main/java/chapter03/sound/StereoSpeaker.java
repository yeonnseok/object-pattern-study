package chapter03.sound;

public class StereoSpeaker extends SoundController {
    @Override
    public void volumeUp() {
        System.out.println("볼륨이 2 증가했습니다.");
    }

    @Override
    public void volumeDown() {
        System.out.println("볼륨이 2 감소했습니다.");
    }
}
