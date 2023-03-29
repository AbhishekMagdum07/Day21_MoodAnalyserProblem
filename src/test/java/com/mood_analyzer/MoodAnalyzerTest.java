package com.mood_analyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {
    MoodAnalyzer object = new MoodAnalyzer();

    @Test
    void analyzeMood1(){
        String output = object.analyzeMood1("I am in Sad Mood");
        assertEquals("SAD",output);
    }
    @Test
    void analyzeMood2(){
        String output = object.analyzeMood2("I am in Any Mood");
        assertEquals("HAPPY",output);
    }

}