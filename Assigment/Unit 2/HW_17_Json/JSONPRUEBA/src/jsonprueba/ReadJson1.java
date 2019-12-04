/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonprueba;

/**
 *
 * @author camyt
 */

import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/***
 * Manual deserialization example
 * 
 * @author RicardoMoya
 *
 */
public class ReadJson1 {

    public static void main(String[] args) {

        String json1 = "[{\"name\":\"Iniesta\","
                + "\"team\":\"FC Barcelona\"}]";

        JsonParser parser = new JsonParser();

        // Obtain Array
        JsonArray gsonArr = parser.parse(json1).getAsJsonArray();

        // for each element of array
        for (JsonElement obj : gsonArr) {

            // Object of array
            JsonObject gsonObj = obj.getAsJsonObject();

            // Primitives elements of object
        
            String name = gsonObj.get("name").getAsString();
            String team = gsonObj.get("team").getAsString();

            
            // Object Constructor
            FootballPlayer iniesta = new FootballPlayer( name, team);
            System.out.println(iniesta);
        }

    }
}
