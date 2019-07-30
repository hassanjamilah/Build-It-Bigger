package com.andalus.jokeslib;

import java.util.Random;

public class Joke {


    private String[] jokes = {



            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "\n" +
                    "Doctor: \"Nine.\" " ,
            "My old aunts would come and tease me at weddings, “Well Sarah? Do you think you’ll be next?”\n" +
                    "-\n" +
                    "We’ve settled this quickly once I’ve started doing the same to them at funerals." ,
            "A doctor accidentally prescribes his patient a laxative instead of a coughing syrup.\n" +
                    "-\n" +
                    "Three days later the patient comes for a check-up and the doctor asks: “Well? Are you still coughing?”\n" +
                    "-\n" +
                    "The patient replies: “No. I’m afraid to.” " ,
            "Job interviewer: “And where would you see yourself in five years’ time Mr. Jeffries?\"\n" +
                    "-\n" +
                    "Mr. Jeffries: \"Personally I believe my biggest weakness is in listening.\"" ,
            "An old grandma brings a bus driver a bag of peanuts every day.\n" +
                    "\n" +
                    "First the bus driver enjoyed the peanuts but after a week of eating them he asked: \"Please granny, don't bring me peanuts anymore. Have them yourself.\".\n" +
                    "\n" +
                    "The granny answers: \"You know, I don't have teeth anymore. I just prefer to suck the chocolate around them.\"" ,
            "Dentist: “This will hurt a little.”\n" +
                    "\n" +
                    "Patient: “OK.”\n" +
                    "\n" +
                    "Dentist: “I’ve been having an affair with your wife for a while now.”" ,
            "I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore. " ,
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone." ,
            "An eskimo brings his friend to his home for a visit. When they arrive, his friend asks, puzzled – “So where’s your igloo?”\n" +
                    "-\n" +
                    "The friend replies “Oh no, I must’ve left the iron on…” " ,
            "\"Can you please hold my hand?\"A mother asks her son: \"Anton, do you think I’m a bad mom?\"\n" +
                    "-\n" +
                    "Son: \"My name is Paul.\"" ,
            "Doctor: You're obese.\n" +
                    "-\n" +
                    "Patient: For that I definitely want a second opinion.\n" +
                    "-\n" +
                    "Doctor: You’re quite ugly, too.    " ,
            "Two donkeys are standing at a roadside, one asks the other: So, shall we cross?\n" +
                    "-\n" +
                    "The other shakes his head: \"No way, look at what happened to the zebra.\"" ,
            "One company owner asks another: “Tell me, Bill, how come your employees are always on time in the mornings?”\n" +
                    "\n" +
                    "Bill replies: “Easy. 30 employees and 20 parking spaces.”" ,
            "A man is reading his newspaper and says to his wife: “Michelle, look. Here is an article about how women use about twice as many words per day as men do.”\n" +
                    "\n" +
                    "The wife responds: “That’s because we have to tell you everything twice”" ,
            "One shop owner asks another, “So, have you had any reactions yet to your ad that you’re looking for a night guard?”\n" +
                    "\n" +
                    "“Yeah, we got robbed tonight.”"

    } ;

    public String getRandomJoke ()
    {
        Random random = new Random() ;
        int x = random.nextInt(jokes.length) ;
        return jokes[x] ;
    }





}
