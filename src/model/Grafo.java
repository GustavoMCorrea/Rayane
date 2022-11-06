package model;

public class Grafo {
    private int vertice;
    private int [][] matriz;

    public  Grafo(int vertice){
        this.vertice = vertice;
        this.matriz = new int[this.vertice + 1][this.vertice +1];
    }

    public void titulo(int para, int de , int aresta){
        try
        {
            matriz[para][de]=aresta;
        }
        catch(ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertice não existente");
        }
    }
    public int getTitulo(int para, int de)
    {
     try
     {
         return matriz[para][de];
     }
     catch (ArrayIndexOutOfBoundsException index)
     {
         System.out.println("Vertice não existente");
     }
     return -1;
    }
}
