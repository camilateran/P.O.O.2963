package ec.edu.espe.demo.imp;

import ec.edu.espe.demo.dao.IPersona;

public class Teacher implements IPersona{

    @Override
    public String sayHello(){
        return "hola soy profesor ";
    }
}