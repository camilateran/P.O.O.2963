/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonfile;

/**
 *
 * @author camyt
 */


import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWrite {
  public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		
		obj.put("Tema", "P.O.O.");
		obj.put("Profesor", new String("Edison Lascano"));
		
		JSONArray list = new JSONArray();
		list.add("Unidad 1");
		list.add("Unidad 2");
		list.add("Unidad 3");
                //PUT PARA DOS OBJETOS
		obj.put("",list);
		
                //INNER?
                /*
		JSONObject innerObj = new JSONObject();
		innerObj.put("PostX","Escribir un JSON");
		innerObj.put("PostY", "Leer un JSON");
		innerObj.put("PostZ", "lalala");
		
		obj.put("Posts",innerObj);*/

		try {

			FileWriter file = new FileWriter("c:\\FileTests\\prueba.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			//manejar error
		}

		System.out.print(obj);

	}

}

