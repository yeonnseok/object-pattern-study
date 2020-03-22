package chapter01;

import java.util.Arrays;

public enum ScreenCreator {
    MENU_1("menu1", new Menu1ScreenUI()),
    MENU_2("menu2", new Menu2ScreenUI()),
    MENU_3("menu3", new Menu3ScreenUI());

    private String id;
    private ScreenUI screenUI;

    ScreenCreator(String id, ScreenUI screenUI) {
        this.id = id;
        this.screenUI = screenUI;
    }

    public static ScreenUI of(String targetId) {
        return Arrays.stream(values())
                .filter(m -> m.id.equals(targetId))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("선택할 수 없는 메뉴입니다."))
                .screenUI;
    }
}
