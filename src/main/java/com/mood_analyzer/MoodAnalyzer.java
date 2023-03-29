package com.mood_analyzer;
public class MoodAnalyzer {
    //Uc2 = Analyze message and return Happy or Sad using construceor.
   String output = null;
    String message;

    MoodAnalyzer(String message){ // using constructor for pass message.
        this.message = message;
    }
    public String analyzeMood() {
        String line = "I am in Happy Mood";
        if (message ==  line ){
           output = "SAD";                   // Return happy or sad according to mood.
        }else
            output = "Happy";
        return output;
    }

}
