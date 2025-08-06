package CarGarage.files;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    Customer customer;
    double totalAmount;
    List<Services> services ;

    public Invoice(Customer customer1){
        this.customer = customer1;
        this.services = new ArrayList<>();
        totalAmount = 0;
    }
    public void addService(Services services1){
        services.add(services1);
        totalAmount += services1.price;
    }

    public void printInvoice(){
        System.out.println("<------------- Invoice -------------->");
        System.out.println("Customer : " + customer.getName() + " | Phn no." + customer.getPhn());
        System.out.println("Car no. : " + customer.getCar().no + " | model : " + customer.getCar().model);

        System.out.println("Services " );
        for(var service : services){
            System.out.println(service.name + " : " + "$" + service.name);
        }

        System.out.println("Amount to be paid : " + totalAmount);
        System.out.println();
        System.out.println("<------------ Thank You ----------->");
    }
}
