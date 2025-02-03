package test;

import java.sql.SQLException;
import java.util.HashSet;

import th.ac.ki.kps.eng.cpe.soa.model.Customer;
import th.ac.ki.kps.eng.cpe.soa.model.Phonenumber;
import th.ac.ku.kps.eng.cpe.soa.dao.CustomerDAO;

public class test {
	public static void main(String[] args) throws SQLException 
	{
		CustomerDAO c = new CustomerDAO() ;
		c.addCustomer(new Customer("S1", new HashSet<Phonenumber>()));
		for(Customer cs : c.getAllCustomers())
			System.out.println(cs.getName());
	}

}
