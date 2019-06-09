package hello.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class StockAccountLegalUser {
    @Id
    @GeneratedValue
    private Long account_id;  // 法人股票账户号码
    @Column(nullable = false, unique = true)
    private String legal_num;  //法人注册登记号码
    @Column(nullable = false)
    private String license_num;
    @Column(nullable = false)
    private String legal_name;
    @Column(nullable = false)
    private String legal_Idnum;   // 法定代表人身份证号码
    @Column(nullable = false)
    private String legal_address;
    @Column(nullable = false)
    private String legal_phone;
    @Column(nullable = false)
    private String grantor_name;
    @Column(nullable = false)
    private String grantor_Idnum;
    @Column(nullable = false)
    private String grantor_address;
    @Column(nullable = false)
    private String grantor_phone;

    public StockAccountLegalUser(){}

    public StockAccountLegalUser(//String account_id
            String legal_num
            , String license_num
            , String legal_name
            , String legal_id_num
            , String legal_address
            , String legal_phone
            , String authorize_name
            , String authorize_id_num
            , String authorize_address
            , String authorize_phone) {
   //     this.account_id = account_id;
        this.legal_num = legal_num;
        this.license_num = license_num;
        this.legal_name = legal_name;
        this.legal_Idnum = legal_id_num;
        this.legal_address = legal_address;
        this.legal_phone = legal_phone;
        this.grantor_name = authorize_name;
        this.grantor_Idnum = authorize_id_num;
        this.grantor_address = authorize_address;
        this.grantor_phone = authorize_phone;
    }

    public String getAccount_id() {
        return account_id.toString();
    }

//    public void setAccount_id(String account_id) {
//        this.account_id = account_id;
//    }

    public String getLegal_num() {
        return legal_num;
    }

    public void setLegal_num(String legal_num) {
        this.legal_num = legal_num;
    }

    public String getLicense_num() {
        return license_num;
    }

    public void setLicense_num(String license_num) {
        this.license_num = license_num;
    }

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getLegal_Idnum() {
        return legal_Idnum;
    }

    public void setLegal_id_num(String legal_id_num) {
        this.legal_Idnum = legal_id_num;
    }

    public String getLegal_address() {
        return legal_address;
    }

    public void setLegal_address(String legal_address) {
        this.legal_address = legal_address;
    }

    public String getLegal_phone() {
        return legal_phone;
    }

    public void setLegal_phone(String legal_phone) {
        this.legal_phone = legal_phone;
    }

    public String getGrantor_name() {
        return grantor_name;
    }

    public void setGrantor_name(String authorize_name) {
        this.grantor_name = authorize_name;
    }

    public String getGrantor_Idnum() {
        return grantor_Idnum;
    }

    public void setGrantor_Idnum(String authorize_id_num) {
        this.grantor_Idnum = authorize_id_num;
    }

    public String getGrantor_address() {
        return grantor_address;
    }

    public void setGrantor_address(String authorize_address) {
        this.grantor_address = authorize_address;
    }

    public String getGrantor_phone() {
        return grantor_phone;
    }

    public void setGrantor_phone(String authorize_phone) {
        this.grantor_phone = authorize_phone;
    }
}
