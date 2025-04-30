
public class Textbook extends Book {
    private int edition;

    public Textbook(String bookTitle, double bookPrice, int edition) {
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + this.edition;
    }

    public boolean canSubstituteFor(Textbook other) {
        if (getTitle().equals(other.getTitle())) {
            return this.edition >= other.edition;
        }
        return false;
    }
}
