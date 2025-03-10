package CodingTest_2;

public class EBook extends Book {
    private double fileSize;
    private int accessCount;

    public EBook(String title, String authort, double fileSize, int accessCount) {
        super(title, authort);
        this.fileSize = fileSize;
        this.accessCount = accessCount;
    }
    public EBook(String title , String author, double fileSize){
        super(title,author);
        this.fileSize = 1.5;
        this.accessCount = 0;
    }
    public void access(){
        accessCount++;
        System.out.println(getTitle() + "조회 횟수:" +accessCount);
    }

    @Override
    void displayDetails() {
        System.out.printf(getTitle() , getAuthort() , fileSize, accessCount);
    }
}