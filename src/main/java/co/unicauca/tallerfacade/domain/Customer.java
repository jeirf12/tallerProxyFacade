package co.unicauca.tallerfacade.domain;

/**
 *  Objeto de cliente
 * @author Jhonfer
 * @author Jhonny
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;
    
    public Customer(){
        this.id = 0;
        this.name = "";
        this.address = "";
        this.mobile = "";
        this.city = "";
    }
    
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
