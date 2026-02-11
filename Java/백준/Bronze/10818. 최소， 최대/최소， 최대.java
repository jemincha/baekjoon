import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // [빈칸 A] 최소값(min)과 최대값(max)을 저장할 변수를 초기화하십시오.
        // 힌트: min은 가능한 가장 큰 값(Integer.MAX_VALUE)으로, 
        //       max는 가능한 가장 작은 값(Integer.MIN_VALUE)으로 설정하는 것이 정석입니다.
        int min = Integer.MAX_VALUE; // min 초기화
        int max = Integer.MIN_VALUE; // max 초기화

        for (int i = 0; i < N; i++) {
            int current = Integer.parseInt(st.nextToken());
            
            // [빈칸 B] 현재 값(current)과 기존의 min, max를 비교하여 갱신하십시오.
            // 힌트: if문을 사용하거나 Math.min(), Math.max() 함수를 활용할 수 있습니다.
            if (current < min) {
                min = current;
            } // min 갱신 로직
            
            if (current > max) {
                max = current;// max 갱신 로직
            }     
        }
        
        // [빈칸 C] 최종 결과를 "최소 최대" 형식으로 출력하십시오.
        System.out.println(min + " " + max); 
        
        br.close();
    }
}