public class User {
    private String login;
    private String password;
    private String name;
    private String mail;

    public User(){}

    public User(String login, String password, String name, String mail) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString(){
        return name+" "+login+" "+password+" "+mail;
    }
}
