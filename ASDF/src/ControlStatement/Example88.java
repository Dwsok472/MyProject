package ControlStatement;

public class Example88 {
    public static void main(String[] args) {
        // 학점을 판별하는 메서드
        // 90점 이상은 A학점
        // 80점 이상은 B학점
        // 70점 이상은 C학점
        // 60점 이상은 D학점
        // 60점 미만은 F학점
        System.out.println(getGrade(100)); // A
        System.out.println(getGrade(80)); // B
        System.out.println(getGrade(77)); // C
        System.out.println(getGrade(60)); // D
        System.out.println(getGrade(35)); // F
    }

    public static String getGrade(int a) {
        if (a >= 90) {
            return "90점 이상은 A학점";
        } else if (a >= 80) {
            return "80점 이상은 B학점";
        } else if (a >= 70) {
            return "70점 이상은 C학점";
        } else if (a >= 60)
        {  return "60점 이상은 D학점";
    }else
    return"60점 미만은 F학점";
}
}
