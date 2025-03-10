import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        Album album1 = new Album();
        album1.setTitle("Java");
        album1.setReleaseYear(2024);
        System.out.println(album1.toString());

        album1.addTracks("AAA");
        album1.addTracks("BBB");
        album1.addTracks("CCC");
        album1.addTracks("DDD");
        album1.addTracks("EEE");
        album1.addTracks("FFF");
        album1.addTracks("GGG");
        System.out.println(Arrays.toString(album1.getTracks()));
    }
}

class Album {
    private String title;
    private int releaseYear;
    private String[] tracks = new String[5];
    private int countTrack;

    public Album(){
        //this.tracks = new String[5];

    }

    public Album(String title, int releaseYear, String[] tracks, int countTrack) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
        this.countTrack = countTrack;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String[] getTracks() {
        return tracks;
    }

    public void setTracks(String[] tracks) {
        this.tracks = tracks;
    }

    public int getCountTrack() {
        return countTrack;
    }

    public void setCountTrack(int countTrack) {
        this.countTrack = countTrack;
    }

    @Override
    public String toString() {
        return "앨범제목:" + this.title + ", 발매연도:" + this.releaseYear;
    }

    public void addTracks(String track){
        for ( int i = 0 ; i < this.tracks.length;i++ ){
            if (this.tracks[i] == null ) { // 비었으면
                this.tracks[i] = track; // 매개변수로 받은 곡제목 저장
                return;
            }
        }
        System.out.println("더 이상 추가할 수가 없어요: " + track);
    }
}


