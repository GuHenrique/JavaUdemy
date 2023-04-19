import entities.Comment;
import entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime d1 = LocalDateTime.parse("12/02/2023 12:20:32", dtf);
        LocalDateTime d2 = LocalDateTime.parse("08/03/2023 22:30:23", dtf);


        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(d1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");
        Post p2 = new Post(d2, "Good night guys!", "See you tomorrow", 5);

        p1.addComments(c1);
        p1.addComments(c2);
        p2.addComments(c3);
        p2.addComments(c4);
        System.out.println(p1);
        System.out.println(p2);

    }
}