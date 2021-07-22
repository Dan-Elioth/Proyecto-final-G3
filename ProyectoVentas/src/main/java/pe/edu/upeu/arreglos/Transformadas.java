package pe.edu.upeu.arreglos;

public class Transformadas {
 
    public void contarCerosPostNegMatriz() {
        int cantNeg=0, cantPost=0, cantCeros=0;
        int[][] matrizT={
            {5,	6,	0},
            {5,	-6,	2},
            {0,	12,	-2},
            {0,	6,	2}
        };
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                if (matrizT[i][j]<0) {
                    cantNeg++;
                }else if(matrizT[i][j]==0){
                    cantCeros++;
                }else{
                    cantPost++;
                }
            }
        }  
        System.out.println("Cantidad ceros:"+cantCeros);      
        System.out.println("Cantidad positivos:"+cantPost);      
        System.out.println("Cantidad Negativos:"+cantNeg);      
    }

    public void transformada1(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + f); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }

    public void transformada2(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + c); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }    

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }  

    public void imprimirMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    public void transformada05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }
    public void transformada13(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada06(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada17(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j <= (dimen-1)-i    ; j++) {
                matriz[j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada19(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i ; j++) {
                matriz[(dimen-1)-j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformadas21(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInt;
                    valInt++;   
                }

            }else{
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+valInt;
                    valInt++;
                    
                }

            }
            
        }
        imprimirMatrizCadena(matriz);
    }
    public void transformadas22(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            if(j%2==0){
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+valInt;
                    valInt++;
                    
                }

            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInt;
                    valInt++;   
                }
            }
            
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformadas23(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j columnas
        for (int j = matriz[0].length-1; j >=0; j-- ) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInt;
                    valInt++;  
                }
            }else{ 
                for(int i = matriz.length-1; i >=0 ; i--){
                    matriz[i][j]=""+valInt;
                    valInt++;  
                }
            }   
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformadas24(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j columnas
        for (int j = matriz[0].length-1; j >=0; j-- ) {
            if (j%2==0) {
                for(int i = matriz.length-1; i >=0 ; i--){
                    matriz[i][j]=""+valInt;
                    valInt++;  
                }
            }else{ 
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInt;
                    valInt++;  
                }
            }   
        }
        imprimirMatrizCadena(matriz);
    }




    public void transformadas25(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInt;
                    valInt++;   
                }

            }else{
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[j][i]=""+valInt;
                    valInt++;
                    
                }

            }
            
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformadas26(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            if(j%2==0){
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[j][i]=""+valInt;
                    valInt++;
                }

            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInt;
                    valInt++;   
                }
            } 
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformadas27(int dimen, int valInt){
        String[][] matriz=new String[dimen][dimen];// i=filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+valInt;
                    valInt++;   
                }

            }else{
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+valInt;
                    valInt++; 
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada28(int dimen, int valInt) {
        String[][] matriz=new String[dimen][dimen];
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+valInt;
                    valInt++;
                }
            } else {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[(dimen-1)-j][(dimen-1)-i]=""+valInt;
                    valInt++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    } 


    public void transformadas29(int n){
        String[][] matriz=new String [n][n]; 

        int a=0, b=n-1, valor=0;

        for (int j = 0; j < matriz.length; j++) {
                    
            for (int i = a; i <= b; i++) {
                matriz[a][i]=valor++ +" "; 
            }
            for (int i = a+1; i <= b; i++) {
                matriz[i][b]=valor++ +" "; 
            }
            for (int i = b-1; i >= a; i--) {
                matriz[b][i]=valor++ +" "; 
            }
            for (int i = b-1; i >= a+1; i--) {
                matriz[i][a]=valor++ +" "; 
            }
            a++;
            b--;
            
        }
        imprimirMatrizCadena(matriz);

    }



    public static void main(String[] args) {
        Transformadas tObj=new Transformadas();
        /*tObj.contarCerosPostNegMatriz();
        tObj.transformada1(5, 0);
        tObj.transformada2(5,0);
        System.out.println("");
        tObj.transformadas05(5, 0); 
        System.out.println("");
        tObj.transformadas21(5, 0); 
        System.out.println("");*/
        //tObj.transformadas24(5, 0); 

        System.out.println("*********** ✰ Ejercicio Número 06 ✰ ***********");
        tObj.transformada06(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 17 ✰ ***********");
        tObj.transformada17(5,0);
        System.out.println("*********** ✰ Ejercicio Número 19 ✰ ***********");
        tObj.transformada19(5,0);
        System.out.println("*********** ✰ Ejercicio Número 22 ✰ ***********");
        tObj.transformadas22(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 23 ✰ ***********");
        tObj.transformadas23(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 25 ✰ ***********");
        tObj.transformadas25(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 26 ✰ ***********");
        tObj.transformadas26(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 27 ✰ ***********");
        tObj.transformadas27(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 28 ✰ ***********");
        tObj.transformada28(5, 0); 
        System.out.println("*********** ✰ Ejercicio Número 29 ✰ ***********");
        tObj.transformadas29(5);

    }
}