import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlJdbcExample2 {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #2. INSERT
    // 부서테이블에 새로운 행 추가
    public void insertDepartment(String departmentNumber, String DepartmentName) {
        String query = "insert into 부서(부서번호,부서명) "
                + "values (?, ?)"; // ?자리에 매개변수를 넣을 예정
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, departmentNumber);
                pstmt.setString(2, DepartmentName);
                pstmt.executeUpdate();
            System.out.println("INSERT 성공");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // #3. UPDATE
    public void updateDepartment(String oldName, String newName) {
        String query = "update 부서 set 부서명=? where 부서명=? ";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, newName);
            pstmt.setString(2, oldName);
            pstmt.executeUpdate();
            System.out.println("UPDATE 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertProduct(int productNumber, String productName, String productPackagingUnit,
                              int price , int inventory) {
        String query = "insert into 제품(제품번호,제품명,포장단위,단가,재고) "
                + "values (?, ?, ?, ?, ?)"; // ?자리에 매개변수를 넣을 예정
        try(Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, productNumber );
            pstmt.setString(2, productName);
            pstmt.setString(3, productPackagingUnit);
            pstmt.setInt(4, price);
            pstmt.setInt(5, inventory);
            pstmt.executeUpdate();
            System.out.println("INSERT 성공");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    Statement 와 PreparedStatement 차이점 설명
    1. SQL Injection 취약성
        S : 매우 취약, P : 안전
    2. 캐심 - S : 항상 새로운 쿼리 실행, P : 동일한 쿼리는 캐싱하여 성능향상
    3. 가독성 - S : 코드가 복잡하면 알아보기 어려움, P : 가독성이 향상
     */


    public static void main(String[] args) {
        MysqlJdbcExample2 repository = new MysqlJdbcExample2();
//        repository.insertDepartment("A6" , "총무부");
//        repository.insertDepartment("A7" , "해외영업부");
//        repository.updateDepartment("해외영업부" , "글로벌영업부");
        repository.insertProduct(93 , "새우깡", "500g pkgs"
        , 2000 , 100);
    }



[
    {
    "departmentNumber" : "A6",
    "departmentName" : "총무부"
    },
    {
    "departmentNumber" : "A7",
    "departmentName" : "해외영업부"
    }
]
}