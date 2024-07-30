package application;

// 차
abstract class Car {
     String vin; // 차량번호
     String color; // 차량 색상
     boolean isStart; // 시동상태, 부정값

    Car(String vin, String color, boolean isStart){
        this.vin=vin;
        this.color=color;
        this.isStart=isStart;
    }
    
    public String getVin(){
        return vin;
    }

    public void setVin(String vin){
      this.vin=vin;
    }
    
    public String getColor(){
        return color;
    }

    public void setColor(String color){
      this.color=color;
    }

}


// 수동 변속기 자동차
class ManualCar extends Car implements Vehicle{
    private int gear;// 기어상태
    private int setGear; // 기어 변속 기능 

    @Override
    public void accelerate(){
        System.out.println("수동변속기 자동차가 가속합니다!");
    }
    @Override
    public void stop(){
        System.out.println("수동변속기 자동차가 정차합니다!");

    }
    @Override
    public void setStart() {
        if (!isStart) {
            System.out.println("시동상태 : ON");
        }else{
            System.out.println("시동상태 : OFF");
        }
    }
    
    ManualCar(String vin, String color, boolean isStartm, int gear){
        super(vin,color,isStartm);
        this.gear=gear;
    }
    public void manualCar(){
        System.out.println("<<< 수동기어 변속자동차의 정보 >>>");
        System.out.println("차량 번호 = "+ vin+", 차량 색상 = "+color
        +", 시동 상태 = "+!isStart+", 기어상태 = "+gear);
    }

    public void setGear(int gear){
        this.setGear = gear;
        switch (setGear) {
            case 0: System.out.println("기어가 "+setGear+"(중립) 입니다!!");
            break;
            case 1: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            case 2: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            case 3: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            case 4: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            case 5: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            case 6: System.out.println("기어가 "+setGear+"단입니다!! ");
            break;
            }
    }

}

// 자동 변속기 자동차
class AutomaticCar extends Car implements Vehicle{
    
    AutomaticCar(String vin, String color, boolean isStartm){
        super(vin, color, isStartm);
    }

    public void automaticCar(){
        System.out.println("<<< 자동기어 변속자동차의 정보 >>>");
        System.out.println("차량 번호 = "+ vin+", 차량 색상 = "+color
        +", 시동 상태 = "+!isStart);
    }

    @Override
    public void accelerate() {
       System.out.println("자동 변속기 자동차가 가속합니다!");
    }
    @Override
    public void stop() {
        System.out.println("자동 변속기 자동차가 정차합니다!");
       
    }
    @Override
    public void setStart() {
        if (!isStart) {
            System.out.println("시동상태 : ON");
        }else{
            System.out.println("시동상태 : OFF");
        }
    }

    
}
