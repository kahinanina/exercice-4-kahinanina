package Exo4;

public class Cafetiere extends Connectable {
	
	String nom ;
String contenu;
	 

	public Cafetiere(String nom) {
		super();
		this.nom = nom;
	}
	
	
	


	public Cafetiere () {
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;

    }


	@Override
	 public void setContenu(String contenu)
	  {
	    this.contenu=contenu;
	  }


	@Override
	void demarerr() {
		// TODO Auto-generated method stub
		System.out.println(""+contenu);
		
	}
	


	
}
