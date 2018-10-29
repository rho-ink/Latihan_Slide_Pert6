/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo3.pkg10117121.latihan62.livingthings;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 * NAMA                 : M RIFQI S M
 * KELAS                : PBO-3 
 * NIM                  : 10117121
 * Deskripsi Program    : 
 *
 */
public abstract class LivingThing {
    
    
public abstract void walk(String nama);
    public void breath(String nama) {
        System.out.println(nama + " bernafas");
    }
    public void eat(String nama) {
        System.out.println(nama + " makan");
    }
}

