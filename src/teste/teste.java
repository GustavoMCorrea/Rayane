package teste;
import java.util.Scanner;
import model.*;

public class teste {
    public static void main(String args[]) {
        int count = 0;
        Scanner entrada = new Scanner(System.in);
        Grafo grafo;
        try {
            System.out.println("Insira o número de vertices");
            int v = entrada.nextInt();
            System.out.println("Insira o número de Arestas");
            int a = entrada.nextInt();

            grafo = new Grafo(v);

            System.out.println("Insira as ligações: <para> <de>");
            while(count <= a){
                int para = entrada.nextInt();
                int de = entrada.nextInt();○

                grafo.titulo(para,de,1);
                count++;
            }
            System.out.println("Matriz adjacente:");
            System.out.print("  ");
            for (int i = 1; i<=v;i++)
                System.out.print(i+" ");
            System.out.println();
            for(int i = 1; i <= v; i++){
                System.out.print(i+" ");
                for(int j = 1; j<=v ; j++)
                    System.out.print(grafo.getTitulo(i,j)+" ");
                    System.out.println();

            }

        }
        catch (Exception E)
        {
            System.out.println("Erro");
        }
        entrada.close();
    }
}
