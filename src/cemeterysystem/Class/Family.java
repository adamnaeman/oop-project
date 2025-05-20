/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cemeterysystem.Class;

import cemeterysystem.Class.Person;

/**
 *
 * @author User
 */
public class Family extends Person{
    public String relation;
    
    public Family(String name, String relation, String contact){
        this.name = name;
        this.relation = relation;
        this.contact = contact;
    }
    
    public void setName(String name){
        
    }
    
    public String getName(){
        return name;
    }
    
    
}
