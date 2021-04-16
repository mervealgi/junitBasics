package org.example;
import java.util.Locale;

public class App
{
    public String helloWorld(){
        return "Hello World";
    }

    public boolean checkVisible(){
        return true;
    }

    public int sum(int a1 , int a2){
        return a1 + a2;
    }

    public String toLowerCase(String lowerCaseChar){
        return lowerCaseChar.toLowerCase(Locale.forLanguageTag("TR"));   //usage for my language
        //return lowerCaseChar.toLowerCase(Locale.ENGLISH);              //usage for international
    }
}
