// define ClientController class that has commandService type CommandService, clientService type ClientService
public class ClientController{
    private CommandService commandService;
    private ClientService clientService;
    
    // constructor
    public ClientController(CommandService commandService, ClientService clientService){
        this.commandService = commandService;
        this.clientService = clientService;
    }
    
    // define a method that returns a Client object given a username and password
    public Client getClient(String username, String password){
        List<Client> clients = clientService.getAll();
        for(Client client : clients){
            if(client.getUsername().equals(username) && client.getPassword().equals(password)){
                return client;
            }
        }
        return null;
    }
    
    // define handleDeleteClient method without parameters reading the idClient from the console
    public void handleDeleteClient(){
        System.out.println("Enter the id of the client you want to delete: ");
        int idClient = Integer.parseInt(Console.readLine());
        clientService.deleteAccount(idClient);
    }

    // define handleViewOrders method without parameters reading the idClient from the console
    public void handleViewOrders(){
        System.out.println("Enter the id of the client you want to view orders: ");
        int idClient = Integer.parseInt(Console.readLine());
        List<Command> commands = commandService.getAll();
        for(Command command : commands){
            if(command.getClient().getId() == idClient){
                System.out.println(command);
            }
        }
    }

    // define handleCreateOrder method without parameters reading the idClient and idCommand from the console
    public void handleCreateOrder(){
        System.out.println("Enter the id of the client you want to create an order: ");
        int idClient = Integer.parseInt(Console.readLine());
        System.out.println("Enter the id of the command you want to create an order: ");
        int idCommand = Integer.parseInt(Console.readLine());
        commandService.createOrder(idClient, idCommand);
    }

    // define handleUpdateOrder method without parameters reading the idClient and idCommand from the console
    public void handleUpdateOrder(){
        System.out.println("Enter the id of the client you want to update an order: ");
        int idClient = Integer.parseInt(Console.readLine());
        System.out.println("Enter the id of the command you want to update an order: ");
        int idCommand = Integer.parseInt(Console.readLine());
        commandService.updateOrder(idClient, idCommand);
    }

    // define handleReturnOrder method without parameters reading the idClient and idCommand from the console and use returnProduct method from ClientService
    public void handleReturnOrder(){
        System.out.println("Enter the id of the client you want to return an order: ");
        int idClient = Integer.parseInt(Console.readLine());
        Client client = clientService.getClient(idClient);
        if(client == null){
            System.out.println("Client not found!");
            return;
        }
        System.out.println("Enter the id of the product you want to return: ");
        int idProduct = Integer.parseInt(Console.readLine());
        Command command = new Command(client, idProduct);
        commandService.returnProduct(command);
    }

    // define run method that cycles through the menu
    public void run(){
        while(true){
            System.out.println("1. Create client");
            System.out.println("2. Delete client");
            System.out.println("3. View clients");
            System.out.println("4. Create order");
            System.out.println("5. Update order");
            System.out.println("6. Return order");
            System.out.println("7. View orders");
            System.out.println("8. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(Console.readLine());
            switch(choice){
                case 1:
                    handleCreateClient();
                    break;
                case 2:
                    handleDeleteClient();
                    break;
                case 3:
                    handleViewClients();
                    break;
                case 4:
                    handleCreateOrder();
                    break;
                case 5:
                    handleUpdateOrder();
                    break;
                case 6:
                    handleReturnOrder();
                    break;
                case 7:
                    handleViewOrders();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}