import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlJdbcExample4 {
    // #1. 데이터베이스 커넥션 정보
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // #1. 재고수량을 매개변수로 전달하고 재고수량 미만인 제품의 제품번호,제품명,총주문건수 조회
    // Map을 사용하여 메서드내에서 출력하도록 구현
    public List<Product> getProductsWithStock(int stock) {
        List<Product> products = new ArrayList<>();
        String query = "select 제품번호, 제품명, " +
                "(select count(*) from 주문세부 where 제품.제품번호 = 주문세부.제품번호) as 총주문건수 " +
                "from 제품 where 재고 < ? ";

        try (
                Connection conn = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setInt(1, stock);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Product product = new Product();
                    product.setProductNumber(rs.getInt("제품번호"));
                    product.setProductName(rs.getString("제품명"));
                    product.setProductTotal(rs.getInt("총주문건수"));
                    products.add(product);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // #2. 매개변수로 날짜(date)와 기간(개월수)(month)를 전달하고 해당 날짜를
    // 기준으로 개월수이내의 주문정보를 골라 아래 컬럼을 조회
    // 예를들어, 2022-02-01 기준으로 3개월 이내의 주문정보
    // 사원번호, 이름, 직위
    public List<Employee> getEmployeesWithDuration(String date, int month) {
        List<Employee> employees = new ArrayList<>();
        String query = "select 사원번호 , 이름 , 직위 " +
                "from 사원 where 사원번호 in(select 사원번호 from 주문 " +
                "where 주문일 >= adddate(?,interval ? month))";
        try (
                Connection conn = DriverManager.getConnection(
                        URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(query);
        ) {
            pstmt.setString(1, date);
            pstmt.setInt(2, month);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Employee employee = new Employee();
                    employee.setEmployeeNumber(rs.getString("사원번호"));
                    employee.setName(rs.getString("이름"));
                    employee.setEmployeeClass(rs.getString("직위"));
                    employees.add(employee);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    // #3. 매개변수로 도시를 전달하고 해당도시별 고객들에 대한 주문년도별 주문건수 조회
    public void getNumOfOrdersByCity(String city){
        String query = "select year(주문일) as 주문년도, count(*) as 주문건수 " +
                "from 주문 " +
                "where 고객번호 in (select 고객번호 from 고객 where 도시 = '서울특별시') " +
                "group by 주문년도 ";
        List<Map<String,Object>> orders = new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(
                URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
               while (resultSet.next()) {
                   Map<String, Object> ByCity = new HashMap<>();
                   ByCity.put("주문년도", resultSet.getString("주문년도"));
                   ByCity.put("주문건수", resultSet.getString("주문건수"));
                   orders.add(ByCity);
               }
            for (Map<String,Object> employee : orders) {
                System.out.println(employee);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MysqlJdbcExample4 repository = new MysqlJdbcExample4();
        //repository.getProductsWithStock(4);
        //repository.getEmployeesWithDuration("2022-02-01", -3);
        //List<Employee> employees = repository.getEmployeesWithDuration("2022-02-01", -3);
        //for (Employee employee : employees ) {
            //System.out.println(employee);
            repository.getNumOfOrdersByCity("서울특별시");
        }
    }

