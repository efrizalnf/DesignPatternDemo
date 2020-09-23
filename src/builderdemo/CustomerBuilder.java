package builderdemo;

public class CustomerBuilder {
    private String id;
    private String name;
    private String email;
    private String address = "Jakarta";

    public CustomerBuilder(){

    }
    public CustomerBuilder(String id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public CustomerBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public String toString(){
        return name +"\n"+ id + "\n"+email + "\n"+address;
    }
    public CustomerBuilder build(){
        return new CustomerBuilder(
                this.id,
                this.name,
                this.email,
                this.address
        );
    }
}
