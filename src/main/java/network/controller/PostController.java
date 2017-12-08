package network.controller;

import network.model.Post;
import network.service.PostService;

public class PostController {

    public static void main(String[] args) {
        PostService postService = new PostService();
        Post[] posts = postService.getAll();

        for (Post post : posts) {
            System.out.println(post);
        }
    }
}
