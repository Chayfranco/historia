import java.util.Scanner;

public class Potencia {
    public static int calcularPotencia(int N, int P) {
        if (P == 0) {
            return 1;
        }
        
        int resultado;
        
        if (P < 0) {
            resultado = 1 / (int) Math.pow(N, Math.abs(P));
        } else {
            resultado = (int) Math.pow(N, P);
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para N (base da potência):");
        int N = scanner.nextInt();
        
        System.out.println("Digite um valor para P (expoente da potência):");
        int P = scanner.nextInt();
        
        int resultado = calcularPotencia(N, P);
        
        System.out.println(N + " elevado a " + P + " = " + resultado);
        
        scanner.close();
    }
}