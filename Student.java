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
    
    public int getId() {
        return ID;
    }

    public String getFirst_Name() {
        return FIRST_NAME;
    }

    public String getInitial() {
        return INITIAL;
    }

    public String getLast_Name() {
        return LAST_NAME;
    }

    public int getAge() {
        return AGE;
    }

    public String getEmail() {
        return EMAIL;
    }

    public String getGender() {
        return GENDER;
    }

    public String getCourse() {
        return COURSE;
    }

    public int getYear() {
        return YEAR;
    }

    public int getSection() {
        return SECTION;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s %s %s', age=%d, email='%s', gender='%s', course='%s', year=%d, section=%d}",
                ID, FIRST_NAME, INITIAL, LAST_NAME, AGE, EMAIL, GENDER, COURSE, YEAR, SECTION);
    }

    public static class Builder {
        private int id;
        private String first_name;
        private String initial;
        private String last_name;
        private int age;
        private String email;
        private String gender;
        private String course;
        private int year;
        private int section;


        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder first_name(String first_name) {
            this.first_name = first_name;
            return this;
        }

        public Builder initial(String initial) {
            this.initial = initial;
            return this;
        }

        public Builder last_name(String last_name) {
            this.last_name = last_name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder course(String course) {
            this.course = course;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder section(int section) {
            this.section = section;
            return this;
        }

        public Student build() {

            return new Student(this);
        }
    }

}
