package application;

// 기차
public class Train{
    String trainNumber; //열차번호
    String departureStation; // 출발역
    String arrivalStation; // 도착역
    boolean isStart; // 시동 상태

    Train(String trainNumber, String departureStation, String arrivalStation, boolean isStart){
        this.trainNumber=trainNumber;
        this.departureStation=departureStation;
        this.arrivalStation=arrivalStation;
        this.isStart=isStart;
    }

    public String getTrainNumber(){
        return trainNumber;
    }
    public void setTrainNumber(String trainNumber){
        this.trainNumber=trainNumber;
    }

    public String getDepartureStation(){
        return departureStation;
    }
    public void setDepartureStation(String departureStation){
        this.departureStation=departureStation;
    }
    
 }

//  여객열차
class PassengerTrain extends Train implements Vehicle{
    private int passengerCount; // 탑승객 수
    
    @Override
    public void accelerate() {
        System.out.println("여객열차가 천천히 가속합니다!");
    }
    
    @Override
    public void stop() {
        System.out.println("여객열차가 천천히 정차합니다!");
    }
    
    @Override
    public void setStart() {
        if (!isStart) {
            System.out.println("시동상태 : ON");
        }else{
            System.out.println("시동상태 : OFF");
        }
    }
    
    PassengerTrain(String trainNumber, String departureStation, 
                    String arrivalStation, boolean isStart, int passengerCount) {
        super(trainNumber, departureStation, arrivalStation, isStart);
        this.passengerCount = passengerCount;
    }

    void passengerTrain(){
        System.out.println("<<< 여객열차 정보 >>>");
        System.out.println("열차번호 = "+trainNumber+", 출발역 = "+departureStation+
        ", 도착역 = "+arrivalStation+", 시동상태 = "+!isStart+", 탑승객 수 = "+passengerCount+"명 입니다.");
    }
}

// 화물열차
class FreightTrain  extends Train implements Vehicle{
    private double cargoWeight; //화물 무게
    
    FreightTrain(String trainNumber, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
        super(trainNumber, departureStation, arrivalStation, isStart);
        this.cargoWeight=cargoWeight;
    }

    @Override
    public void accelerate() {
        System.out.println("화물열차가 천천히 가속합니다!");
    }
    @Override
    public void stop() {
        System.out.println("화물열차가 천천히 정차합니다!");
      
    }
    @Override
    public void setStart() {
        if (!isStart) {
            System.out.println("시동상태 : ON");
        }else{
            System.out.println("시동상태 : OFF");
        }
    }
    public void freightTrain(){
        System.out.println("<<< 화물열차 정보 입니다! >>>");
        System.out.println("열차번호 = "+trainNumber+", 출발역 = "+departureStation+
        ", 도착역 = "+arrivalStation+", 시동상태 = "+!isStart+", 화물무게 = "+cargoWeight);
    }
}