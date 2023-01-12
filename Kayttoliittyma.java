
import java.util.ArrayList;
import java.util.Scanner;


public class Kayttoliittyma {
        private Scanner lukija;
        private Database database;
    
    public Kayttoliittyma ( Scanner lukija, Database database){
       this.lukija=lukija;
       this.database=database;
    
    }
    public void kaynnista(){
        
        while (true){
            System.out.println("What do you want to do?");
            String komento=lukija.nextLine();
            if (komento.equals("quit")){
                break;
            }
            if (komento.equals("load")){
                System.out.println("File name:");
                String tiedosto=lukija.nextLine();
                database.loadDatabase(tiedosto);
                
            }
            if(komento.equals("add company")){
                System.out.println("Name?");   
                String name=lukija.nextLine();
                Company company=database.searchCompany(name);
                if(company !=null){
                    System.out.println("The company already exists.");
                    
                }else{
                
                System.out.println("CEO´s name?");
                String CEOname=lukija.nextLine();
                System.out.println("Office adress?"); 
                String address=lukija.nextLine();
                System.out.println("Office phone number?");
                String phoneNumber=lukija.nextLine();
                System.out.println("Last year sales?");
                long sales=Integer.valueOf(lukija.nextLine());
                
                
                    if(company== null){
                        database.addCompany(name, CEOname, address, phoneNumber, sales);
                    }
                } 
            }
            if (komento.equals("print names")){
                database.printNames();
            }
            if (komento.equals("find company")){
                System.out.println("Name?");
                String name=lukija.nextLine();
                Company company =database.searchCompany(name);
                    if(company == null){
                        System.out.println("Didnt find company in the database.");
                    }else {
                        System.out.println(company);
                    }
            }
            if (komento.equals("delete company")){
                System.out.println("Name?");
                String name=lukija.nextLine();
                Company company =database.searchCompany(name);
                    if(company == null){
                        System.out.println("Error:Didnt find company in the database.");
                    }else {
                        System.out.println("Company " + name + " deleted.");
                        database.deleteCompany(name);
                        
                    }
            }
            if (komento.equals("change name")){
                System.out.println("What company?");
                String name=lukija.nextLine();
                Company company =database.searchCompany(name);
                    if(company == null){
                        System.out.println("Error:Didnt find company in the database.");
                    }else {
                        System.out.println("New name?");
                        String newName=lukija.nextLine();
                        System.out.println("Names changed.");
                        database.changeName(name,newName);
                        
                    }
            }
            if (komento.equals("save")){
                System.out.println("Save as?");
                String fileName=lukija.nextLine();
                database.writeToFile(fileName);
            }
            
        }
        
    }
        
}
