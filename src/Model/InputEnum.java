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
public enum InputEnum {
    TEXT("<input type=\"text\" class=\"form-control\">",1),
    NUMBER("<input type=\"number\" class=\"form-control\">",2),
    FILE("<input type=\"file\" class=\"form-control\">",3);
    
    private String tipo;
    private int index;
    
    private InputEnum(String tipo,int index){
        this.tipo = tipo;
        this.index = index;
    }
    public String getTipo(){
        return tipo;
    }
    public int getIndex(){
        return index;
    }
    
}
