package model;

public class Grafo {
    private int vertice;
    private int [][] matriz;

    private int [][] matrizPeso;

    public  Grafo(int vertice){
        this.vertice = vertice;
        this.matriz = new int[this.vertice + 1][this.vertice +1];
        this.matrizPeso = new int[this.vertice + 1][this.vertice +1];
    }

    public void titulo(int de, int para , int aresta, int escolha, int peso){
        if (escolha == 1)
        {
            try
        {
            matriz[de][para]=aresta;
            matrizPeso[de][para]=peso;
        }
        catch(ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertice não existente");
        }

        }else {
            if (escolha == 2) {
                try {
                    matriz[para][de] = aresta;
                    matriz[de][para] = aresta;
                    matrizPeso[para][de]=peso;
                    matrizPeso[de][para]=peso;
                } catch (ArrayIndexOutOfBoundsException index) {
                    System.out.println("Vertice não existente");
                }
            } else {
                System.out.println("erro");
            }
        }
    }
    public int getTitulo(int de, int para, int i)
    {
     try
     {
         if(i == 1){
             return matriz[de][para];
         }else{
             return matrizPeso[de][para];
         }

     }
     catch (ArrayIndexOutOfBoundsException index)
     {
         System.out.println("Vertice não existente");
     }
     return -1;
    }

}
