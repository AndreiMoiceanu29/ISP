import java.util.Scanner;

// Define EditOrderController class that has a field of type CommandService, has a constructor that takes a CommandService as a parameter.
public class EditOrderController {
    private CommandService commandService;

    public EditOrderController(CommandService commandService) {
        this.commandService = commandService;
    }

    // Define handleEditOrder() method that asks the user for the command id and
    // input the new values for the command, and finally
    // calls the editCommand() method of the CommandService, that takes the command
    // id and an object of type Command as a parameter.
    public void handleEditOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command id: ");
        int commandId = scanner.nextInt();
        System.out.println("Enter the new command status: ");
        String commandStatus = scanner.next();
        System.out.println("Enter the new command price: ");
        double commandPrice = scanner.nextDouble();
        System.out.println("Enter the new command name: ");
        String commandName = scanner.next();
        System.out.println("Enter the new client id: ");
        int clientId = scanner.nextInt();
        System.out.println("Enter the new manager id: ");
        int managerId = scanner.nextInt();
        System.out.println("Enter the new courier id: ");
        int courierId = scanner.nextInt();
        Command command = new Command(commandName, commandPrice, commandStatus, clientId, managerId, courierId);
        commandService.editCommand(commandId, command);
    }

    // define run() method that shows a menu of methods that can be called from the
    // EditOrderController class.
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Edit order");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    handleEditOrder();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
