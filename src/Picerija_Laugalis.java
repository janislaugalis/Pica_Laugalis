import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Picerija_Laugalis {
	public static void saglabat(String vards, String uzvards, int talrunis, String adrese, String epasts, String picasLielums, String picasPiedevas, String picasMercites, String picasSanemsana, double cena) {
        try {
            FileWriter fw = new FileWriter("pasutijumi.txt", true);
            PrintWriter raksta = new PrintWriter(fw);
            raksta.println("\n__\n---Klienta dati---\nVārds: "+vards+"\nUzvārds: "+uzvards+"\nTalrunis: "+talrunis+"\nAdrese: "+adrese+"\nEpasts: "+epasts+"\n---Pasūtījums---\nPicas izmērs: "+picasLielums+"\n"
                    + "Picas piedevas: "+picasPiedevas+"\nPicas mērcīte: "+picasMercites+"\nPicas saņemšanas veids: "+picasSanemsana+"\nCena: "+cena+"€");
            JOptionPane.showMessageDialog(null, "Ierakstīts failā - pasutijumi.txt");
            raksta.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Kļūme ierakstot faila!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	public static void nolasit() {
        try{
            String masivsVirkne="";
            FileReader fails = new FileReader("pasutijumi.txt");
            Scanner myReader = new Scanner(fails);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              masivsVirkne=masivsVirkne+data+"\n";
            }
            myReader.close();
            JOptionPane.showMessageDialog(null, masivsVirkne);
        }
        catch (IOException errorMessage){
            JOptionPane.showMessageDialog(null, "Failu nevar atrast! No sākuma izveido pasūtījumus");
        }
}



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
		            do {
		                picasSanemsana = JOptionPane.showInputDialog("Izvelies picas saņemšanas veidu\nA - Uz vietas ceptuvē\nB - Piegāde uz norādīto adresi");
		                picasSanemsana.toLowerCase();
		            }while(!picasSanemsana.equals("a") && !picasSanemsana.equals("b"));
		            switch(picasSanemsana) {
		            case "a":
		                picasSanemsana = "Uz vietas ceptuvē";
		            break;
		            case "b":
		                picasSanemsana = "Piegāde uz norādīto adresi";
		                cena=cena+5;
		            break;
		            default:
		                JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
		            break;
		            }
		            JOptionPane.showMessageDialog(null, "---Klienta dati---\nVārds: "+vards+"\nUzvārds: "+uzvards+"\nTalrunis: "+talrunis+"\nAdrese: "+adrese+"\nEpasts: "+epasts+"\n---Pasūtījums---\nPicas izmērs: "+picasLielums+"\n"
		                    + "Picas piedevas: "+picasPiedevas+"\nPicas mērcīte: "+picasMercites+"\nPicas saņemšanas veids: "+picasSanemsana+"\nCena: "+cena+"€");
		            saglabat(vards, uzvards, talrunis, adrese, epasts, picasLielums, picasPiedevas, picasMercites, picasSanemsana, cena);
		            
		            
		           
		           
			 }
		            
			
			             JOptionPane.showMessageDialog(null, "Programma apturēta!");
			         break;
			         default:
			             JOptionPane.showMessageDialog(null, "Šāda darbība nepastāv!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			         break;
			         case 2:
			             nolasit();
			         break; 
			 
			         }while(izvele!=0);

	}

}
