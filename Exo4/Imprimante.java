package Exo4;

public class Imprimante extends Connectable{
	Adaptee adapte=new Adaptee();

	@Override
	void demarerr() {
		// TODO Auto-generated method stub
		adapte.imprimer();
		
		
	}
	@Override
	 public void setContenu(String contenu)
	  {
	    adapte.Contenu(contenu);
	  }



}
