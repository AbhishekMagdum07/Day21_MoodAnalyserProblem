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
            if (line != message) {
                throw new MoodAnalysisException("Enter Valid Details");
            } else {
                output = "Happy";
                return output;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return output;
    }
}



