package com.example.luisb.roomwordsample.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.luisb.roomwordsample.model.Word;

import java.util.List;

@Dao
public interface WordDao {
    @Insert
    void insert(Word word);
    @Query("DELETE FROM word_table")
    void deleteAll();
    @Query("SELECT * from word_table ORDER BY word ASC")
    List<Word> getAllWords();
}
