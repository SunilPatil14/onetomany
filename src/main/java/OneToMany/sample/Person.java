
package OneToMany.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	private int pid;
	@Id
	private String Pname;
	
	
	@OneToMany
	private List<Bank> b;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public List<Bank> getB() {
		return b;
	}

	public void setB(List<Bank> b) {
		this.b = b;
	}

}

