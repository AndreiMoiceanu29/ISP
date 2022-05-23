// define CourierService class that has as parameters commandService type CommandService, irepository type IRepository
public class CourierService{
    private CommandService commandService;
    private IRepository<Courier> repository;
    
    // constructor
    public CourierService(CommandService commandService, IRepository<Courier> repository){
        this.commandService = commandService;
        this.repository = repository;
    }
    
    // define a method that returns a Courier object given a username and password
    public Courier getCourier(String username, String password){
        List<Courier> couriers = repository.getAll();
        for(Courier courier : couriers){
            if(courier.getUsername().equals(username) && courier.getPassword().equals(password)){
                return courier;
            }
        }
        return null;
    }
    
    // define a method that returns a Courier object given an id
    public Courier getCourier(int id){
        List<Courier> couriers = repository.getAll();
        for(Courier courier : couriers){
            if(courier.getId() == id){
                return courier;
            }
        }
        return null;
    }
    
    // define a method that returns a Courier object given a last name
    public Courier getCourier(String lastName){
        List<Courier> couriers = repository
    }

    // define createCourier method that has as paramters Courier courier
    public void createCourier(Courier courier){
        repository.add(courier);
    }

    // define deleteCourier method that has as paramters idCourier type int
    public void deleteCourier(int idCourier){
        repository.delete(idCourier);
    }

    // define editCourier method that has as paramters idCourier type int, newCourier type Courier
    public void editCourier(int idCourier, Courier newCourier){
        repository.edit(idCourier, newCourier);
    }
    

    // define takeCommand method that has as parameters idCommand type int
    public void takeCommand(int idCommand){
        Courier courier = getCourier(idCommand);
        courier.getIdCommands().add(idCommand);
        repository.update(courier);
    }

    // define deliverCommand method that has as parameters idCommand type int
    public void deliverCommand(int idCommand){
        Courier courier = getCourier(idCommand);
        courier.getIdCommands().remove(idCommand);
        repository.update(courier);
    }

    // define confirmPayment method that has as parameters clientId type int, orderId type int
    public void confirmPayment(int clientId, int orderId){
        Command command = commandService.getCommand(orderId);
        command.setStatus(Status.DELIVERED);
        commandService.updateCommand(command);
    }

    // define login method that has as parameters username type String, password type String
    public boolean login(String username, String password){
        Courier courier = getCourier(username);
        if(courier != null && courier.getPassword().equals(password)){
            return true;
        }
        return false;
    }

}
