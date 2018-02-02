package com.lk.lambda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User extends BaseEntity{
   @Column(name = "address")
   private String address;
}
