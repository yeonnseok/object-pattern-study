package chapter03.sound;

import java.util.Scanner;

public class SoundControllerFactory {
    private static final Scanner SCANNER = new Scanner(System.in);

    public SoundController create() {
        if (pairable()) {
            return new BluetoothSpeaker();
        } else {
            return new StereoSpeaker();
        }
    }

    private boolean pairable() {
        return SCANNER.nextLine().equals("yes");
    }

    private static SoundControllerFactory instance;
    public static SoundControllerFactory getInstance() {
        if (instance == null) {
            return new SoundControllerFactory();
        }
        return null;
    }

    private SoundControllerFactory() {};
}
