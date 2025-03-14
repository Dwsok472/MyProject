//요구사항:
//
//        1. 추상 클래스: Vehicle
//필드:
//String modelName : 모델명
//int maxSpeed : 최대 속도
//생성자:
//Vehicle(String modelName, int maxSpeed) : 모델명과 최대 속도를 초기화
//메서드:
//abstract void drive(); : 차량 운전 방식 (추상 메서드)
//final void displayInfo() : 모델명과 최대 속도를 출력
//
//
//2. 클래스: Car
//Vehicle을 상속받습니다.
//필드:
//int seatingCapacity : 좌석 수
//생성자:
//Car(String modelName, int maxSpeed, int seatingCapacity)
//메서드:
//@Override void drive() : "도로에서 운전 중입니다." 출력
//void airConditioning() : "에어컨이 작동합니다." 출력
//
//
//3. 클래스: ElectricCar
//Car를 상속받습니다.
//필드:
//int batteryCapacity : 배터리 용량 (kWh 단위)
//생성자:
//ElectricCar(String modelName, int maxSpeed, int seatingCapacity, int batteryCapacity)
//메서드:
//void charge() : "배터리를 충전 중입니다." 출력
//
//
//4. 인터페이스: Maintenance
//메서드:
//void performMaintenance(); : 차량 유지보수 수행
//
//
//5. 클래스: Truck
//Vehicle을 상속받고 Maintenance 인터페이스를 구현합니다.
//        필드:
//int loadCapacity : 적재 용량 (톤 단위)
//생성자:
//Truck(String modelName, int maxSpeed, int loadCapacity)
//메서드:
//@Override void drive() : "화물을 싣고 운전 중입니다." 출력
//@Override void performMaintenance() : "트럭 유지보수를 수행 중입니다." 출력
//
//
//## 실행결과 ##
//Model: Tesla Model S, Max Speed: 250
//도로에서 운전 중입니다.
//에어컨이 작동합니다.
//
//Model: Tesla Cybertruck, Max Speed: 180
//화물을 싣고 운전 중입니다.
//트럭 유지보수를 수행 중입니다.
//
//Model: Nissan Leaf, Max Speed: 150
//도로에서 운전 중입니다.
//배터리를 충전 중입니다.