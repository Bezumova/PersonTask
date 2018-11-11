import org.joda.time.LocalDate;
import org.joda.time.Years;

public class Person {
    private int id;
    private String fio;
    private String gender;
    private LocalDate birthday;

    public Person(int id, String fio, String gender, LocalDate birthday){
        this.id = id;
        this.fio = fio;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getFio(){
        return this.fio;
    }

    /**
     * Calculates the person's current age
     * @return Age of person
     */
    public int getAge(){
        LocalDate date_today = new LocalDate();
        return date_today.getYear() - this.birthday.getYear();
    }
}
