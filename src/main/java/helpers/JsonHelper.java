package helpers;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.User;
import org.testng.annotations.BeforeTest;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class JsonHelper {
    private String link = "C:\\Users\\PC\\IdeaProjects\\Test\\src\\main\\resources\\User.json";
    private String linkLogin = "C:\\Users\\PC\\IdeaProjects\\Test\\src\\main\\resources\\UserLogin.json";
    List<User> users = null;

    public void JsonUser(){
        try {
            Reader reader = Files.newBufferedReader(Paths.get(link));
            users = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
//            users.forEach(System.out::println);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void JsonUserLogin(){
        try {
            Reader reader = Files.newBufferedReader(Paths.get(linkLogin));
            users = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
//            users.forEach(System.out::println);
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
