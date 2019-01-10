package source;

public class User {
    String name,pwd,addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public User(String name,String pwd){
        this.name=name;
        this.pwd=pwd;
        System.out.println("this is constructor");
    }
}
