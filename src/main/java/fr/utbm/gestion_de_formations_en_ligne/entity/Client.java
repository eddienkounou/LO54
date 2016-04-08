package fr.utbm.gestion_de_formations_en_ligne.entity;
// Generated 4 avr. 2016 22:24:00 by Hibernate Tools 4.3.1



/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private short id;
     private CourseSession courseSession;
     private String lastname;
     private String firstname;
     private String address;
     private String phone;
     private String email;

    public Client() {
    }

	
    public Client(short id, CourseSession courseSession, String lastname, String firstname, String address, String phone) {
        this.id = id;
        this.courseSession = courseSession;
        
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.phone = phone;
    }
    public Client(short id, CourseSession courseSession, String lastname, String firstname, String address, String phone, String email) {
       this.id = id;
       this.courseSession = courseSession;
       this.lastname = lastname;
       this.firstname = firstname;
       this.address = address;
       this.phone = phone;
       this.email = email;
    }
   
    public short getId() {
        return this.id;
    }
    
    public void setId(short id) {
        this.id = id;
    }
    public CourseSession getCourseSession() {
        return this.courseSession;
    }
    
    public void setCourseSession(CourseSession courseSession) {
        this.courseSession = courseSession;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}

