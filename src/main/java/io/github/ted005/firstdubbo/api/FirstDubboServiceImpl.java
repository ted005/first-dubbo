package io.github.ted005.firstdubbo.api;

import com.alibaba.dubbo.config.annotation.Service;
import io.github.ted005.firstdubbo.pojo.Dish;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class FirstDubboServiceImpl implements FirstDubboService {

    @Override
    public List<Dish> filterDishes(List<Dish> dishes, Predicate<Dish> predicate) {
        return dishes.stream().filter(predicate).collect(Collectors.toList());
    }
}
