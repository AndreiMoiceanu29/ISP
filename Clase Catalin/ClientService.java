// define ClientService class that has as paramaters irepository type IRepository, commandService type CommandService
public class ClientService{
    private IRepository<Client> repository;
    private CommandService commandService;
    
    // constructor
    public ClientService(IRepository<Client> repository, CommandService commandService){
        this.repository = repository;
        this.commandService = commandService;
    }
    
    // define a method that returns a Client object given a username and password
    public Client getClient(String username, String password){
        List<Client> clients = repository.getAll();
        for(Client client : clients){
            if(client.getUsername().equals(username) && client.getPassword().equals(password)){
                return client;
            }
        }
        return null;
    }
    
    // define a method that returns a Client object given an id
    public Client getClient(int id){
        List<Client> clients = repository.getAll();
        for(Client client : clients){
            if(client.getId() == id){
                return client;
            }
        }
        return null;
    }
    
    // define a method that returns a Client object given a last name
    public Client getClient(String lastName){
        List<Client> clients = repository.getAll();
        for(Client client : clients){
            if(client.getLastName().equals(lastName)){
                return client;
            }
        }
        return null;
    }

    // define createCliendAccount method that has as paramters Client client
    public void createClientAccount(Client client){
        repository.add(client);
    }

    // define editClientAccount method that has as paramters idClient type int, newClient type Client
    public void editClientAccount(int idClient, Client newClient){
        repository.edit(idClient, newClient);
    }

    // define deleteAccount method that has as paramters idClient type int
    public void deleteAccount(int idClient){
        repository.delete(idClient);
    }

    // define orderProduct method that has as parameters idClient type int, product type Command
    public void orderProduct(int idClient, Command command){
        Client client = getClient(idClient);
        client.getCommands().add(command);
        repository.update(client);
    }

    // define returnProduct method that has as parameters idClient type int, idProduct type int
    public void returnProduct(int idClient, int idProduct){
        Client client = getClient(idClient);
        Command command = commandService.getCommand(idProduct);
        client.getCommands().remove(command);
        repository.update(client);
    }

    // define viewCommandStatus method that has as parameters idClient type int, idProduct type int
    public void viewCommandStatus(int idClient, int idProduct){
        Client client = getClient(idClient);
        Command command = commandService.getCommand(idProduct);
        client.getCommands().remove(command);
        repository.update(client);
    }

    // define getCommands method that has as parameters idClient type int
    public List<Command> getCommands(int idClient){
        Client client = getClient(idClient);
        return client.getCommands();
    }

    // define pay method that has as parameters orderId type int
    public void pay(int orderId){
        Command command = commandService.getCommand(orderId);
        command.setPaid(true);
        commandService.editCommand(orderId, command);
    }

    //define login method that has as parameters username type String, password type String
    public boolean login(String username, String password){
        Client client = getClient(username, password);
        if(client != null){
            return true;
        }
        return false;
    }
}
