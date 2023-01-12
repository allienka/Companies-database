
public class Company {
    private String name;
    private String CEOsName;
    private String address;
    private String phoneNumber;
    private long lastYearSales;
    
    public Company (String name,String CEOsName, String address, String phoneNumber, long lastYearSales){
        this.name=name;
        this.CEOsName=CEOsName;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.lastYearSales=lastYearSales;
    }
    public String getName(){
        return name;
    }
    public String getCEOName(){
        return CEOsName;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public long getSales(){
        return lastYearSales;
    }
    public String setName(String name){
        this.name=name;
        return name;
        
    }
    public String toString(){
        return "Company: " + this.name + ", " + "CEOs name: " +  this.CEOsName + ", " + "Office address: " + this.address + ", " + "phone number: " + this.phoneNumber + ", " + "Last year sales: " + this.lastYearSales + " €";
    }
    
}
