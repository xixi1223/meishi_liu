package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by XIXI on 2019/10/31.
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
@Component
public class Admin implements Serializable {
    private Integer id;
    private String adminname;
    private String adminpwd;
}
