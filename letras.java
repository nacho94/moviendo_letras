import java.util.Scanner;
import java.awt.Point;

public class letras {
	private static int n = 0; 
	private static int m = 0;
	private static Point espacio = null;
	private static char matriz[][];

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		m = scan.nextInt();

		String pFinal = scan.next();
		String pInicio = scan.next();

		matriz = new char[n][m];
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
				if(palabra.charAt(k) == '*') {
					espacio = new Point(i,j);
				}
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

	private static boolean comprobar(char matriz[][] ,String palabra) {
		int k = 0;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matriz[i][j] != palabra.charAt(k)) {
					return false;
				}
				k++;
			}
		}
		return true;
	}

	private static boolean sePuedeMover(int x, int y) {
		int difX = (int)Math.abs(espacio.getX() - x);
		int difY = (int)Math.abs(espacio.getY() - y);
		return (difY == 1 ^ difX == 1);

	}

	private static void mover(int x, int y) {
		if(sePuedeMover(x,y)) {
			matriz[(int)espacio.getX()][(int)espacio.getY()] = matriz[x][y];
			matriz[x][y] = '*';
			espacio.setLocation(x,y);
		}


	}


}