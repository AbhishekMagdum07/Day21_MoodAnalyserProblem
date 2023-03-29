package com.mood_analyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {
    String message = "I am in Happy Mood";
    MoodAnalyzer object = new MoodAnalyzer(message); // output should be Sad.

    @Test
    void analyzeMood1(){
        String output = object.analyzeMood();
        assertEquals("SAD",output);
    }

}