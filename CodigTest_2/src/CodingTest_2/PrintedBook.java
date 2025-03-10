package CodingTest_2;

class PritedBook extends Book {
    private int pageCount;
    private boolean isLent;

    public PritedBook(String title, String authort, int pageCount, boolean isLent) {
        super(title, authort);
        this.pageCount = 328;
        this.isLent = false;
    }
    public boolean isLent() {
        return isLent;
    }

    public void Lend() {
        if (isLent) {
            System.out.println(getTitle() + " 은 이미 대출 중입니다.");
        }else {
            isLent=true;
            System.out.println(getTitle() + "은 성공적으로 대출 처리되었습니다.");
        }
    }

    public void returnBook(){
        if(!isLent){
            System.out.println(getTitle() + "은 대출중이 아닙니다.");
        }else {
            isLent = false;
            System.out.println(getTitle() + " 성공적으로 반납되었습니다.");
        }
    }

    @Override
    void displayDetails() {
        System.out.printf(getTitle() , getAuthort() , pageCount, isLent);
    }
}
