package Homework.Hw_290124_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        User[] users = {
                new User("Igor", 19, new Post[]{
                        new Post("igor пост 1", "2023-01-15 15:12"),
                        new Post("igor пост 2", "2022-09-09 18:45"),
                }),
                new User("Alexey", 23, new Post[]{
                        new Post("Alexey пост 1", "2023-01-15 15:12"),
                }),
                new User("Misha", 18, new Post[]{
                        new Post("Misha пост 1", "2023-01-15 15:12"),
                        new Post("Misha пост 2", "2022-09-09 18:45"),
                        new Post("Misha пост 2", "2022-09-09 18:45"),
                }),
                new User("Dima", 25, new Post[]{}),
        };
        StringBuilder builder = getStringBuilder(users);
        System.out.println(builder);
    }

    private static StringBuilder getStringBuilder(User[] users) {
        StringBuilder builder = new StringBuilder();
        builder.append("users=[");
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            builder.append(String.format("{name=%s, age=%d", user.getName(), user.getAge()));
            if (user.getPosts().length > 0) {
                builder.append(", posts=[");
                for (int j = 0; j < user.getPosts().length; j++) {
                    Post post = user.getPosts()[j];
                    builder.append(String.format("{title=%s, posted_at=%s}", post.getTitle(), post.getPostedAt()));
                    if (j < user.getPosts().length - 1) {
                        builder.append(", ");
                    }
                }
                builder.append("]");
            }
            builder.append("}");
            builder.append(", ");

        }
        builder.delete(builder.length()-2,builder.length());
        builder.append("]");
        return builder;
    }
}

class User {
    private String name;
    private int age;
    private Post[] posts;

    public User(String name, int age, Post[] posts) {
        this.name = name;
        this.age = age;
        this.posts = posts;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Post {
    private String title;
    private String postedAt;

    public Post(String title, String postedAt) {
        this.title = title;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }
}

