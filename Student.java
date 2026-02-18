public final class Student {

    private final int ID;
    private final String FIRST_NAME;
    private final String INITIAL;
    private final String LAST_NAME;
    private final int AGE;
    private final String EMAIL;
    private final String GENDER;
    private final String COURSE;
    private final int YEAR;
    private final int SECTION;


    private Student(Builder builder) {
        this.ID = builder.id;
        this.FIRST_NAME = builder.first_name;
        this.INITIAL = builder.initial;
        this.LAST_NAME = builder.last_name;
        this.AGE = builder.age;
        this.EMAIL = builder.email;
        this.GENDER = builder.gender;
        this.COURSE = builder.course;
        this.YEAR = builder.year;
        this.SECTION = builder.section;
    }
}
