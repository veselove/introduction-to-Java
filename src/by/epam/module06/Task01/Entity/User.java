package by.epam.module06.Task01.Entity;

	public class User {
	
	private String username;
	private Status status;
	private String email;
	private String password;
	
	public User(String username, Status status, String email, String password) {
		this.username = username;
		this.status = status;
		this.email = email;
		this.password = password;
	}
	
	public User() {
		
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setStatus(String status) {
		if (status.equals("standard")) {
			this.status = Status.STANDARD;
		}
		if (status.equals("administrator")) {
			this.status = Status.ADMINISTRATOR;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (status != other.status)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Username: " + username + ", status: " + status + ", password: " + 
	password + ", email: " + email;
	}
}
