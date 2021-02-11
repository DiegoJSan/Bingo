package diegosanchez.bingo;

import java.util.Random;

public class Carton {
    
    public void generar (){ //void = retorno , generar = nombre de la clase. Se declara el método
        int[][] num = new int[9][3];
        Random random = new Random ();
        int num = random.nextInt(90)+1; 
        System.out.println(num);
    }
    
}
