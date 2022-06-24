package com.pelinhangisi.consumer.entitiy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name ="users")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

        @Id
        @Column(name = "id", nullable = false)
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name ="first_name")
        private String firstName;

        @Column(name ="last_name")
        private String lastName;

        @Column(name ="email")
        private String email;

        public User(Long id) {
                this.id = id;
        }
}
