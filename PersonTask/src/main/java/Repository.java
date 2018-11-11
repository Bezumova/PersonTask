public class Repository {
    private Person[] persons;

    public Repository(Person[] persons){
        this.persons = persons;
    }

    public Person[] getPersons(){
        return persons;
    }

    /**
     * Adds a new person to the array of persons
     * @param new_person A new person to add to the current array
     */
    public void addPerson(Person new_person){
        Person[] new_persons = new Person[this.persons.length + 1];

        for (int i = 0; i < this.persons.length; i++) {
            new_persons[i] = this.persons[i];
        }

        new_persons[new_persons.length - 1] = new_person;
        this.persons = new_persons;
    }

    /**
     * Removes a person from the array of person
     * @param person_to_remove A person to remove from the current array
     */
    public void removePerson(Person person_to_remove){
        boolean found = false;
        int i = 0;
        while ((i < this.persons.length) & !found){
            if (this.persons[i] == person_to_remove)
                found = true;
            i++;
        }

        if (found){
            Person[] new_persons = new Person[this.persons.length - 1];
            for (int j = 0; j < i - 1; j++) {
                new_persons[j] = this.persons[j];
            }
            for (int j = i - 1; j < new_persons.length; j++) {
                new_persons[j] = this.persons[j+1];
            }
            this.persons = new_persons;
        }
    }
}
