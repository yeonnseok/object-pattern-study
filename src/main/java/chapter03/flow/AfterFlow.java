package chapter03.flow;

import chapter03.light.LightController;
import chapter03.light.MockOfLEDLight;
import chapter03.sound.SoundController;
import chapter03.sound.SoundControllerFactory;

public class AfterFlow {
    private SoundController soundController;
    private LightController lightController;

    public void run() {
        soundController = SoundControllerFactory.getInstance().create(); // 다른 타입의 생성을 추성화함.
        soundController.volumeUp();
        soundController.volumeDown();
        soundController.mute();

        lightController = new MockOfLEDLight(); // 아직 lightController 가 구현안되었어도 flow test 가능
        lightController.playPsyche();
    }
}
