package com.security.infraestructure.entities;

import com.security.domain.model.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    private String email;
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String fax;


    @Column(name = "email_verified")
    private boolean emailVerified;


    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "verification_code")
    private String verificationCode;
    private String ip;
    private String address2;

    public static UserEntity fromDomainModel(User user){
        return new UserEntity(user.getId(), user.getEmail(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getAddress(), user.getCity(), user.getState(), user.getIp(), user.getCountry(), user.getPhone(), user.getFax(),
                user.isEmailVerified(), user.getRegistrationDate(), user.getVerificationCode(), user.getIp(), user.getAddress2());
    }

    public User toDomainModel(){
        return new User(id, email, password, firstName, lastName, address, city, state, zip, country, phone, fax, emailVerified, registrationDate, verificationCode, ip, address2);
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        UserEntity that = (UserEntity) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public final int hashCode() {
        return getClass().hashCode();
    }
}
