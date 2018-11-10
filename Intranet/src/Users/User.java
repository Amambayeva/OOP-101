package Users;

import java.io.Serializable;

public abstract class User implements Comparable<User>, Serializable{
    protected String username;
    protected int password;
    private String firstName;
    private String lastName;

    public User(){}

    public void setUsername(String username){this.username = username;}
    public String getUsername(){return username;}

    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getFirstName(){return firstName;}

    public void setPassword(int password) {this.password = password;}
    public int getPassword(){ return password;}

    public void setLastName(String lastName) {this.lastName = lastName;}
    public String getLastName(){return lastName;}

    public boolean equals(Object obj){
        User u = (User)obj;
        return u.getUsername().equals(this.username) && u.getPassword() == this.password;
    }
    public int hashcode(){
        return super.hashCode();
    }
    public int compareTo(User user){
        return user.getUsername().compareTo(this.username);
    }
    public String toString(){
        return "First name: " + getFirstName() + "\nLast name: " + getLastName() + "\nUsername: " + getUsername();
    }
}
