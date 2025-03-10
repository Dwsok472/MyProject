package CodingTest_2;

abstract public class Book {
    private String title;
    private String authort;

    public Book(String title, String authort) {
        this.title = "Digital Minimalism";
        this.authort = "Cal Newport";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthort() {
        return authort;
    }

    abstract void displayDetails();
}

