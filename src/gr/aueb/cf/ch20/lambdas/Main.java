package gr.aueb.cf.ch20.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    private static final List<Teacher> teachers = List.of(new Teacher(1, "A.", "Cooper"), new Teacher(2, "B.", "Dylan"),
            new Teacher(3, "C.", "Mask"), new Teacher(4, "D.", "Gates"));

    public static void main(String[] args) {
//        filterAndPrintEqualsId(teachers, 4);
//        filterAndPrintGTId(teachers, 2);

//        getFilteredTeachers(teachers, new ITeacherFilter() {
//            @Override
//            public boolean filterId(Teacher teacher) {
//                return teacher.getTeacherId() == 3;
//            }
//        });

        //getFilteredTeachers(teachers, teacher ->  teacher.getTeacherId() == 3);

        List<Teacher> teachersList = getFilteredTeachers(teachers, teacher -> teacher.getTeacherId() <= 3);

//        for (Teacher teacher : teachersList) {
//            teacher.printInstanceTeacher();
//        }

        printTeachers(teachersList, teacher -> teacher.printInstanceTeacher());
        printTeachers(teachersList, teacher -> Teacher.printStaticTeacher(teacher));
        printTeachers(teachersList, teacher -> System.out.println(teacher));

        printTeachers(teachersList, Teacher::printInstanceTeacher);
        printTeachers(teachersList, Teacher::printStaticTeacher);
        printTeachers(teachersList, System.out::println);




    }

    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter) {
        List<Teacher> teachersToReturn = new ArrayList<>();

        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teachersToReturn.add(teacher);
            }
        }

        return teachersToReturn;
    }

    public static void printTeachers(List<Teacher> teachers, Consumer<Teacher> consumer) {
        for (Teacher teacher : teachers) {
            consumer.accept(teacher);
        }
    }


//    public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, ITeacherFilter filter) {
//        List<Teacher> teachersToReturn = new ArrayList<>();
//
//        for (Teacher teacher : teachers) {
//            if (filter.filterId(teacher)) {
//                teachersToReturn.add(teacher);
//            }
//        }
//
//        return teachersToReturn;
//    }






    public static void filterAndPrintEqualsId(List<Teacher> teachers, int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == id) {
                System.out.println("Full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
            }
        }
    }

    public static void filterAndPrintLTId(List<Teacher> teachers, int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() <= id) {
                System.out.println("Full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
            }
        }
    }

    public static void filterAndPrintGTId(List<Teacher> teachers, int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() >= id) {
                System.out.println("Full name: " + teacher.getFirstname() + ", " + teacher.getLastname());
            }
        }
    }
}
