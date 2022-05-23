import java.util.List;

// Define Manager class that implements Entity interface, has a managerId, managerfirstName, managerlastName, username, password, idCommands list
// and a constructor.
public class Manager implements Entity {
    private int managerId;
    private String managerfirstName;
    private String managerlastName;
    private String username;
    private String password;
    private List<Command> idCommands;

    public Manager(int managerId, String managerfirstName, String managerlastName, String username, String password,
            List<Command> idCommands) {
        this.managerId = managerId;
        this.managerfirstName = managerfirstName;
        this.managerlastName = managerlastName;
        this.username = username;
        this.password = password;
        this.idCommands = idCommands;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerfirstName() {
        return managerfirstName;
    }

    public void setManagerfirstName(String managerfirstName) {
        this.managerfirstName = managerfirstName;
    }

    public String getManagerlastName() {
        return managerlastName;
    }

    public void setManagerlastName(String managerlastName) {
        this.managerlastName = managerlastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Command> getIdCommands() {
        return idCommands;
    }

    public void setIdCommands(List<Command> idCommands) {
        this.idCommands = idCommands;
    }

    @Override
    public int getId() {
        return entityId;
    }
}
