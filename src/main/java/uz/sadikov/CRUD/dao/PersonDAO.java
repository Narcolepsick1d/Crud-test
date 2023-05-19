package uz.sadikov.CRUD.dao;

import org.springframework.stereotype.Component;
import uz.sadikov.CRUD.models.Person;

import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "garik",0));
        people.add(new Person(++PEOPLE_COUNT, "dima",0));
        people.add(new Person(++PEOPLE_COUNT, "aziz",0));
        people.add(new Person(++PEOPLE_COUNT, "tima",0));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int account) {
        return people.stream().filter(person -> person.getAccount() == account).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int account, Person updatedPerson) {
        Person personToBeUpdated = show(account);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setValue(updatedPerson.getValue());
    }

    public void delete(int account) {
        people.removeIf(p -> p.getAccount() == account);
    }
}
