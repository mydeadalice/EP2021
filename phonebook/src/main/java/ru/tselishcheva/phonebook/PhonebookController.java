package ru.tselishcheva.phonebook;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persons")
public class PhonebookController {
    private static Repository repository = new Repository();

    @GetMapping("all")
    public ArrayList<Person> list() {
        ArrayList<Person> list = repository.listOfPersons();
        return list;
    }

    @GetMapping("{name}")
    public Person person(@PathVariable String name) {
        return repository.personByName(name);
    }

    @PostMapping
    public void create(@RequestBody Person person) {
        repository.addPerson(person.getName(), person.getPhonenumber(), person.getAddress());
    }

    @PutMapping
    public void update(@RequestBody Person person) {
        repository.updatePerson(person.getName(), person.getPhonenumber(), person.getAddress());
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam(value = "name", required = false) String name) {
        repository.removePerson(name);
    }
}