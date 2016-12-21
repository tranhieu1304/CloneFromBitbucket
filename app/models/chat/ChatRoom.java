package models.chat;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

import models.User;

@Entity
@Table(name = "chatroom")
public class ChatRoom extends Model {

	@Id
	@GeneratedValue
	public Long id;

	@Column(name = "roomName")
	public String roomName;

	@Column(name = "modifiedDate")
	public Date modifiedDate;

	@Column(name = "isDelete")
	public boolean isDelete = false;

	@ManyToMany(cascade = CascadeType.ALL)
	public List<User> users;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "chatRoom")
	public List<UserMessage> userMessages;
	
	private Find<Long, ChatRoom> find = new Finder<Long, ChatRoom>(ChatRoom.class);
}
