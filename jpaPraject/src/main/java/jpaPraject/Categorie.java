package jpaPraject;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categorie database table.
 * 
 */
@Entity
@NamedQuery(name="Categorie.findAll", query="SELECT c FROM Categorie c")
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_Cat;

	private int libelle_Cat;

	public Categorie() {
	}

	public int getId_Cat() {
		return this.id_Cat;
	}

	public void setId_Cat(int id_Cat) {
		this.id_Cat = id_Cat;
	}

	public int getLibelle_Cat() {
		return this.libelle_Cat;
	}

	public void setLibelle_Cat(int libelle_Cat) {
		this.libelle_Cat = libelle_Cat;
	}

}