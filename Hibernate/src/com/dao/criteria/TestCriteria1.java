package com.dao.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.dao.Employee;
import com.dao.HibernateUtil;

/**
 Get all the employees
 
 */
public class TestCriteria1 {

	public static void main(String[] args) {
		  //get session obj
				Session  s = HibernateUtil.getSessionFactory().openSession();
		    
		    //get criteria obj
		    Criteria c1 = s.createCriteria(Employee.class);
				
			
		  //call list method
		  	List<Employee> list = c1.list();
			  for(Employee e: list){
					System.out.println(e);
				}
		    
		    //close session
			s.close();	


		}
}


/*

	//apply filters
		c1.setFirstResult(40);
		c1.setMaxResults(20);
	
	
//input from customer
String name = "";
int minSal =0;
int maxSal =0;
String nameLike = "user";


if(name!=null && !name.equals("")){
	c1.add(Restrictions.eq("userName", name));// where userName = name
}

if(nameLike!=null && !nameLike.equals("")){
	c1.add(Restrictions.like("userName", "%"+name+"%"));
	// 	where userName like '%user%';
}
if(minSal!=0 && maxSal!=0){
	c1.add(Restrictions.between("usersalary", minSal, maxSal));
	//userSalary >= minSal and userSalary<= maxSal
}


*/
