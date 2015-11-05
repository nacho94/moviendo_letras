import java.util.Scanner;

public class letras {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();

	String pFinal = scan.next();
	String pInicio = scan.next();

	char matriz[][] = new char[n][m];
	crearMatriz(matriz,n,m,pInicio);
	
	imprimirMatriz(matriz);

	}

	private static void p(String m) {
		System.out.println(m);
	}

	private static void crearMatriz(char matriz[][],int n, int m, String palabra) {
		int k = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				matriz[i][j] = palabra.charAt(k);
				k++;
			}
		}
	}

	private static void imprimirMatriz(char matriz[][]) {
		for (int x=0; x < matriz.length; x++) {
			  System.out.print("|");
			  for (int y=0; y < matriz[x].length; y++) {
			    System.out.print (matriz[x][y]);
			    if (y!=matriz[x].length-1) System.out.print("\t");
			  }
			  System.out.println("|");
			}
	}
}