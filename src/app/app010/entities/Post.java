package app.app010.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;

    List<Comment> comments = new ArrayList<>();

    public Post(Date momment, String title, String content, Integer likes) {
        this.moment = momment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMomment() {
        return moment;
    }

    public void setMomment(Date momment) {
        this.moment = momment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(moment)).append("\n");
        sb.append(content).append("\n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
