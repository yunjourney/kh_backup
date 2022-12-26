package 중첩인터페이스;

public class Button {
    onClickListener listener; // 인터페이스 onCli~~ 에 대한 참조변수 listener

    public void setListener(onClickListener listener) {
        this.listener = listener;
    }
    void touch() {
        listener.onClick();
    }

    interface onClickListener { // 인터페이스 생성
        void onClick(); // 추상 메소드
    }
}
class CallListener implements Button.onClickListener {

    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
class MessageListener implements Button.onClickListener {

    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
