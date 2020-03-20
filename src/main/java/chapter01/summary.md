# chapter01 들어가기
## 1. 지저분해 지는 코드
<img src="https://user-images.githubusercontent.com/42382027/77155343-af085980-6ae0-11ea-84d8-30d41447d344.jpeg" width="400" height="250" />


위와 같은 화면 UI를 만든다고 해보자.
최조 요구기능은 메뉴1 메뉴2가 있다. 여기에 만약 메뉴3가 추가된다면
if-else 구문을 하나더 추가해야할 것이다. 

만약 중간에 버튼1도 클릭이 되었다면
각 메뉴의 if 문 마다 버튼이 호출되었는지 확인하는 if 문을 또 추가해야할 것이다.

이게 끝일까?
메뉴가 10개 이상으로 늘어나고, 버튼도 5개 이상 추가된다면
코드의 길이는 어마어마하게 길어질 것이고, 수정도 용이하지 않을 것이다.


## 2. 수정하기 좋은 구조를 가진 코드
메뉴1을 눌렀을 때와 메뉴2를 눌렀을 때 보여주는 내용은 다르지만
동작하는 기능은 비슷하다.

비슷하나 동작을 추려보면 아래와 같다.
* 메뉴가 선택되면 해당 화면을 보여준다.
* 버튼1을 클릭하면 선택된 메뉴 화면에서 알맞은 처리를 한다.

위 동작은 메뉴가 여러개 추가되어도 동일하게 동작하는 것들이다.
이 공통 동작을 표현하기 위해 ScreenUI 타입을 정의할 수 있다.
```java
public interface ScreenUI {
    void show();
    void handleButton1Click();
}
```
이 인터페이스를 이용하면 각각의 메뉴를 클릭했을 때 렌더되는 화면의 내용을
분리하여 관리할 수 있다.
```java
public class Menu1ScreenUI implements ScreenUI {
    @Override
    public void show() {
        System.out.println("메뉴 1 화면으로 전환");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("메뉴 1 화면의 버튼 1 처리");
    }
}
```

```java
public class Menu2ScreenUI implements ScreenUI {
    @Override
    public void show() {
        System.out.println("메뉴 2 화면으로 전환");
    }

    @Override
    public void handleButton1Click() {
        System.out.println("메뉴 2 화면의 버튼 1 처리");
    }
}
```

show() 와 handleButton1Click()을 공통 인터페이스로 사용하고 있기 때문에
오퍼레이션을 호출하는 주체만 변경되고 사용하는 시그니처는 동일하므로
구현을 내부로 숨길 수 있다.

버튼 2를 추가해달라는 요구사항이 들어왔다면 어떻게 할까?
버튼은 각 메뉴가 클릭되었을 때 공통으로 눌러야하는 부분이므로 인터페이스
안으로 정의가 되어야 한다.
```java
public interface ScreenUI {
    void show();
    void handleButton1Click();
    void handleButton2Click();
}
```

이렇게 추상화된 인터페이스를 기준으로 객체를 분리하게 되면 메뉴1 관련 코드르
분석하는 과정에서 불필요하게 메뉴2 관련 코드를 의식적으로
피할 필요가 없다.

여기에 menu3를 추가하면 어떻게 될까?
menu3는 다른 메뉴들과 같은 인터페이스를 구현하게 될 것이고
menu3 component 를 받았을 때 같은 오퍼레이션을 호출하는 코드만
추가해주면 된다.

* 새로운 메뉴 추가 시, 버튼 처리 코드가 영향을 받지 않음.
* 한 메뉴 관련 코드가 한 개의 클래스로 모여서 코드 분석/수정이 용이함.
* 서로 다른 메뉴에 대한 처리 코드가 섞여 있지 않아 수정이 용이함.

> 요구 사항이 바뀔 때, 그 변화를 좀 더 수월하게 적용할 수 있다는 장점을 얻었다.
> 이런 장점을 얻기 위해 사용된 것이 바로 객체 지향 기법이다. 객체 지향의 
> 어떤 내용들을 사용했는지는 설명하지 않았지만, 객체지향 기법을 적용하면
> 소프트웨어를 더 쉽게 변경할 수 있는 유연함을 얻을 수 있게 된다는 걸 뜻한다.

## 3. 소프트웨어의 가치
소프트웨어는 사용자가 요구하는 기능을 올바르게 제공하는 데 있다.
중요한 것은 요구사항은 언제나 변한다는 점이다.

따라서 소프트웨어는 변화할 수 있어야 한다. 변화가능한 유연한 구조를
만들어 주는 핵심 기법 중의 하나가 바로 객체지향이다. 