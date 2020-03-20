package chapter03.flow;

import chapter03.sound.BluetoothSpeaker;
import chapter03.light.LightController;
import chapter03.sound.SoundController;
import chapter03.sound.StereoSpeaker;

import java.util.Scanner;

public class BeforeFlow {
    private static final Scanner SCANNER = new Scanner(System.in);

    private SoundController soundController;
    private LightController lightController;

    public void run() {
        if (pairable()) {
            soundController = new BluetoothSpeaker();
        } else {
            soundController = new StereoSpeaker();
        }
        soundController.volumeUp();
        soundController.volumeDown();
        soundController.mute();
    }

    private boolean pairable() {
        return SCANNER.nextLine().equals("yes");
    }
}
