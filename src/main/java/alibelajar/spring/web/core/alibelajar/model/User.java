package alibelajar.spring.web.core.alibelajar.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String id;
    private String nama;
    private String email;

    @JsonProperty("no-telp")
    private String noTelp;

    private String password;
    private String departemen;
    private String jabatan;
    private String otp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departement) {
        this.departemen = departement;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getOtp() {
        return otp;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }
}