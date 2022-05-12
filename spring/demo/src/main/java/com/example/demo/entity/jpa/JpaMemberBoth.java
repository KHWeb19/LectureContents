package com.example.demo.entity.jpa;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "jpa_member_both")
public class JpaMemberBoth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    @Column(length = 32, nullable = false)
    private String userId;

    @Column(length = 64, nullable = false)
    private String password;

    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date updDate;

    @OneToMany(mappedBy = "jpaMemberBoth", cascade = CascadeType.ALL)
    private List<JpaMemberAuthBoth> authList = new ArrayList();

    public JpaMemberBoth (String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public JpaMemberBoth (String userId, String password, JpaMemberAuthBoth auth) {
        this.userId = userId;
        this.password = password;

        if (auth != null) {
            changeAuth(auth);
        }
    }

    public void changeAuth (JpaMemberAuthBoth auth) {}

    public void addAuth (JpaMemberAuthBoth auth) {
        if (authList == null) {
            authList = new ArrayList();
        }

        authList.add(auth);
    }

    public void clearAuthList () {
        authList.clear();
    }
}
