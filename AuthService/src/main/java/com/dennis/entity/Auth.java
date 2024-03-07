package com.dennis.entity;

import com.dennis.utility.enums.ERole;
import com.dennis.utility.enums.EStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_auth")
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private ERole role;
    @Enumerated(EnumType.STRING)
    private EStatus status = EStatus.PENDING;

    private Long createDate;
    private Long updateDate;




}
