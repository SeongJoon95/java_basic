/*
 L
정수 리스트 numList가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 메서드를 완성해주세요. 음수가 없다면 -1을 return한다.
메서드의 반환 타입은 정수 타입이고 메서드명은 solution, 매개변수의 타입은 정수의 배열로 받으면서 접근 제어는 모든 패키지에서 
사용할 수 있도록 하며 오버라이딩이 가능하고 구현부가 존재하는 인스턴스 메서드로 작성하시오.
 

제한사항
 
5 ≤ numList의 길이 ≤ 100
-10 ≤ numList의 원소 ≤ 100

입출력 예

[12, 4, 15, 46, 38, -2, 15] → 5
[13, 22, 53, 24, 15, 6] → -1

*/

package Evaluation;


class A{
    final private int legnthMin = 5;
    final private int legnthMax = 100;
    final private int elementMin = -10;
    final private int elementMax = 100;

    int solution(int[] numList){
        int answer = -1;

        if (legnthMin < numList.length && numList.length <= legnthMax) {
            for (int i = 0; i < numList.length; i++) {
                    if (elementMin <= numList[i] && numList[i] <= elementMax) {
                    if (numList[i] < 0) return answer = i;
                }else{
                    break;
                }
            }
        }
         
        return answer;
    }
}

public class number01 {
    public static void main(String[] args) {
        A a = new A();
        int numList[] = {3, -2,-3, 22, 1, 6};
        int b = a.solution(numList);

        System.out.println("");
        System.out.println("해당 값의 인덱스 : "+ b);
    }    
}
