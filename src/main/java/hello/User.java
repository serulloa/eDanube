package hello;

public class User {
	
    private final String name;
    private final String lastName;
    private final int age;
    private final Gender gender;
    private final String email;
    private final String password;

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