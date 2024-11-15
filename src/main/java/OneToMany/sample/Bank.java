package OneToMany.sample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	private String Bname;
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public long getBaccno() {
		return baccno;
	}
	public void setBaccno(long baccno) {
		this.baccno = baccno;
	}
	public String getBaddress() {
		return Baddress;
	}
	public void setBaddress(String baddress) {
		Baddress = baddress;
	}
	@Column(unique=true)
	private long baccno;
	private String Baddress;
	

}