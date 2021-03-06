package com.lk.lambda.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{
   @Column(name = "address")
   private String address;
   @Column(name = "age" ,nullable=true)

   private int age;
   private String lastName;
}
