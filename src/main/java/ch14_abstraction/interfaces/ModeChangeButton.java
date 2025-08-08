package ch14_abstraction.interfaces;

public class ModeChangeButton {

    private boolean change;

    public void modeChange() {
        if(change) {
            change = false;
            System.out.println("냉방으로 바꿉니다.");
        } else {
            change = true;
            System.out.println("난방으로 바꿉니다.");
        }
    }

}
