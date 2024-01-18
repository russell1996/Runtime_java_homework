package hm_1_1.database;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FilialDepartment> departments = FilialDepartmentDao.getAllFilialDepartments();

        for (FilialDepartment department : departments) {
            System.out.println(department);
        }

        // Закрыть соединение после использования
        FilialDepartmentDao.closeConnection();
    }
}
