package chapter03.flow;

import chapter03.sound.BluetoothSpeaker;
import chapter03.light.LightRegulator;
import chapter03.sound.SoundRegulator;
import chapter03.sound.StereoSpeaker;

import java.util.Scanner;

public class BeforeFlow {
    private static final Scanner SCANNER = new Scanner(System.in);

    private SoundRegulator soundRegulator;
    private LightRegulator lightRegulator;

    public void run() {
        if (pairable()) {
            soundRegulator = new BluetoothSpeaker();
        } else {
            soundRegulator = new StereoSpeaker();
        }
        soundRegulator.volumeUp();
        soundRegulator.volumeDown();
        soundRegulator.mute();
    }

    private boolean pairable() {
        return SCANNER.nextLine().equals("yes");
    }
}
