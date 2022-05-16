package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {
    public List<User> userMethod (Collection<User> users){

        //Удаляем дубликаты
        HashSet<User> userHashSet = new HashSet<User>(users);

        //Сортируем по имени и возрасту
        List<User> sortedUserList = userHashSet.stream().
                sorted(Comparator.comparing(User::getName).thenComparing(User::getAge)).
                collect(Collectors.toList());


        //Получаем максимальный возраст
        Integer maxAge = sortedUserList.stream().max(Comparator.comparingInt(User::getAge)).get().getAge();

        //ПОлучаем список самых взрослых User
        return sortedUserList.stream().filter(user -> Objects.equals(user.getAge(), maxAge)).toList();

    }
}
