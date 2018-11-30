package com.example.luisb.roomwordsample.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    private int id;

    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getWord() {
        return mWord;
    }

    public int getId(){ return id;}

    public void setId(int value) { this.id = value;}
}
