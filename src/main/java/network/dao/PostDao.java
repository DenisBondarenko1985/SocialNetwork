package network.dao;

import network.data.DataBase;
import network.model.Post;
import network.model.User;

public class PostDao {

    public Post[] getAll() {
        return DataBase.getAllPosts();

    }

}
