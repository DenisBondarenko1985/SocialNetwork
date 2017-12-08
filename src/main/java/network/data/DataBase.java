package network.data;

import network.model.Post;
import network.model.User;

public class DataBase {

    public static User[] getAllUsers(){
        User users[] = new User[3];
        User user = new User ("bondarenko", "55555", 23, 5);
        User user2 = new User ("bond", "4444", 29, 7);
        User user3 = new User ("bondar", "252525", 55, 9);

        users[0] = user;
        users[1] = user2;
        users[2] = user3;

        return users;
    }

public static Post[] getAllPosts(){
        Post posts[] = new Post[4];
        Post post = new Post("post", "hello world");
        Post post1 = new Post("post1", "hi world");
        Post post2 = new Post("post2", "hi");
        Post post3 = new Post("post3", "hello");

        posts[0] = post;
        posts[1] = post1;
        posts[2] = post2;
        posts[3] = post3;

        return posts;
}

}
