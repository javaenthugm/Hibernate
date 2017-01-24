package com.gk.study.java.hibernate.test;
/*package com.gk.study.java.hibernate.test;

import java.util.List;
import java.util.Set;

import com.gk.study.java.hibernate.dao.UserDao;
import com.gk.study.java.hibernate.model.Address;
import com.gk.study.java.hibernate.model.User;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDao();
		User user = new User(); 
		user.setFirstname("Gopi");
		user.setLastname("M");
		user.setNickname("Gk");
		

		Address addr = new Address();
		addr.setStreet("Scenic Dr");
		addr.setCity("Croton");
		addr.setState("NY");
		addr.setZipcode("10520");
		
		user.setAddress(addr);
		
		Address addr2 = new Address();
		addr2.setStreet("Office Address");
		addr2.setCity("Yorktown");
		addr2.setState("NY");
		addr2.setZipcode("10520");
		
		user.getListAddress().add(addr);
		user.getListAddress().add(addr2);
		
		try {
			userDao.addUser(user);
			
			List<User> userList = userDao.getAllUsers();
			Set<Address> aList = null;;
			for(User u:userList){
				System.out.println(u.getUserid()+","+
						u.getFirstname()+","+
						u.getLastname()+","+
						u.getNickname()+","+
						(u.getAddress()!=null?u.getAddress().getStreet():"--")+","+
						(u.getAddress()!=null?u.getAddress().getCity():"--")+","+
						(u.getAddress()!=null?u.getAddress().getState():"--")+","+
						(u.getAddress()!=null?u.getAddress().getZipcode():"--"));
				aList = u.getListAddress();
				if(aList!=null){
					for(Address a: u.getListAddress()){
						System.out.println(a.getStreet()+","+
							a.getCity()+","+
							a.getState()+","+
							a.getZipcode());
					}
				}
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		User user = new User(); 
		user.setFirstname("Gopi");
		user.setLastname("M");
		user.setNickname("Gk");
		
		Calendar calendar = new GregorianCalendar();
		calendar.set(1975, 11, 02);
		Date dob= calendar.getTime();
		user.setDob(dob);
		System.out.println("DOB "+user.getDob());	
		
		Address addr = new Address();
		addr.setStreet("Scenic Dr");
		addr.setCity("Croton");
		addr.setState("New York");
		addr.setZipcode("10520");
		
		user.setAddress(addr);
		
		
		UserDao userDao = new UserDao();
		
		Activity newAct = new Activity();
		newAct.setCatid(1);
		newAct.setSubcatid(2);
		newAct.setCrtdt(new Date());
		
		
		ActivitiesDao actDao = new ActivitiesDao();
		
		try {
			userDao.getAllUsers();
			userDao.addUser(user);
			
			actDao.addActivity(newAct);
			Activity a = actDao.getActivity(1);
			System.out.println(a.getCatid()+","+a.getSubcatid());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    

	}

}
*/