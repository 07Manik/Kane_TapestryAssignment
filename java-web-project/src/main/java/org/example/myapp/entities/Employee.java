package org.example.myapp.entities;
import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(name = "age")
private int age;

@Column(name = "name")
private String name;

@Column(name = "address")
private String address;


public Employee() {
}


public Employee(int age, String name, String address) {
this.age = age;
this.name = name;
this.address = address;
}


public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
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

@Override
public String toString() {
return "Employee{" +
        "id=" + id +
        ", age=" + age +
        ", name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
}
}
