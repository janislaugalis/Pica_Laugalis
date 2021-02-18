
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class uzd1 {
	public static int[][] izveidot(int[][] masivs){
		Random rand = new Random();
		for(int i=0; i<masivs.length; i++) {
			for(int j=0; j<masivs[i].length; j++) {
				masivs[i][j]=rand.nextInt(21)-10;
			}
		}
		JOptionPane.showMessageDialog(null, "Izveidots masīvs = [-10;10]");
		return masivs;
	}
	public static void izvadit(int[][] masivs) {
		String masivsVirkne="";
		for(int i=0; i<masivs.length; i++) {
			for(int j=0; j<masivs[i].length; j++) {
				masivsVirkne = masivsVirkne+masivs[i][j]+" \t";
			}
			masivsVirkne = masivsVirkne+"\n";
		}
		JOptionPane.showMessageDialog(null, masivsVirkne);
	}
	
	
	static void flip(int arr[], int i){
        int temp, start = 0;
        while (start < i)
        {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }
	
	  static int findMax(int arr[], int n){
	        int mi, i;
	        for (mi = 0, i = 0; i < n; ++i)
	            if (arr[i] > arr[mi])
	                mi = i;
	        return mi;
	    }
	
	

	public static void main(String[] args) {
		int izvele;
		int[][] masivs = null;
		
		do {
			izvele = Integer.parseInt(JOptionPane.showInputDialog("1 - Izveidot masīvu\n2 - Izvadīt masīvu\n3 - Sakārtot masīvu\n4 - Saglabāt masīvu\n5-Nolasīt masīvu\n0 - Apturēt"));
			switch(izvele) {
			case 1:
				int rindas=0, kolonnas=0;
				do {
					rindas = Integer.parseInt(JOptionPane.showInputDialog("Ievadi masīva rindu skaitu: "));
					kolonnas = Integer.parseInt(JOptionPane.showInputDialog("Ievadi masīva kolonu skaitu: "));
				}while(rindas<2 || kolonnas<2);
				masivs = new int [rindas][kolonnas];
				izveidot(masivs);
				
			break;
			case 2:
				izvadit(masivs);
			break;
			case 3:
				pancakeSort(masivs);
			break;
			case 4:
				saglabat(masivs);
			break;
			case 5:
				nolasit(masivs);
			break;
			case 0:
				JOptionPane.showMessageDialog(null, "Programma apturēta!");		
			break;
			default:
				JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			break;
			}
		}while(izvele!=0);
	}
}

	


