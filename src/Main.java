public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(solution(10));
    }
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2== 0){
                answer += i;
            }
        }
        return answer;
    }
}