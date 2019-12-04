/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.pydee.Json;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.lang.reflect.Array;




/**
 *
 * @author camyt
 */
public class ReadJson {
    public static void main(String[] args){
        
       
        String json = "[{\"position\":2,"+"\name\":\"Messi\","+"\"team\":\"FC Barcelona\"}]";
        JsonParser parser = new JsonParser();
        
        JsonArray gsonArr = parser.parse(json).getAsJsonArray();
        for(JsonElement obj : gsonArr){
            JsonObject gsonObj = obj.getAsJsonObject();
            int position = gsonObj.get("2").getAsInt();
            String name = gsonObj.get("name").getAsString();
            String team = gsonObj.get("team").getAsString();
            
            FootballPlayer iniesta =  new FootballPlayer(name,team,position);
            System.out.println(iniesta);
        }
        
    }
}
