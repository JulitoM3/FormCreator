/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 52556
 */
public class Input {
    
    private String type;
    private String id;
    private String clase;
    
    public Input(String type, String id, String clase ){
        if(type.equals(null)){
            System.out.println("Debe tener un tipo");
        }
        this.type = type;
        this.id = id;
        this.clase = clase;
    }
   
    public void getType(){
        System.out.println(this.type);
    }
    public void getID(){
        System.out.println(this.id);
    }
    public void getClase(){
        System.out.println(this.clase);
    }
    
    
    public String getString(){
        String input = "<input type=\"" + this.type + "\"" + "id=\"" + this.id + "\"" + "class=\"" + this.clase + "\"" + ">";
        return input;
    }
}
