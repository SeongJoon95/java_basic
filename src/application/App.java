package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수동 변속기 자동차
        System.out.print("수동 변속 자동차의 기어상태를 확인해 주세요 [0: 중립 // 1~6단] 중 택1 : ");
        int gear = sc.nextInt();
        
        
        ManualCar mCar = new ManualCar("10가 1234", "blue", false, gear);
        System.out.println("======================================================================");
        mCar.manualCar();

        mCar.accelerate();
        mCar.stop();
        mCar.setStart();
        mCar.setGear(gear);

        // 자동 변속기 자동차
        System.out.println("======================================================================");
        AutomaticCar aCar = new AutomaticCar("88나 5426", "red", false);
        aCar.automaticCar();
        
        aCar.accelerate();
        aCar.stop();
        aCar.setStart();

        // 여객 열차
        System.out.println("======================================================================");
        PassengerTrain pTrain = new PassengerTrain("KTX001","서울","부산"
        ,true, 0);
        pTrain.passengerTrain();

        pTrain.accelerate();
        pTrain.stop();
        pTrain.setStart();

        
        // 화물열차
        System.out.println("======================================================================");
        FreightTrain fTrain = new FreightTrain("Cargo001","서울","구미"
        ,false, 100.0);
        fTrain.freightTrain();

        fTrain.accelerate();
        fTrain.stop();
        fTrain.setStart();

        sc.close();
    }
}
