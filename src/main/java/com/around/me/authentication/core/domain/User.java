package com.around.me.authentication.core.domain;


import com.around.me.authentication.core.enums.user.GenderEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Table(name = "user")
@Entity
@Getter
public class User implements Serializable {

    @Id @GeneratedValue
    @Setter
    private long userNo;

    @JsonIgnore
    @Setter
    private String userPassword;

    @Setter
    private String userName;

    @Setter
    private String userEmail;

    @Setter
    private String userMobile;

    @Setter
    @Enumerated(EnumType.STRING)
    private GenderEnum gender;

    @Setter
    private String birth;

    @Setter
    private String userSort;

    @Setter
    private LocalDate lastLoginDate;

    @Setter
    private String lastPasswordModDate;

    @Setter
    private int loginTryCount;

    @Setter
    private String userStatus;

    @Setter
    private String blackListYn;

    @Setter
    private LocalDateTime regDatetime;

    @Setter
    private LocalDateTime modDatetime;

    @Setter
    private long regUserNo;

    @Setter
    private long modUserNo;

    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }
}
