package com.mood_analyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {
    String message = "I am in Sad Mood";
    MoodAnalyzer object = new MoodAnalyzer(message);

    @Test
    void analyzeMood1(){
        String output = object.analyzeMood();
        assertEquals("SAD",output);
    }

}