import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentSteam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Создаем учащихся
        Student student1 = new Student("Ivan", 23);
        Student student2 = new Student("Maria", 21);
        Student student3 = new Student("Semyon", 22);

        Student student4 = new Student("Victoria", 23);
        Student student5 = new Student("Alexander", 21);
        Student student6 = new Student("Evgenia", 22);

        Student student7 = new Student("Evgenia", 22);
        Student student8 = new Student("Ivan", 21);
        Student student9 = new Student("Maria", 22);
        Student student10 = new Student("Semyon", 22);

        Student student11 = new Student("Victoria", 23);
        Student student12 = new Student("Alexander", 21);

        Student student13 = new Student("Evgenia", 22);
        Student student14 = new Student("Ivan", 22);
        Student student15 = new Student("Maria", 22);
        Student student16 = new Student("Semyon", 22);

        Student student17 = new Student("Alexander", 22);
        Student student18 = new Student("Evgenia", 22);

        Student student19 = new Student("Evgenia", 22);
        Student student20 = new Student("Alexander", 22);
        Student student21 = new Student("Oleg", 22);

        // Добавляем из в разные списки
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<Student> students2 = new ArrayList<>();
        students2.add(student4);
        students2.add(student5);
        students2.add(student6);

        List<Student> students3 = new ArrayList<>();
        students3.add(student7);
        students3.add(student8);
        students3.add(student9);
        students3.add(student10);

        List<Student> students4 = new ArrayList<>();
        students4.add(student11);
        students4.add(student12);

        List<Student> students5 = new ArrayList<>();
        students5.add(student13);
        students5.add(student14);
        students5.add(student15);
        students5.add(student16);

        List<Student> students6 = new ArrayList<>();
        students6.add(student17);
        students6.add(student18);

        List<Student> students7 = new ArrayList<>();
        students7.add(student19);
        students7.add(student20);
        students7.add(student21);

        // В соответствии со списками добавляем учащихся в группы с разными номерами
        StudentGroup studentGroup = new StudentGroup(5281, students);
        StudentGroup studentGroup2 = new StudentGroup(5282, students2);
        StudentGroup studentGroup3 = new StudentGroup(5283, students3);
        StudentGroup studentGroup4 = new StudentGroup(5284, students4);
        StudentGroup studentGroup5 = new StudentGroup(5285, students5);
        StudentGroup studentGroup6 = new StudentGroup(5286, students6);
        StudentGroup studentGroup7 = new StudentGroup(5287, students7);

        // Создаем список групп
        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(studentGroup);
        studentGroups.add(studentGroup2);
        studentGroups.add(studentGroup3);
        studentGroups.add(studentGroup4);
        studentGroups.add(studentGroup5);
        studentGroups.add(studentGroup6);
        studentGroups.add(studentGroup7);

        // Добавляем группы в единый поток
        StudentSteam studentSteam = new StudentSteam(1, studentGroups);
        // Выводим список групп в соответствии с добавлением
        System.out.println(studentSteam);

        System.out.println("======================================================================================");

        // Сортируем группы сначала по количеству студентов, а затем по идентификатору группы
        Collections.sort(studentSteam.getStudentGroups());
        // Выводим отсортированный список групп
        System.out.println(studentSteam);
    }
}
