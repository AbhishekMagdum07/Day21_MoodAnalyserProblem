package com.mood_analyzer;
public class MoodAnalyzer {
    //Uc2 = Analyze message and return Happy or Sad using construceor.
    String output = null;
    String message;

    public MoodAnalyzer(String message) { // using constructor for pass message.
        this.message = message;
    }

    public String analyzeMood(String message) {
        try {
            String line = "I am in Happy Mood";
            if (message == line) {
                output = "HAPPY";
            } else
                output = "SAD";

        } catch (Exception e) {         // Handling exception here.
            System.out.println(e);
        }
        return output;
    }
}



