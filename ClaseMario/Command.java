// Define Command class that implements Entity interface, has a commandName, commandPrice, commandStatus, clientId, managerId, courierId,
// and constructors.
public class Command implements Entity {
    private String commandName;
    private double commandPrice;
    private String commandStatus;
    private int clientId;
    private int managerId;
    private int courierId;

    public Command(String commandName, double commandPrice, String commandStatus, int clientId, int managerId,
            int courierId) {
        this.commandName = commandName;
        this.commandPrice = commandPrice;
        this.commandStatus = commandStatus;
        this.clientId = clientId;
        this.managerId = managerId;
        this.courierId = courierId;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public double getCommandPrice() {
        return commandPrice;
    }

    public void setCommandPrice(double commandPrice) {
        this.commandPrice = commandPrice;
    }

    public String getCommandStatus() {
        return commandStatus;
    }

    public void setCommandStatus(String commandStatus) {
        this.commandStatus = commandStatus;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getCourierId() {
        return courierId;
    }

    public void setCourierId(int courierId) {
        this.courierId = courierId;
    }

    // define getId() method.
    @Override
    public int getId() {
        return entityId;
    }
}
