//package chapter01;
//
//import java.awt.*;
//
//public class Application extends AppCom{
//    private Menu menu1 = new Menu("menu1");
//    private Menu menu2 = new Menu("menu2");
//    private Menu menu3 = new Menu("menu3");
//    private Button button1 = new Button("button1");
//
//    private ScreenUI currentScreen = null;
//
//    public Application() {
//        menu1.setOnClickListener();
//        menu2.setOnClickListener();
//        menu3.setOnClickListener();
//        button1.setOnClickListener();
//    }
//
//    private OnClickListener menuListener = new OnClickListener() {
//        public void clicked(Component eventSource) {
//            ScreenUI screenUI = ScreenCreator.of(eventSource.getId());
//            screenUI.show();
//        }
//    }
//
//    private OnClickListener buttonListener = new OnClickListener() {
//        public void clicked(Component eventSource) {
//            if (currentScreen == null) {
//                return;
//            }
//
//            if (eventSource.getId().equals("button1")) {
//                currentScreen.handleButton1Click();
//            } else if (eventSource.getId().equals("button2")) {
//                currentScreen.handleButton2Click();
//            }
//        }
//
//    }
//
//
//
//}
