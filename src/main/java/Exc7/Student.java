package Exc7;

public class Student {
    private long index;
    private String name;
    private String surname;

    private Student(final long index, final String name, final String surname) {
        this.index = index;
        this.name = name;
        this.surname = surname;
    }

    public long getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class Builder{
        private long index;
        private String name;
        private String surname;

        public Builder setIndex(final long index) {
            this.index = index;
            return this;
        }

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(final String surname) {
            this.surname = surname;
            return this;
        }
        public Student build(){
            this.index = index;
            this.name = name;
            this.surname = surname;
            return new Student(index,name,surname);
        }
    }
}
