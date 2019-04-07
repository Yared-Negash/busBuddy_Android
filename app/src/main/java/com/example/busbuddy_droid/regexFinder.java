package com.example.busbuddy_droid;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexFinder {

   public static LinkedList<String> findString(String regex, String text){
       LinkedList<String> response = new LinkedList<String>();
       Pattern checkRegex = Pattern.compile(regex);
       Matcher regexMatcher = checkRegex.matcher(text);

       while(regexMatcher.find()){
           if(regexMatcher.group().length() != 0){
               System.out.println(regexMatcher.group().trim());
               response.add(regexMatcher.group());

           }
       }
       return response;
   }
}
