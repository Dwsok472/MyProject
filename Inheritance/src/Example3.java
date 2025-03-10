import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        Album2 a2 = new Album2();
        a2.setTitle("Spring");
        a2.setReleaseYear(2024);
        a2.addTrack("AAA");
        a2.addTrack("BBB");
        a2.addTrack("CCC");
        List<String> temp = a2.getTracks();
        System.out.println(temp.size()); // List의 length는 size() 메서드로 확인
        System.out.println(temp); // List는 바로 출력가능

    }
}
// 배열대신 컬렉션중에 하나인 ArrayList 를 사용하는 예제
class Album2 {
    private String title;
    private int releaseYear;
    private List<String> tracks; // 원래 문자열의 배열이었던것을 List로 변경

 public Album2(){
     // List 클래스의 생성자는 ArrayList<>()를 사용함!!
     // List의 초기화
     this.tracks = new ArrayList<>();

 }

    public Album2(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "앨범제목:" + this.title + " , 발매연도:" + this.releaseYear;
    }
    public void addTrack(String track){
       tracks.add(track); // 데이터타입이 문자열이어야 함 !!
    }


    public void removeTracks(String track) {
        if (tracks.remove(track)) { // 삭제할 데이터가 있으면 true , 없으면 false 를 리턴함
            // 해당 곡이 존재하면 삭제후 true 리턴
            System.out.println("곡이 삭제되었습니다 :" + track);

        }else {
            // 해당 곡이 존재하지 않으면 그대로 false 리턴
            System.out.println("곡을 찾을 수 없습니다:" + track);
        }
    }
}