package com.regex;

public class User {
    private String firstName;
    private String lastName;
//    private String email;
//    private String Phn;
//    private String password;
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        if (Validator.isValidpassword(password)) {
//            this.password = password;
//        } else System.out.println("Enter valid password");
//    }
//
//    public String getPhn() {
//        return Phn;
//    }
//
//    public void setPhn(String phn) {
//        if (Validator.isValidPhoneNo(phn)) {
//            Phn = phn;
//        } else System.out.println("Enter valid phone Number");
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        if (Validator.isValidEmail(email)) {
//            this.email = email;
//        } else System.out.println("Enter Valid email");
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (Validator.isValidName(firstName)) {
            this.firstName = firstName;
        } else {
            System.out.println("Enter Valid First name");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (Validator.isValidName(lastName)) {
            this.lastName = lastName;
        } else {
            System.out.println("Enter Valid Last name");
        }

    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", email='" + email + '\'' +
//                ", Phn='" + Phn + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
