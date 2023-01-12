
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Database {
    private ArrayList<Company>companies;
    
    public Database (){
        this.companies=new ArrayList<>();
    }
    public void addCompany(String name, String CEOsName, String address, String phoneNumber, long lastYearsSales){
        Company newCompany=new Company(name,CEOsName,address,phoneNumber,lastYearsSales);
        this.companies.add(newCompany);
    }
    public Company searchCompany(String name){
        for (Company company:this.companies){
            if(company.getName().equals(name)){
                return company;
            }
            
        }
        return null;
    }
    
    public void printNames(){
        for (Company company:this.companies){
            System.out.println(company.getName());
        }
    }
    public void deleteCompany(String name){
        Company company=searchCompany(name);
            companies.remove(company);
           
        
    }
    public void changeName(String oldName,String newName){
        Company company=searchCompany(oldName);
        company.setName(newName);
    }
    public void writeToFile(String name){
        try{
            FileWriter writer=new FileWriter(name);
            for (Company company:companies){
                writer.write(company.getName() + "," +  company.getCEOName() + ","+ company.getAddress() + "," + company.getPhoneNumber() + "," + company.getSales()+"\n" );
            }
            writer.close();
            
        }catch(Exception e){
            
        }
    }
    public void loadDatabase(String tiedosto){
        try (Scanner tiedostonLukija = new Scanner (Paths.get(tiedosto))){
            while (tiedostonLukija.hasNextLine()){
                String line=tiedostonLukija.nextLine();
                String []parts=line.split(",");
                String name=parts[0];
                String CEOname=parts[1];
                String address=parts[2];
                String phoneNr=parts[3];
                long sales=Long.valueOf(parts[4]);
                
                companies.add(new Company(name,CEOname,address,phoneNr,sales));
            }
            
        }catch (Exception e){
            System.out.println("File not found.");
        }
        
    }
        
}
