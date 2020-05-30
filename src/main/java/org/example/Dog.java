package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // linijka 1 - 18
@NoArgsConstructor
public class Dog {

    private String name;

    /*public Dog(String name) {
        this.name = name;
    }
    public Dog(){
        this("bezimienny");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
     */


}
