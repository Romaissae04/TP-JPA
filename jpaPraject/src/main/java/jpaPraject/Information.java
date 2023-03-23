package jpaPraject;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the information database table.
 * 
 */
@Entity
@NamedQuery(name="Information.findAll", query="SELECT i FROM Information i")
public class Information implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_INFO")
	private int idInfo;

	private String address;

	private String email;

	@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "id", referencedColumnName="id",nullable=false)
	private Client client;
	
	public Information() {
	}

	public int getIdInfo() {
		return this.idInfo;
	}

	public void setIdInfo(int idInfo) {
		this.idInfo = idInfo;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}