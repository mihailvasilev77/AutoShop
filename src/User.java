public abstract class User {
    private static int s_id = 1;
    private int id;
    private String username;
    private String password;


    public User() {
        this.id = s_id;
        s_id++;
        this.username = null;
        this.password = null;
    }

    public User(String username, String password) {
        this.id = s_id;
        s_id++;
        this.username = username;
        this.password = password;
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
