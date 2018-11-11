import org.joda.time.LocalDate;

public class PersonTask {
    public static void main(String[] args) {
        LocalDate new_date = new LocalDate().withYear(1990).withMonthOfYear(1).withDayOfMonth(1);
        Person person1 = new Person(1,"BIA","man", new_date);
        Person person2 = new Person(2,"DVE","man", new_date);
        Person person3 = new Person(3,"SDV","woman", new_date);
        Person person4 = new Person(4,"GIM","woman", new_date);

        //проверка getAge()
        System.out.println("Age of person " + person1.getFio() + ": " + person1.getAge());

        //создание репозитория людей
        Person[] persons = new Person[]{person1, person2};
        Repository list_of_persons = new Repository(persons);

        String out = "Array 1:";
        for (int i = 0; i < persons.length; i++) {
            out += " " + persons[i].getFio();
        }
        System.out.println(out);

        //добавление людей в существующий репозиторий
        list_of_persons.addPerson(person3);
        list_of_persons.addPerson(person4);

        persons = list_of_persons.getPersons();
        out = "Array 2 (add):";
        for (int i = 0; i < persons.length; i++) {
            out += " " + persons[i].getFio();
        }
        System.out.println(out);

        //удаление людей из существующиего репозитория
        list_of_persons.removePerson(person2);
        list_of_persons.removePerson(person4);

        persons = list_of_persons.getPersons();
        out = "Array 3 (remove):";
        for (int i = 0; i < persons.length; i++) {
            out += " " + persons[i].getFio();
        }
        System.out.println(out);

        //удаление всех людей из репозитория
        list_of_persons.removePerson(person1);
        list_of_persons.removePerson(person2); //пробуем удалить того, кого и так нет в массиве
        list_of_persons.removePerson(person3);

        persons = list_of_persons.getPersons();
        out = "Array 4 (remove all):";
        for (int i = 0; i < persons.length; i++) {
            out += " " + persons[i].getFio();
        }
        System.out.println(out);
    }
}
