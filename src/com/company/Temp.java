package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

public class Temp
{
    public static void main( String[] args )
    {

        ArrayList<String> myStr = new ArrayList<String>();
        // Hashmaps store keys and values
        // Generics allow us to specify the object to be stored
        HashMap<String,String> map = new HashMap<String,String>();

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
            if (myVal==value){
                System.out.println(myVal + " is in the hashmap");
            } else {
                System.out.println(myVal + " is not in the hashmap");
            }
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

//        ====================================


        /*
         * The content below goes into how to write to a file.
         * Writing to a file is not a functionality that's unique to Hashmaps.
         *
         * Don't go ahead unless you have a firm grasp of the Hashmap we've learned so far*/

        //writing keys and values to a file
        System.out.println("writing keys and values to a file");
        String filename = (System.getProperty("user.dir") +
                File.separatorChar +"animalNoises.txt");
        System.out.println(filename);


        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist!");
        } catch (Exception e){
            System.out.println("Something else went wrong");
        }

        //print both the key and the value on same line
        // for each key in the key set write the key, a tab and the value
        for (String key : map.keySet()) {
            System.out.println("write this line: " + key);
            writer.println(key + "\t" + map.get(key));
        }
        writer.close();

        //read from a file
        System.out.println("read from a file");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] key_value_pair = line.split("\t");
                System.out.println("KV Pair:" + key_value_pair[0] + " " + key_value_pair[1]);
                //the key is in key_value_pair[0]
                //the value is in key_value_pair[1]
                // now you could add it back to the hash map if it isn't there already

                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }finally{

        }



    }
}
