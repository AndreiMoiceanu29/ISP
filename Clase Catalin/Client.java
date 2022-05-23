import java.util.List;

// define class Client that has as parameters lastName, firstName, age, adress, idCommand as list, paymentMethod of type PaymentMethod, username, password an implements Entity
public class Client implements Entity{
    private String lastName;
    private String firstName;
    private int age;
    private String adress;
    private List<Integer> idCommands;
    private PaymentMethod paymentMethod;
    private String username;
    private String password;
    
    // constructor
    public Client(String lastName, String firstName, int age, String adress, List<Integer> idCommands, PaymentMethod paymentMethod, String username, String password){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.adress = adress;
        this.idCommands = idCommands;
        this.paymentMethod = paymentMethod;
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
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getAdress(){
        return adress;
    }
    
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    public List<Integer> getIdCommands(){
        return idCommands;
    }
    
    public void setIdCommands(List<Integer> idCommands){
        this.idCommands = idCommands;
    }
    
    public PaymentMethod getPaymentMethod(){
        return paymentMethod;
    }
    
    public void setPaymentMethod(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }

    // define getId() method
    @Override
    public int getId() {
        return Entity.entityId;
    }

}
