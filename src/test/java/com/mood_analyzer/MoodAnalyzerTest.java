package com.mood_analyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyzerTest {
    String message = "";
    MoodAnalyzer object = new MoodAnalyzer(message);

    @Test
    void analyzeMood1(){
        String output = object.analyzeMood(message);
        assertEquals(null,output);
    }

}