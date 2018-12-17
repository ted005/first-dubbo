package io.github.ted005.firstdubbo.api;

import io.github.ted005.firstdubbo.pojo.Dish;

import java.util.List;
import java.util.function.Predicate;

public interface FirstDubboService {

    List<Dish> filterDishes(List<Dish> dishes, Predicate<Dish> predicate);

}
