package CarGarage.files;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GarageService {
    HashMap<String , Customer> customerMap;
    ArrayList<Services> AvailableServices;

    public GarageService() {
        this.customerMap = new HashMap<>();
        this.AvailableServices = new ArrayList<>();
        loadServices();
    }
    public void loadServices(){
        AvailableServices.add(new Services("Car Wash", 500.0));
        AvailableServices.add(new Services("Oil Change", 700.0));
        AvailableServices.add(new Services("Wheel Alignment",300.0));
        AvailableServices.add(new Services("Tyre Replacement",3000.0));
        AvailableServices.add(new Services("Puncture",50.0));
    }

    public void addCustomer(String name,String phone,String carNUmber,String model){
        Car car = new Car(carNUmber , model);
        Customer customer = new Customer(name , phone , car);
        customerMap.put(carNUmber,customer);
        System.out.println("Customer added successfully!");
    }

    public void createInvoice(String carNumber){
        if(!customerMap.containsKey(carNumber)){
            System.out.println("Customer Not Found");
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = customerMap.get(carNumber);
        Invoice invoice = new Invoice(customer);
        System.out.println("Available Services");
        for(int i = 0 ; i < AvailableServices.size() ; i++){
            System.out.println( (i+1) + " " + AvailableServices.get(i).name + " $ "
            + AvailableServices.get(i).getPrice());
        }

        while(true){
            System.out.println("Enter the choice to add a service or 0 to finish");
            int choice = sc.nextInt();
            if(choice == 0) break;
            if(choice > 0 && choice < AvailableServices.size()){
                invoice.addService(AvailableServices.get(choice-1));
                System.out.println("Service done");
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
        invoice.printInvoice();
    }
}
