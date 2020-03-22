package chapter03.flow;

import chapter03.light.LightRegulator;
import chapter03.light.MockOfLEDLight;
import chapter03.sound.SoundRegulator;
import chapter03.sound.SoundControllerFactory;

public class AfterFlow {
    private SoundRegulator soundRegulator;
    private LightRegulator lightRegulator;

    public void run() {
        soundRegulator = SoundControllerFactory.getInstance().create(); // 다른 타입의 생성을 추성화함.
        soundRegulator.volumeUp();
        soundRegulator.volumeDown();
        soundRegulator.mute();

        lightRegulator = new MockOfLEDLight(); // 아직 lightController 가 구현안되었어도 flow test 가능
        lightRegulator.playPsyche();
    }
}
