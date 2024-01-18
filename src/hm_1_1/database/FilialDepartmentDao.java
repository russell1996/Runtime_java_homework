package hm_1_1.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FilialDepartmentDao {

    private static final String URL = "jdbc:postgresql://192.168.128.197:5432/kt-docs";
    private static final String USER = "bpmn";
    private static final String PASSWORD = "T6CT~d$dEU!(";
    private static Connection connection;

    private static final String SELECT_ALL_QUERY = "SELECT id, name, server_id FROM public.filial_department_ref";

    static {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<FilialDepartment> getAllFilialDepartments() {
        List<FilialDepartment> filialDepartments = new ArrayList<>();

        try (
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_QUERY);
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {
            while (resultSet.next()) {
                FilialDepartment department = new FilialDepartment(
                        resultSet.getLong("id"),
                        resultSet.getString("name"),
                        resultSet.getLong("server_id")
                );
                filialDepartments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return filialDepartments;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
