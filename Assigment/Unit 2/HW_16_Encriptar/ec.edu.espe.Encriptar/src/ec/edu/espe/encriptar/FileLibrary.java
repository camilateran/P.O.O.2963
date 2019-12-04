/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.encriptar;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class FileLibrary {
    static Gson gson = new Gson();
    
    public  void addToFile(User object) {
         try
        {
            
        //    Password psw = new Password();
            File f=new File(object.getClass().getSimpleName()+"Password.csv");
            FileWriter fw;
            BufferedWriter bw; 
            
            String jsonString = gson.toJson(object);
            
            if(f.exists())
            {
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.newLine();
                bw.write(jsonString);
                
            }
            else{
                fw=new FileWriter(f,true);
                bw=new BufferedWriter(fw);
                bw.write(jsonString);
            }
            bw.close();
            
        }catch(IOException e){
            
        }
    }
     
    public static ArrayList<User> readObjects(User object){
        ArrayList<User> objects = new ArrayList<>();
        try{
            File f=new File(object.getClass().getSimpleName()+"Password.csv");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    
                    Object jsonObject =  gson.fromJson(line, object.getClass());
                    
                    objects.add((User) jsonObject);
                    
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
        
       return objects;
    }
}
