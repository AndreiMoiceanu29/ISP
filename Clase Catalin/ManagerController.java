// define ManagerController class that has as fields commandService type CommandService, courierService type CourierService, clientService type ClientService, managerService type ManagerService
public class ManagerController{
    private CommandService commandService;
    private CourierService courierService;
    private ClientService clientService;
    private ManagerService managerService;
    
    // constructor
    public ManagerController(CommandService commandService, CourierService courierService, ClientService clientService, ManagerService managerService){
        this.commandService = commandService;
        this.courierService = courierService;
        this.clientService = clientService;
        this.managerService = managerService;
    }
    
    // define a method that returns a Manager object given a username and password
    public Manager getManager(String username, String password){
        List<Manager> managers = managerService.getAll();
        for(Manager manager : managers){
            if(manager.getUsername().equals(username) && manager.getPassword().equals(password)){
                return manager;
            }
        }
        return null;
    }
    
    // define a method that returns a Manager object given an id
    public Manager getManager(int id){
        List<Manager> managers = managerService.getAll();
        for(Manager manager : managers){
            if(manager.getId() == id){
                return manager;
            }
        }
        return null;
    }
    
    // define a method that returns a Manager object given a last name
    public Manager getManager(String lastName){
        List<Manager> managers = managerService.getAll();
        for(Manager manager : managers){
            if(manager.getLastName().equals(lastName)){
                return manager;
            }
        }
        return null;
    }
    

    // define handleDeleteManager without parameters reading idManager from console
    public void handleDeleteManager(){
        int idManager = Integer.parseInt(Console.readLine("Enter idManager: "));
        managerService.deleteManager(idManager);
    }

    // define handleConfirmOrder using confirmCommand method and editCourier for courierService method without parameters reading idCommand from console
    public void handleConfirmOrder(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        Command command = commandService.getCommand(idCommand);
        command.setStatus("Confirmed");
        commandService.editCommand(idCommand, command);
    }

    // define handleSendOrder using sendCommand method and editCourier for courierService method without parameters reading idCommand from console
    public void handleSendOrder(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        Command command = commandService.getCommand(idCommand);
        command.setStatus("Sent");
        commandService.editCommand(idCommand, command);
    }

    // define handleOrderDelivered using deliveredCommand method and editCourier for courierService method without parameters reading idCommand from console
    public void handleOrderDelivered(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        Command command = commandService.getCommand(idCommand);
        command.setStatus("Delivered");
        commandService.editCommand(idCommand, command);
    }

    // define handleShowOrders using getAllCommands method for commandService method without parameters
    public void handleShowOrders(){
        List<Command> commands = commandService.getAllCommands();
        for(Command command : commands){
            System.out.println(command);
        }
    }

    // define handleOrderReturn without parameters reading idCommand from console and using approveCommandReturn for managerService method
    public void handleOrderReturn(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        managerService.approveCommandReturn(idCommand);
    }

    // define run method that cycles through the menu
    public void run(){
        while(true){
            System.out.println("1. Delete manager");
            System.out.println("2. Confirm order");
            System.out.println("3. Send order");
            System.out.println("4. Order delivered");
            System.out.println("5. Show orders");
            System.out.println("6. Order return");
            System.out.println("7. Exit");
            int option = Integer.parseInt(Console.readLine("Enter option: "));
            switch(option){
                case 1:
                    handleDeleteManager();
                    break;
                case 2:
                    handleConfirmOrder();
                    break;
                case 3:
                    handleSendOrder();
                    break;
                case 4:
                    handleOrderDelivered();
                    break;
                case 5:
                    handleShowOrders();
                    break;
                case 6:
                    handleOrderReturn();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

}
