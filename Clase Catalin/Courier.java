import java.util.List;

// define a class Courier that has as parameters lastName, firstName, phoneNumber, idCommands as a list, username, password
public class Courier implements Entity{
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private List<Integer> idCommands;
    private String username;
    private String password;
    
    // constructor
    public Courier(String lastName, String firstName, String phoneNumber, List<Integer> idCommands, String username, String password){
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.idCommands = idCommands;
        this.username = username;
        this.password = password;
    }
    
    // getters and setters
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public List<Integer> getIdCommands(){
        return idCommands;
    }
    
    public void setIdCommands(List<Integer> idCommands){
        this.idCommands = idCommands;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    // define getId() method
    @Override
    public int getId(){
        return Entity.entityId;
    }
}
