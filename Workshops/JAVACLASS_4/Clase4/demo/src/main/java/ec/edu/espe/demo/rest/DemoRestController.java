package ec.edu.espe.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.espe.demo.imp.Student;
import ec.edu.espe.demo.imp.Teacher;
import ec.edu.espe.demo.util.Persona;
@RestController
@RequestMapping("api/demo")

public class DemoRestController{

    Student student = new Student();
    Teacher teacher = new Teacher();

    /*Persona persona = new Student();
    Persona persona2 = new Teacher();*/

    @GetMapping("/student")
    public String getStudent(){
        return student.sayHello();
    }

    @GetMapping("/teacher")
    public String getTeacher(){
        return teacher.sayHello();
    }









    @GetMapping
    public String hello(){
        return "HOLA MUNDO SOY EL SERVICIO REST";
    }

    @GetMapping("/goodBye")
    public String goodBye(){
        return "ADIOS!!!!!!!";
    }

    @GetMapping(value = "/callme/{name}/{edad}/{dni}")
    public Persona name( @PathVariable String name, @PathVariable int edad, @PathVariable String dni){
        return  new Persona(name , edad, dni, false);
    }

    @PostMapping
    public Persona persona(@RequestBody Persona per){
        per.setEdad(+50);
        return per;
    }







    @GetMapping("/callme/{dni}")
    public boolean valida(@PathVariable String dni){
      int suma = 0;
      if(dni.length() == 10){
            char[] caracteres = new char[dni.length()];
        for (int i = 0; i < dni.length(); i++) {
            caracteres[i] = (char)dni.charAt(i);     
            System.out.println(caracteres[i]);
         
           /* if (!Character.isDigit(caracteres[i])) {          
                return false;      
                }  */   
        }   
      }
      else {
        return false;
      }
      int prov = Integer.parseInt(dni.substring(0, 2));

        if (!((prov > 0) && (prov <= 24))) {
            //System.out.println("Error: cedula ingresada mal");
            return false;
        }
        int[] d = new int[10];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(dni.charAt(i) + "");
        }

        int imp = 0;
        int par = 0;
        
        for (int i = 0; i < d.length; i += 2) {
            d[i] = ((d[i] * 2) > 9) ? ((d[i] * 2) - 9) : (d[i] * 2);
            imp += d[i];
        }
        for (int i = 1; i < (d.length - 1); i += 2) {
            par += d[i];
        }
        suma = imp + par;

        int d10 = Integer.parseInt(String.valueOf(suma + 10).substring(0, 1) + "0") - suma;
        d10 = (d10 == 10) ? 0 : d10;

         if (d10 == d[9]) {
            return  true ;
        }
        else {
            return false;
        }
  }
  
}
