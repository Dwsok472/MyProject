public class Example1 {
    public static void main(String[] args) {
        // 랜덤한 정수 10개를 가진 배열에서 특정 값을 찾고 메서드
        // 그 위치 인덱스값을 리턴하는 메서드
        // 만약 못찾으면 -1 리턴
        int[] numbers = {37 , 82 , 14 ,56 , 91 , 23 , 48 , 65 , 8 ,74};
        System.out.println(findNumber(numbers, 91)); // 4
        System.out.println(findNumber(numbers, 65)); // 7
        System.out.println(findNumber(numbers,100)); // -1
    }

    public static int findNumber(int[] numbers , int target) {
        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i] == target){
                return i;
            }
        }

        return -1; // 못찾았을때는 반복문이 종료된 다음 -1을 리턴
        //int[] numbers = numbers
        //int[] numbers
        //int numbers[0] 두개는 스택이 갖고있는 데이터값이 같다
    }
    public static int findNumber2(int[] numbers, int target){
        // For-Each문사용
        int index = 0;
        for(int data : numbers){
            if (data == target) {
                return index;
            }
            index = index + 1;
        }
        return -1;
    }
}
