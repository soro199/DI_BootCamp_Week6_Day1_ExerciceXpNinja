/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpninja.exercice3;

/**
 *
 * @author SORO
 */
public class Exercice3 {

    public static void main(String[] args) {
        
        //Création de trois objets Person
    Persons person1 = new Persons();
    Persons person2 = new Persons("SORO WONGNIGA SEYDOU", 27, 'M');
    Persons person3 = new Persons("SORO SAYD", 29);
    
    //Affichage des informations des trois objets
    person1.displayInfo();
    person2.displayInfo();
    person3.displayInfo();
    
    }
}
