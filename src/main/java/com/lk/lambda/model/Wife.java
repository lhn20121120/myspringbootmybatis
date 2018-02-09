package com.lk.lambda.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "t_wife")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Wife extends  BaseEntity{
    @Column(name = "cup_size")
    private int cupSize;
    @Column(name = "sex_type")
    private int sexType;
}
