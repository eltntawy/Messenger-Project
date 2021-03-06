package com.chat.service;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;

import com.chat.db.DBConnection;
import com.chat.model.User;
import com.chat.view.resource.Resource;

public abstract class ContactService {

    public static void updateUserImage(String Path, User user) throws SQLException {
	Connection conn = null;
	try {
	    conn = DBConnection.getConnection();
	    String sql = "UPDATE messenger_project.user set image=? where user_id=?;";
	    PreparedStatement ps = conn.prepareStatement(sql);
	    // File x=File.createTempFile(Path, "");
	    ps.setString(1, Path);
	    ps.setInt(2, user.getUserId());

	    ps.executeUpdate();

	} catch (SQLException ex) {
	    ex.printStackTrace();
	    // Logger.getLogger(ContactService.class.getName()).log(Level.SEVERE,
	    // null, ex);
	} finally {
	    if(conn != null)
	    conn.close();
	}
    }

    public static Map<String, Integer> getAllContactStatus() throws SQLException {
	Connection conn = DBConnection.getConnection();
	String sql = " select  case status " + " when " + User.OFFLINE + " then 'Offline' " + " when" + User.SIGNOUT + " then 'Signout' " + " when " + User.AVAILABLE + " then 'Available'" + " when " + User.BUSY + " then 'Busy'" + " when " + User.AWAY + " then 'Away' end  as 'Status', count(*) " + " from user group by status";
	PreparedStatement ps = conn.prepareStatement(sql);

	ResultSet rs = ps.executeQuery();

	Map<String, Integer> retMap = new HashMap<String, Integer>();
	while (rs.next()) {
	    retMap.put(rs.getInt(2) + " " + rs.getString(1), rs.getInt(2));
	}

	conn.close();
	return retMap;
    }

    /**
     *
     * add "friend" to "user" contact list
     *
     *
     */
    public int addContectToUser(User user, User friend) {
	return 0;
    }

    /**
     *
     * delete "friend" from "user" contact list
     *
     *
     */
    public int deleteContactFromUser(User user, User friend) {
	return 0;
    }

    /**
     *
     * @return all contact list for user
     *
     *
     */
    public List<User> getContactListOfUser(User user) {
	return null;
    }

    /**
     *
     * search for contact to add
     *
     * @throws SQLException
     *
     *
     */
    public static List<User> getContactByNameOrEmailOrUseName(String searchText) throws SQLException {
	Connection conn = DBConnection.getConnection();

	String sql = "SELECT * FROM user WHERE User_Name like ? OR First_Name like ? OR Second_Name like ? OR mail like ? ;";
	PreparedStatement ps = conn.prepareStatement(sql);

	ps.setString(1, "%" + searchText + "%");
	ps.setString(2, "%" + searchText + "%");
	ps.setString(3, "%" + searchText + "%");
	ps.setString(4, "%" + searchText + "%");
	ResultSet rs = ps.executeQuery();
	List<User> list = new ArrayList<User>();
	while (rs.next()) {
	    int userId = rs.getInt("user_id");
	    String userName = rs.getString("User_Name");
	    String password = rs.getString("password");
	    String FullName = rs.getString("first_name");
	    String Mail = rs.getString("mail");
	    int status = rs.getInt("status");
	    String img = rs.getString("image");
	    ImageIcon imgicon;
	    if (img == null || "".equals(img)) { // TODO Check for file
						 // Existance
		// image default
		imgicon = Resource.IMAGE_DEFAULT_USER;
	    } else {
		imgicon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(rs.getString("image")).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
	    }
	    // ImageIcon userPicture = "".equals(rs.getString("image")) ?
	    // Resource.IMAGE_DEFAULT_USER : new
	    // ImageIcon(Toolkit.getDefaultToolkit().getImage(rs.getString("image")));
	    // ;
	    User user = new User(userId, userName, password, FullName, imgicon, status);

	    list.add(user);

	}
	
	conn.close();

	return list;

    }

    public static List<User> getContactListOfCurrentUser(User u) throws SQLException {
	// TODO Auto-generated method stub
	Connection conn = DBConnection.getConnection();

	// TODO create currect select querey
	String sql = " SELECT u.user_id,u.User_Name,u.password,u.first_name,u.second_name,u.status,u.image " + " FROM user u, friend_list friends " + " where u.user_id = friends.friend_id and friends.user_id = ?";
	PreparedStatement ps = conn.prepareStatement(sql);

	ps.setInt(1, u.getUserId());
	ResultSet rs = ps.executeQuery();
	List<User> list = new ArrayList<User>();
	while (rs.next()) {
	    int userId = rs.getInt("user_id");
	    String userName = rs.getString("User_Name");
	    String password = rs.getString("password");
	    String FullName = rs.getString("first_name") + " " + rs.getString("second_name");
	    int status = rs.getInt("status");
	    String img = rs.getString("image");
	    ImageIcon imgicon;
	    if (img == null || "".equals(img)) { // TODO Check for file
						 // Existance
		// image default
		imgicon = Resource.IMAGE_DEFAULT_USER;
	    } else {
		imgicon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(rs.getString("image")).getScaledInstance(40, 40, Image.SCALE_SMOOTH));
	    }
	    User user = new User(userId, userName, password, FullName, imgicon, status);
	    user.setUserId(userId);
	    list.add(user);

	}
	conn.close();
	return list;
    }

    public static boolean isFriendOfUser(User user, User Friend) throws SQLException {
	Connection conn = DBConnection.getConnection();

	// TODO create currect select querey
	String sql = " select count(*) from friend_list where user_id = ? and friend_id = ?";
	PreparedStatement ps = conn.prepareStatement(sql);

	ps.setInt(1, user.getUserId());
	ps.setInt(2, Friend.getUserId());
	ResultSet rs = ps.executeQuery();

	while (rs.next()) {
	    if(rs.getInt(1) > 0)
		return true;
	}
	conn.close();
	return false;
    }

    public static Map<String, Integer> getContactCountOfAllUsers() throws SQLException {

	Connection conn = DBConnection.getConnection();

	String sql = "select u.user_name , count(friend.friend_id) from user u left join "
		+ " friend_list friend on u.user_id = friend.user_id group by u.user_name";
	PreparedStatement ps = conn.prepareStatement(sql);

	ResultSet rs = ps.executeQuery();

	Map<String, Integer> retMap = new HashMap<String, Integer>();

	while (rs.next()) {
	    retMap.put(rs.getString(1), rs.getInt(2));
	}
	
	conn.close();
	return retMap;

    }
}
