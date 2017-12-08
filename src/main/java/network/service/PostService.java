package network.service;

import network.dao.PostDao;
import network.dao.UserDao;
import network.model.Post;
import network.model.User;

public class PostService {

    public Post[] getAll() {
        PostDao postDao = new PostDao();
        return postDao.getAll();

    }

}
