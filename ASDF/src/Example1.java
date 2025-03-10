public class Example1 {
    public static void main(String[] args) {
        // 랜덤한 정수 10개를 가진 배열에서 특정 값을 찾고
        // 그 위치 인덱스값을 리턴하는 메서드
        // 만약 못찾으면 -1 리턴
        int[] numbers = {37, 82, 14, 56, 91, 23, 48, 65, 8, 74};
        System.out.println(findNumber(numbers, 91)); // 4
        System.out.println(findNumber(numbers, 65)); // 7
        System.out.println(findNumber(numbers, 100)); // -1
    }

 public static int findNumber(int[]numbers , int a) {
     for (int i = 0; i < numbers.length; i++) {
         if(numbers[i]==a)
             return i;
     }
         return -1;
     }

 }