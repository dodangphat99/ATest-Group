package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    String fullName;
    String phoneNumber;
    String email;
    String referralCode;
    String password;
    String newPassword;
    String confirmPassword;
    String userName;
    String search;

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", referralCode='" + referralCode + '\'' +
                ", password='" + password + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", search='" + search + '\'' +
                '}';
    }
}
