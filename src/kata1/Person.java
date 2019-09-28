package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private static final int MILISECONDS_PER_SECOND = 1000;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final double DAYS_PER_YEAR = 365.25;

    public Person(String name,Date birthday) {
        this.birthday = birthday;
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return (int) ((new Date().getTime() - birthday.getTime()) / toYears());
    }
    
    public long toYears () {
        return (long) (MILISECONDS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR);
    }
}
