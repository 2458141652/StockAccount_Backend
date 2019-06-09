package hello.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StockAccountPersonalUser {
    @Id
    //@GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long account_id;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false, unique = true)
    private String Id_num;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String job;
    @Column(nullable = false)
    private String degree;
    @Column(nullable = false)
    private String organization;
    @Column(nullable = false)
    private String phone_num;
    @Column(nullable = false)
    private boolean agency;
    @Column
    private String agent_idnum;

    public StockAccountPersonalUser(){}

    public StockAccountPersonalUser( Long account_id
            , Date date
            , String name
            , String gender
            , String id_num
            , String address
            , String job
            , String degree
            , String organization
            , String phone_num
            , boolean agency
            , String agent_id_num){
        this.account_id = account_id;
        this.date = date;
        this.name = name;
        this.gender = gender;
        this.Id_num = id_num;
        this.address = address;
        this.job = job;
        this.degree = degree;
        this.organization = organization;
        this.phone_num = phone_num;
        this.agency = agency;
        this.agent_idnum = agent_id_num;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public Date getDate() {
        return date;
    }

    public boolean getAgency() {
        return agency;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAgent_IDnum() {
        return agent_idnum;
    }

    public String getDegree() {
        return degree;
    }

    public String getId_num() {
        return Id_num;
    }

    public String getJob() {
        return job;
    }

    public String getOrganization() {
        return organization;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAgency(boolean agency) {
        this.agency = agency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgent_idnum(String agent_id_num) {
        this.agent_idnum = agent_id_num;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setId_num(String id_num) {
        this.Id_num = id_num;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
}
