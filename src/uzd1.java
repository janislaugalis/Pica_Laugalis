
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
    
    static int[][] pancakeSort(int masivs[][]){
    	int n = masivs.length*masivs[0].length;
    	int skaititajs=0;
	    int[] arr = new int [masivs.length*masivs[0].length];
	    for(int c=0; c<masivs.length; c++){
			for(int b=0; b<masivs[c].length; b++){
				arr[skaititajs] = masivs[c][b];
				skaititajs++;
			}
		}
	    
        for (int curr_size = n; curr_size > 1; 
                                 --curr_size)
        {
            int mi = findMax(arr, curr_size);
            if (mi != curr_size-1)
            {
                flip(arr, mi);
                flip(arr, curr_size-1);
            }
        }
        skaititajs=0;
		for(int c=0; c<masivs.length; c++){
			for(int b=0; b<masivs[c].length; b++){
				masivs[c][b] = arr[skaititajs];
				skaititajs++;
			}
		}
		JOptionPane.showMessageDialog(null, "Masīvs sakārtots augoši!");
		return masivs;
    }
	
	public static void saglabat(int[][] masivs) {
		try {
			FileWriter fw = new FileWriter("Laugalis.txt");
			PrintWriter raksta = new PrintWriter(fw);
			for(int i=0; i<masivs.length; i++) {
				for(int j=0; j<masivs[i].length; j++) {
					raksta.print(masivs[i][j]+" \t");
				}
				raksta.println();
			}
			JOptionPane.showMessageDialog(null, "Ierakstīts failā - `Laugalis.txt`");
			raksta.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void nolasit(int[][] masivs) {
	        try{
	        	String masivsVirkne="";
				FileReader fails = new FileReader("Laugalis.txt");
	            Scanner myReader = new Scanner(fails);
	            while (myReader.hasNextLine()) {
	              String data = myReader.nextLine();
	              masivsVirkne=masivsVirkne+data+"\n";
	            }
	            myReader.close();
	            JOptionPane.showMessageDialog(null, masivsVirkne);
	        }
	        catch (IOException errorMessage){
	            JOptionPane.showMessageDialog(null, "Failu nevar atrast!");
	            System.out.println(errorMessage.getMessage());
	            System.out.printf("Failu nevar atrast.\n\n");
	        }
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

	


