package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

/**
 * Created by XIXI on 2019/10/31.
 */
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
@Component
public class FoodMenu implements Serializable {
    private Integer id;
    private List<Food> food;
    private Menu menu;
    private Green green;
}
