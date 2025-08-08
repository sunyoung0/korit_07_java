package ch14_abstraction.interfaces;

/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownButton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main 에서
    음량을 한 칸 내립니다.
    음량을 계속 내립니다.
    음량을 한 칸 올립니다.
    음량을 계속 올립니다. # 1 로 푸시오.
    음량을 계속 올립니다. # 2 로 푸시오.
 */

public class Main {

    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//
//        TvRemoteController tvRemoteController = new TvRemoteController(powerButton, channelDownButton, channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();


        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()); // 객체는 있지만 객체명은 없음

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();

        tvRemoteController.onPressedChannelUpButton();
        // # 1 에 대한 Main 에서의 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());

        // # 2 에 대한 Main 에서의 실행 방법
        tvRemoteController.onUpChannelUpButton2();

        System.out.println();
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton1());
        ;
        tvRemoteController.onUpVolumeUpButton2();


        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(),
                new TemperatureUpButton(), new ModeChangeButton());

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownPressedTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        airConditionerController.onUpPressedTemperatureUpButton();
        airConditionerController.onPressedModeChange();
        airConditionerController.onPressedModeChange();
        airConditionerController.onPressedPowerButton();


    }
}

// ch15_casting 패키지 생성
