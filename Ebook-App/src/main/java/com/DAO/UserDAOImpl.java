package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDAOImpl implements UserDAO {

	private Connection conn;

	public UserDAOImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean userRegister(User us) {

		boolean status = false;

		try {
			String query = "INSERT INTO user(name,email,phno,password) values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhno());
			ps.setString(4, us.getPassword());

			int i = ps.executeUpdate();

			if (i == 1) {
				status = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return status;
	}

	public User login(String email, String password) {
		// TODO Auto-generated method stub
		User user = null;
			
			try {
				String query= "SELECT * FROM user WHERE email=? AND password=?"; 
				
				PreparedStatement ps = conn.prepareStatement(query);
				ps.setString(1, email);
				ps.setString(2, password);
				
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					user = new User();
					
					user.setId(rs.getInt(1));
					user.setName(rs.getNString(2));
					user.setEmail(rs.getNString(3));
					user.setPhno(rs.getNString(4));
					user.setPassword(rs.getNString(5));
					user.setAdress(rs.getNString(6));
					user.setLandmark(rs.getNString(7));
					user.setCity(rs.getNString(8));
					user.setState(rs.getNString(9));
					user.setPincode(rs.getNString(10));
				}
				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		return user;
	}

}
