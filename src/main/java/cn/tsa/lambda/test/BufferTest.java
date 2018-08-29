package cn.tsa.lambda.test;

import cn.tsa.lambda.test.api.GreetingService1;
import cn.tsa.lambda.test.api.Person;

import java.util.Optional;
import java.util.TreeMap;

public class BufferTest {

    public static void main(String[] args) {
        TreeMap<Integer, String> param = new TreeMap<>();
        int i = 10;
        while (i > 0) {
            param.put(i, String.valueOf(System.currentTimeMillis()));
            i--;
        }
        param.forEach((key, value) -> {
            System.out.println("key:" + key + ",value:" + value);
        });

        Person person = goAndGetAPerson();
        Optional<Person> personOpt = Optional.ofNullable(person);
        personOpt.ifPresent(person1 -> {
            String name = person1.getName();
            String password = person1.getPassword();
            System.out.println("name:" + name + ",password:" + password);
        });
        System.out.println("=======");
        Person other = new Person();
        other.setName("other");
        other.setPassword("otherPassword");
        Person resultPerson = personOpt.orElse(other);
        System.out.println("resultPerson:" + resultPerson);


    }

    private static Person goAndGetAPerson() {
        Person person = new Person();
      /*  person.setName("zhanghongwei");
        person.setPassword("123123123");*/
        return null;
    }
}
