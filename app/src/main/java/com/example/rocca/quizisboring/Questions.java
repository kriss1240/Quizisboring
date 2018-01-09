package com.example.rocca.quizisboring;

/**
 * Created by Rocca on 12/5/2017.
 */

public class Questions {
    //array of questions
    public String MyQuestions [] = {
            "Which is better?",
            "Which thing triggers most?",
            "What game is the saltiest?",
            "Which drink is the best?",
    };
    //array of multible choices for each question
    public String MyChoices [] [] = {
            {"History","Math","IT study","Fysics"},
            {"Writing an code", "Lagging in game", "Pc stops responding","Your phone battery runs out"},
            {"League of Legends","CSGO","Paladins","Rulf game"},
            {"Coca-Cola Lime","Sprite","Fanta","Red Bull"},
    };
    //array of correcct answers - in the same order as array of questions
    private String MyCorrectAnswers [] = {
            "IT study", "Pc stops responding", "League of Legends", "Red Bull"
    };
    //method returns number of questions
    public int getLength () {
        return MyQuestions.length;
    }

    public String getQuestion(int a) {
        String question = MyQuestions[a];
        return question;
    }
    public String getChoise(int index, int num){
        String choice0=MyChoices[index] [num -1];
        return choice0;
    }
    public String getCorrectAnswer(int a) {
        String answer=MyCorrectAnswers[a];
        return answer;
    }
}
