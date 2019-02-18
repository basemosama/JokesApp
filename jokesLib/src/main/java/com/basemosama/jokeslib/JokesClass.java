package com.basemosama.jokeslib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class JokesClass {

    private static String[] jokesList={"Don't you hate jokes about German sausage? They're the wurst!",
            "Two artists had an art contest... It ended in a draw",
            "Why did the chicken cross the playground? To get to the other slide.",
            "What gun do you use to hunt a moose? A moosecut!",
            "If life gives you melons, you might have dyslexia.",
            "Broken pencils... ...are pointless.",
            "What did one snowman say to the other snowman? 'Do you smell carrots?'",
            "How many hipsters does it take to change a lightbulb? It's a really obscure number. You've probably never heard of it.",
            "Where do sick boats go? The dock!",
            "I like my slaves like I like my coffee: Free.",
            "My girlfriend told me she was leaving me because I keep pretending to be a Transformer... I said, No, wait! I can change!",
            "Old Chinese proverb: Man who not shower in 7 days makes one reek.",
            "What did the owner of a brownie factory say when his factory caught fire? I'm getting the fudge outta here!",
            "What form of radiation bakes you cookies? A gramma ray",
            "Bee jokes, courtesy of my niece (age 8). What did the bee use to dry off after swimming? A *bee*ch towel. What did the bee use to get out the tangles? A honeycomb.",
            "What's the loudest economic system? CAPITALISM",
            "I went for a job interview today... The interviewer said to me, What would you say your greatest weakness is? I said, I think Id have to say my listening skills are my greatest strength.",
            "Who was the knight that invented the round table? Sir Cumference. (via friend who got this from a street performance group in the England area of Epcot)",
            "What did the German air force eat for breakfast during WW2? Luftwaffles",
            "I the shell off a snail yesterday... you'd think it would move faster, but it was really kinda sluggish.",
            "What did the number zero say to the number eight? Nice belt.",
            "What's worse than a centipede with sore feet? A giraffe with a sore throat",
            "What's red and bad for your teeth? A brick.",
            "Why did the Chicken cross the playground? To get to the other slide",
            "Did you hear about the French chef who committed suicide? He lost the huile d'olive",
            "Wanna hear a joke about unemployed people? Nevermind, they don't work.",
            "Knock Knock Who's there Boo!! Boo who? Don't cry, it's only a joke",
            "How much did the skeleton charge for his excellent legal services? An arm and a leg.",
            "Why do gorillas have such big nostrils? Cos they got big fingers.",
            "What is the difference between a Siberian husky and an Alaskan husky? About 1500 miles."};

    private static ArrayList<String>jokesArrayList=new ArrayList<>(Arrays.asList(jokesList));
    public static String getJoke(){

        Random random =new Random();
        int randomNumber=random.nextInt(jokesArrayList.size());
        return jokesArrayList.get(randomNumber);
    }

}
