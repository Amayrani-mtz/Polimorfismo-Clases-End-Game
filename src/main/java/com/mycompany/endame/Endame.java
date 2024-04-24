/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endame;

/**
 *
 * @author jafet mtz
 */
public class Endame {

    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter grrr","Ser el rey de todo wakanda","Garras de Vibranium");
        Villano galactus= new Villano("Galactus","Devorar mundos","usa de chalan a Silver Surfer");
        Avenger ironMan=new Avenger("Tony Stark","Genio,Filantropo,Multimillonario,PLayboy","Mark42","Prime");
        Thanos thanos= new Thanos("Thanos","El titan loco", "Ejercito chitaury","Gemas del infinito");
        
        //aplicando polimorfismo
        
        Personaje[]personajes={blackPanter,galactus,ironMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //metodo especifico de avenger
        ((Avenger)ironMan).reunirse();
        
        //ejemplo metodos especifico de thanos
        thanos.chasquearDedos();
    }
}
