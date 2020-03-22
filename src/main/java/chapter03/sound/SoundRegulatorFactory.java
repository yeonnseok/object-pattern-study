package chapter03.sound;

import java.util.Scanner;

public class SoundRegulatorFactory {
    private static final Scanner SCANNER = new Scanner(System.in);

    public SoundRegulator create() {
        if (pairable()) {
            return new BluetoothSpeaker();
        } else {
            return new StereoSpeaker();
        }
    }

    private boolean pairable() {
        return SCANNER.nextLine().equals("yes");
    }

    private static SoundRegulatorFactory instance;
    public static SoundRegulatorFactory getInstance() {
        if (instance == null) {
            return new SoundRegulatorFactory();
        }
        return null;
    }

    private SoundRegulatorFactory() {};
}
