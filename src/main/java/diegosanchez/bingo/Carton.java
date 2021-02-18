package diegosanchez.bingo;

import java.util.Random;

public class Carton {
    
    //Variables
    int [][] nums;
    int numFilas;
    
    public Carton(int numFilas) {  //Método constructor 
        this.numFilas = numFilas;
        nums = new int[9][numFilas];
        
        int num;
        int col;
        int fil;
        // Generar las 3 filas del cartón
        for(fil=0; fil<numFilas; fil++){
            // Generar los 5 números de las fila del cartón
            for(int i=0; i<5; i++){
                //Mientras sea igual a 0
                do{
                    num = getNumAleatorio(1,89);
                    //System.out.println("numero aleatorio " + num);
                    //Método para comprobar en qué colunma va el número
                    col = this.getnumColumna(num);
                //Para que no sobrescriba los números
                //   y no se repita el número
                } while (nums[col][fil] != 0);  
                nums[col][fil] = num;
            }
        }
        
        this.mostrarPorConsola(); 
    }
    
    
    // Retorna el número de la columna
    private int getnumColumna(int num){
        /*int col = num / 10;
        return col;*/
        return (num/10);
    }
    
    // Muestra los números
    public void mostrarPorConsola(){
        //Bucle filas
        for(int y=0; y<numFilas; y++){
            //Bucles columnas
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
    
    public int getNumPos(int posx, int posy) {
        return nums[posx][posy];
    }
}
