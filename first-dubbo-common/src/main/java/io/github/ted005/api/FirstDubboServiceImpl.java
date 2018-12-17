package io.github.ted005.api;

import com.alibaba.dubbo.config.annotation.Service;
import io.github.ted005.pojo.Dish;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class FirstDubboServiceImpl implements FirstDubboService {

    @Override
    public List<Dish> filterDishes(List<Dish> dishes) {
        return dishes.stream().filter(dish -> dish.getCalory() > 200).collect(Collectors.toList());
    }
}
