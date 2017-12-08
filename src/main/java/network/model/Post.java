package network.model;

public class Post {

    private String title;
    private String text;

    public Post() {

    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }

    public Post(String title, String text) {
        this.title = title;
        this.text = text;
    }
}
