package Entite;

/**
 *
 * @author Hudson
 */
public class User {

    private int id_user;
     private String first_Name;
    private String last_Name;
    private String user_Name;
    private String password;
    private String email;
    private int phone_number;
    private String gender;
    private int CIN;
    private String account_Date;
    private String Image_user;
    private int age;
    private int id_classe;

    public User(int id_user, String first_Name, String last_Name, String user_Name, String password, String email, int phone_number, String gender, int CIN, String account_Date, String Image_user, int age, int id_classe) {
        this.id_user = id_user;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.user_Name = user_Name;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
        this.gender = gender;
        this.CIN = CIN;
        this.account_Date = account_Date;
        this.Image_user = Image_user;
        this.age = age;
        this.id_classe = id_classe;
    }

    public int getId_user() {
        return id_user;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public String getGender() {
        return gender;
    }

    public int getCIN() {
        return CIN;
    }

    public String getAccount_Date() {
        return account_Date;
    }

    public String getImage_user() {
        return Image_user;
    }

    public int getAge() {
        return age;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public void setAccount_Date(String account_Date) {
        this.account_Date = account_Date;
    }

    public void setImage_user(String Image_user) {
        this.Image_user = Image_user;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", user_Name=" + user_Name + ", password=" + password + ", email=" + email + ", phone_number=" + phone_number + ", gender=" + gender + ", CIN=" + CIN + ", account_Date=" + account_Date + ", Image_user=" + Image_user + ", age=" + age + ", id_classe=" + id_classe + '}';
    }
  

  
}