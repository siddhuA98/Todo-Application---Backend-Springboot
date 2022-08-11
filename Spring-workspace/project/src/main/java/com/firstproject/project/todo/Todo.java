package com.firstproject.project.todo;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Todo 
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	private String Description;
	private Date targetdate;
	private boolean isDone;
	
	protected Todo()
	{
		
	}
	
	public Todo(long id, String username, String description, Date targetdate, boolean isDone) 
	{
		super();
		this.id = id;
		this.username = username;
		Description = description;
		this.targetdate = targetdate;
		this.isDone = isDone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Date getTargetdate() {
		return targetdate;
	}

	public void setTargetdate(Date targetdate) {
		this.targetdate = targetdate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return id == other.id;
	}
	
	
}
