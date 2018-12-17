package io.github.ted005.api;

import io.github.ted005.pojo.Dish;

import java.util.List;
import java.util.function.Predicate;

public interface FirstDubboService {

    List<Dish> filterDishes(List<Dish> dishes);

}
