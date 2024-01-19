package com.example.userAPI.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "sms")
public class SmsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;
    private String status;
    private String mensagem;

    private String phone;

    public Long getIdSms() {
        return idUser;
    }

    public void setIdSms(Long idUser) {
        this.idUser = idUser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
