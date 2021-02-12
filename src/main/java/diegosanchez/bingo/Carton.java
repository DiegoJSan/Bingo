package diegosanchez.bingo;

import java.util.Random;

public class Carton {
    
    //Variables
    int [][] nums;
    
    public void generar (){ //void = retorno , generar = nombre de la clase. Se declara el método
       
        nums = new int[9][3];
        
        for(int y=0; y<3; y++){
            for(int x=0; x<9; x++){
                nums[x][y] = getNumAleatorio(1,90);
            }
        }
        this.mostrarPorConsola();       
    }
    
    public void mostrarPorConsola(){
        for(int y=0; y<3; y++){
            for(int x=0; x<9; x++){
                //System.out.println("x=" + x + "y=" + y);
                System.out.print(nums [x][y] + " ");
            }
            System.out.println();
        }
    }
    
    public int getNumAleatorio(int min, int max){   // get= dame , generar
        Random random = new Random ();
        // nim = 1, max = 6
        int num = random.nextInt(max-min+1) + min;    // 3 = cantidad de numeros  5 = el numero maximo
        return num;
    }
    
}
