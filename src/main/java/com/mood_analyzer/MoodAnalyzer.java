package com.mood_analyzer;
public class MoodAnalyzer {
    //Uc1 = Analyze message and return Happy or Sad.
    public String analyzeMood1(String message) {
        String output = null;
        String line = "I am in Sad Mood";
        if (message ==  line ){
           output = "SAD";                      // Return happy or sad according to mood.

        }
        return output;
    }
    public String analyzeMood2(String message) {
        String output = null;
        String line = "I am in Any Mood";
        if (message ==  line ){
            output = "HAPPY";                     // Return happy or sad according to mood.

        }
        return output;
    }
}
