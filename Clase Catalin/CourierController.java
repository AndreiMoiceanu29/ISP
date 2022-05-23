// define CourierController class that has as parameters commandService type CommandService, courierService type CourierService, clientService type ClientService
public class CouerierController{
    private CommandService commandService;
    private CourierService courierService;
    private ClientService clientService;
    
    // constructor
    public CourierController(CommandService commandService, CourierService courierService, ClientService clientService){
        this.commandService = commandService;
        this.courierService = courierService;
        this.clientService = clientService;
    }
    
    // define a method that returns a Courier object given a username and password
    public Courier getCourier(String username, String password){
        List<Courier> couriers = courierService.getAll();
        for(Courier courier : couriers){
            if(courier.getUsername().equals(username) && courier.getPassword().equals(password)){
                return courier;
            }
        }   
        return null;
    }
    
    // define a method that returns a Courier object given an id
    public Courier getCourier(int id){
        List<Courier> couriers = courierService.getAll();
        for(Courier courier : couriers){
            if(courier.getId() == id){
                return courier;
            }
        }
        return null;
    }
    
    // define a method that returns a Courier object given a last name
    public Courier getCourier(String lastName){
        List<Courier> couriers = courierService.getAll();
        for(Courier courier : couriers){
            if(courier.getLastName().equals(lastName)){
                return courier;
            }
        }
        return null;
    }
    
    // define handleDeleteCourier without parameters reading idCourier from console
    public void handleDeleteCourier(){
        int idCourier = Integer.parseInt(Console.readLine("Enter idCourier: "));
        courierService.deleteCourier(idCourier);
    }

    // define handleTakeOrder using takeCommand method and editCourier for courierService method without parameters reading idCommand from console
    public void handleTakeOrder(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        Courier courier = courierService.getCourier(idCommand);
        courier.getIdCommands().add(idCommand);
        courierService.editCourier(courier.getId(), courier);
    }

    // define handleProcessPayment method without paramters reading idCommand from console
    public void handleProcessPayment(){
        int idCommand = Integer.parseInt(Console.readLine("Enter idCommand: "));
        Command command = commandService.getCommand(idCommand);
        command.setStatus(Status.PAID);
        commandService.editCommand(command.getId(), command);
    }

    // define handleUpdateCourier method without parameters reading idCourier and idNewCourier from console and use editCourier for courierService method
    public void handleUpdateCourier(){
        int idCourier = Integer.parseInt(Console.readLine("Enter idCourier: "));
        int idNewCourier = Integer.parseInt(Console.readLine("Enter idNewCourier: "));
        Courier courier = courierService.getCourier(idCourier);
        courier.setId(idNewCourier);
        courierService.editCourier(idCourier, courier);
    }

    // define run method that cycles through the menu
    public void run(){
        boolean quit = false;
        int choice = 0;
        while(!quit){
            System.out.println("Choose an option: ");
            System.out.println("1 - Create Courier Account");
            System.out.println("2 - Edit Courier Account");
            System.out.println("3 - Delete Courier Account");
            System.out.println("4 - Take Order");
            System.out.println("5 - Process Payment");
            System.out.println("6 - Update Courier");
            System.out.println("7 - Quit");
            choice = Integer.parseInt(Console.readLine("Enter choice: "));
            switch(choice){
                case 1:
                    handleCreateCourier();
                    break;
                case 2:
                    handleEditCourier();
                    break;
                case 3:
                    handleDeleteCourier();
                    break;
                case 4:
                    handleTakeOrder();
                    break;
                case 5:
                    handleProcessPayment();
                    break;
                case 6:
                    handleUpdateCourier();
                    break;
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

}
