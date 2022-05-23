package com.example.demo.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "account_info")
@Getter
@Setter
@EqualsAndHashCode
public class AccountInfo implements Serializable {
    @Id
    private Long accountInfoId;
    @NaturalId
    @Column(name = "number_ff")
    private String numberFf;
    private String info;
}
