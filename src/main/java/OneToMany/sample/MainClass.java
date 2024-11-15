package OneToMany.sample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
	public static void main(String[] args) {
		EntityManagerFactory e = Persistence.createEntityManagerFactory("OneTomany");
		 EntityManager m = e.createEntityManager();		
		  EntityTransaction t = m.getTransaction();
//		  
//		  Bank b1=new Bank();
//		  b1.setBaccno(8963671387l);
//		  b1.setBaddress("davangere");
//		  b1.setBname("sbi");
//		  
//		  Bank b2=new Bank();
//		  b2.setBaccno(8963232427l);
//		  b2.setBaddress("hospet");
//		  b2.setBname("pkgb");
//		  
//		  Bank b3=new Bank();
//		  b3.setBaccno(8965651387l);
//		  b3.setBaddress("banglore");
//		  b3.setBname("niyox");
//		  
//		  ArrayList<Bank> a=new ArrayList<Bank>();
//		  a.add(b1);
//		  a.add(b2);
//		  a.add(b3);
//		  
//		  
//		  Person p=new Person();
//		  p.setPid(12);
//		  p.setPname("Sunil");
//		  p.setB(a);
//		  
//		  
//		  t.begin();
//		  m.persist(b1);
//		  m.persist(b2);
//		  m.persist(b3);
//		  m.merge(p);
//		  t.commit();
		  
		  Person p=m.find(Person.class,"Sunil");
		  System.out.println(p.getPid()+" "+p.getPname());
		  List<Bank> a1=p.getBank();
		  {
			  for(Bank b:a1)
		  }
	}

}
