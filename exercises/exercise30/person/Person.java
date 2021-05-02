package de.renemeier.udemy.timbuchalka.exercises.exercise30.person;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (lastName.equals("")) {
            return firstName;
        } else if (firstName.equals("")) {
            return lastName;
        } else {
            return (firstName + " " + lastName);
        }
    }
}