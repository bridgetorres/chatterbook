package com.company.chatterbook.models;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;
public class ChatterPost {
    @NotEmpty (message="Add what you want to write")
    private String text;
    @NotEmpty(message="What you post!")
    private String ChatterPost;


    public ChatterPost(String text) {
        this.text = text;


    }

    public String getChatterPost(){
        return ChatterPost;
    }
    public void setChatterPost(String ChatterPost){
        this.ChatterPost = ChatterPost;
    }


    public String getText(){
        return text;
    }

    public void setText(String text) {
    this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatterPost that = (ChatterPost) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }


}