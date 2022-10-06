package com.example.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
/*
    public static void check(String sentence) {
        var words = sentence.replaceAll("[^a-zA-Z]", " ").toLowerCase().split("\\s+");
        System.out.println(Arrays.toString(words));

        ArrayList<Character> characters = new ArrayList<>();
        for (var str: words) {
            for (var ch: str.toCharArray()) {
                characters.add(ch);
            }
        }

        System.out.println("characters: " + characters);

        var sentenceSet = Set.of(characters);
        System.out.println("set = " + (Arrays.toString(sentenceSet.toArray())));
        System.out.println("set = " + Set.toArray());
    }*/

}