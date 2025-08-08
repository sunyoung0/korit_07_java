package ch14_abstraction.interfaces;

// button 은 객체 생성을 못하기 때문에 여기서 구현해줌
public class ChannelDownButton extends Button {

    @Override
    public void onPressed() {
        System.out.println("채널을 한칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }

}
