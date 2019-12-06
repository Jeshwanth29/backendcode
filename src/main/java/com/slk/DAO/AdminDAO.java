package com.slk.DAO;

import com.slk.model.Admin;
//import com.slk.model.Agent;

public interface AdminDAO {
	public boolean login(String username, String password) throws Exception;
	public Admin updateAdmin(int empId, Admin ad);

}
