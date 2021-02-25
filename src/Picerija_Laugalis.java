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
