package Exo4;

public class Utilisateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connectable connectable1,connectable2;
		connectable1=new Radio();
		connectable1.setContenu("Radio demar�");
		connectable2=new Imprimante();
		connectable2.setContenu("imprimante demar�");
		connectable1.demarerr();
		connectable2.demarerr();
		
	

	}

}
