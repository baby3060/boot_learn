package com.learn.domain;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "MEMEBER")
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private long id;

    @Column(name = "MEMBER_NAME", length = 20, nullable = false)
    @NonNull
    private String name;

    @Column(length = 100)
    @NonNull
    private String address;

    @Column(name = "MEMBER_AGE", precision = 3)
    @NonNull
    private int age;
}