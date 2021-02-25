import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Picerija_Laugalis {

	public static void main(String[] args) {
		int izvele;
		double cena=0;
		String vards="", uzvards="", epasts="", adrese="";
		int talrunis=0;
		String picasLielums="";
		String picasPiedevas="";
		String picasMercites="";
		String picasSanemsana="";
		
		 do {
			 izvele = Integer.parseInt(JOptionPane.showInputDialog("1-Izveidot jaunu sūtijumu\n2-Izvadīt visus pasūtījumus\n0-Apturēt"));
			 switch(izvele) {
			 case 1:
				 cena=0;
		            vards = JOptionPane.showInputDialog("Ievadiet savu vārdu: ");
		            uzvards = JOptionPane.showInputDialog("Ievadiet savu uzvārdu: ");
		            talrunis = Integer.parseInt(JOptionPane.showInputDialog("Ievadiet savu talruņa numuru: "));
		            epasts = JOptionPane.showInputDialog("Ievadiet savu epastu: ");
		            adrese = JOptionPane.showInputDialog("Ievadiet savu adresi (pilsēta, iela, māja, dzīvoklis): ");
		            
		            do {
		                picasLielums = JOptionPane.showInputDialog("Izvelies picas lielumu\nA - 25cm\nB - 30cm\nC - 50cm ");
		                picasLielums.toLowerCase();
		            }while(!picasLielums.equals("a") && !picasLielums.equals("b") && !picasLielums.equals("c"));
		            switch(picasLielums) {
		            case "a":
		                picasLielums = "25cm";
		                cena=cena+5;
		            break;
		            case "b":
		                picasLielums = "30cm";
		                cena=cena+7.50;
		            break;
		            case "c":
		                picasLielums = "50cm";
		                cena=cena+10;
		            break;
		            default:
		                JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		            break;
		            }
		            
		            do {
		                picasPiedevas = JOptionPane.showInputDialog("Izvelies picas piedevas\nA - Salami desa\nB - Bekons\nC - Ananāsi\nD - Čedaras siers");
		                picasPiedevas.toLowerCase();
		            }while(!picasPiedevas.equals("a") && !picasPiedevas.equals("b") && !picasPiedevas.equals("c") && !picasPiedevas.equals("d"));
		            switch(picasPiedevas) {
		            case "a":
		                picasPiedevas = "Salami desa";
		            break;
		            case "b":
		                picasPiedevas = "Bekons";
		            break;
		            case "c":
		                picasPiedevas = "Ananāsi";
		            break;
		            case "d":
		                picasPiedevas = "Čedaras siers";
		            break;
		            default:
		                JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		            break;
		            }
		            
		            do {
		                picasMercites = JOptionPane.showInputDialog("Izvelies picas mercītes\nA - Kečups\nB - BBQ\nC - Ķiploku\nD - Čili");
		                picasMercites.toLowerCase();
		                
		            }while(!picasMercites.equals("a") && !picasMercites.equals("b") && !picasMercites.equals("c") && !picasMercites.equals("d"));
		            
		            switch(picasMercites) {
		            case "a":
		                picasMercites = "Kečups";
		            break;
		            case "b":
		                picasMercites = "BBQ";
		            break;
		            case "c":
		                picasMercites = "Ķiploku";
		            break;
		            case "d":
		                picasMercites = "mušmires";
		            break;
		            default:
		                JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		            break;
		            }
		            
		            }  
		            
		            
			
			             JOptionPane.showMessageDialog(null, "Programma apturēta!");
			         break;
			         default:
			             JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			         break;
			 }
			         }while(izvele!=0);

	}

}
