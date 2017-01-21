package com.example.kei.slangdict.Model;

/**
 * Created by N1cK0 on 2017/01/21.
 */

 public class Word {
    public String addedbyuser;
    public Boolean completed;
    public String meaning;
    public String word;

    public Word(){}

    public Word(String addedbyuser, Boolean completed, String meaning, String word) {
        this.addedbyuser = addedbyuser;
        this.completed = completed;
        this.meaning = meaning;
        this.word = word;
    }

    public String getaddedbyuser() {
        return addedbyuser;
    }

    public void setaddedbyuser(String addedByUser) {
        this.addedbyuser = addedByUser;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
