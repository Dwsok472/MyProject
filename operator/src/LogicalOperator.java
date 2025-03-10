public class LogicalOperator {
    public static void main(String[] args) {
        // 논리연산자 (&& , || , ^ , ! )
        // 하나라도 false 면 false ( 앤드 )
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true && (5<3));
        System.out.println((5<=5) && (7>2));
        System.out.println();

        // 하나라도 true 면 true ( 올 )
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || (5<3));
        System.out.println((5<=5) || (7>2));
        System.out.println();

        // 두개가 다르면 true ( 엑스올 )
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ (5<3));
        System.out.println((5<=5) ^ (7>2)); //(쇼트서킷)
        System.out.println();

        // 입력값에 반대로 나옴 ( 낫 )
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(false || !(5<3));
        System.out.println((5<=5) || !(7>2));

        // 쇼트서킷
        int value1 = 3;
        System.out.println(false && ++value1>6); // false
        System.out.println(value1); // 3 , 쇼트서킷이 발생하여 ++value1 실행안됨


        // 비트연산자
        System.out.println(true & false);
        System.out.println(true | (5<3));
        System.out.println((5>=5)^(7>2));

    }
}
