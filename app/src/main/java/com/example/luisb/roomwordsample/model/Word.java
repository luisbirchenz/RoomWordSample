package com.example.luisb.roomwordsample.model;

import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {
    private String mWord;

    public Word(@NonNull String mWord) {
        this.mWord = mWord;
    }

    public String getmWord() {
        return mWord;
    }
}
