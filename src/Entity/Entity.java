package Entity;

public class Entity {
    private int number;
    private String says;
    private String author;

    public Entity(int number, String says, String author) {
        this.number = number;
        this.says = says;
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public String getSays() {
        return says;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSays(String says) {
        this.says = says;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getList() {
        return number + "      " + author + "      " + says;
    }
}
