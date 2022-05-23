package com.example.demo.db;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@EqualsAndHashCode
public class Account implements Serializable {
    @Id
    private Long userId;
    @Column(name = "number_ff")
    private String numberFf;
    @Column(name = "number_ff2")
    private String numberFf2;
    private String username;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "number_ff", referencedColumnName = "number_ff", insertable = false, updatable = false, unique = true)
    private AccountInfo accountInfos;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "number_ff2", referencedColumnName = "number_ff", insertable = false, updatable = false, unique = true)
    private AccountInfo accountInfo2s;
}
