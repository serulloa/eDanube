package hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
    private String name;
    private String lastName;
    private int age;
    private Gender gender;
    @Id
    private String email;
    private String password;
    
    public User() {
    	super();
    }

    public User(String name, String lastName, int age, Gender gender, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public String getName() {
    	return this.name;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public Gender getGender() {
    	return this.gender;
    }
    
    public String getEmail() {
    	return this.email;
    }
    
    public String getPassword() {
    	return this.password;
    }
    
}