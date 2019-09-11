package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

public class Main
{
    public static void main( String[] args )
    {

        ArrayList<String> myStr = new ArrayList<>();
        // Hashmaps store keys and values
        // Generics allow us to specify the object to be stored
        HashMap<String,String> map = new HashMap<String,String>();

        myStr.add("JEn");
        map.put( "cat", "Meow" );
        map.put( "ape", "Squeak" );
        map.put( "dog", "Woof" );
        map.put( "bat", "Squeak" );
        System.out.println( "map = " + map );

        System.out.println("A cat says... " + map.get("cat"));
        System.out.println("A dog says... " + map.get("dog"));



        //iterating over values only
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }

        //iterating over keys only
        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
        }


        //print a blank line
        System.out.println();

        // Two options to check if myVal exists in the Hashmap
        String myVal = "Woof";
        // Option 1 - using comparison
        for (String value : map.values()) {
            if (myVal == value){
                System.out.println(myVal + " is in the hashmap");
            }
//            else {
//                System.out.println(myVal + " is not in the hashmap");
//            }
        }
        // Option 2 - using contains() method
        if (map.containsValue("Woof")){
            System.out.println("My hashmap has the value " + myVal);
        }

        System.out.println();
        System.out.println("Iterating over keys and values");
        //iterating over keys and values
        for (String key : map.keySet()) {
            System.out.println(" A " + key + " says " + "\t" + map.get(key));
        }

    }
}
