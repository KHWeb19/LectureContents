package com.example.demo.entity.jpa;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@Table(name = "jpa_member_auth_both")
public class JpaMemberAuthBoth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberAuthNo;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "jpa_member_both_member_no")
    private JpaMemberBoth jpaMemberBoth;

    @Column(length = 64, nullable = false)
    private String auth;

    @CreationTimestamp
    private Date regDate;

    @UpdateTimestamp
    private Date updDate;

    public JpaMemberAuthBoth(String auth, JpaMemberBoth member) {
        this.auth = auth;
        jpaMemberBoth = member;
    }
}
