package com.company.chatterbook.models;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class User {
    @NotEmpty(message = "The user's name")
    private String name;

    private List<ChatterPost> chatterPosts;

    public User(String name) {
        this.name = name;
        this.chatterPosts = new ArrayList<>();

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        this.chatterPosts = new ArrayList<>();
    }

      //  public ChatterPost chatterPost(User user1, User user2) {
        ///    User newUser = new User("Sofia");
            // newUser.setnote(0);
      //  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(chatterPosts, user.chatterPosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, chatterPosts);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", chatterPosts=" + chatterPosts +
                '}';
    }

    public User(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }

    public List<ChatterPost> getChatterPosts() {
        return chatterPosts;
    }

    public <T> void getChatterPosts(List<T> asList) {
    }




}




