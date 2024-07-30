package Evaluation;

class C {
    final private int min = -2000000000;
    final private int max = 2000000000;
    
    public int solution(int number){    
        String sum = number+"";
        int answer=0;
        
        if (min <= number && max >= number) {   
            if (number > 0) {
                for (int i = 0; i < sum.length(); i++) {
                    answer += sum.charAt(i)-'0';
                }
                return answer;
            }
        }
            
               return answer;
    }
}

public class number03 {
    public static void main(String[] args) {
        // int a = ;

        C c = new C();

        int ab = c.solution(a);

        System.out.println("총 정수의 합은?? : "+ ab);
        
    }
}
