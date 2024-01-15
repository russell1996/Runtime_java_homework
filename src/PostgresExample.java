import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresExample {
    public static void main(String[] args) {
        try {
            // Загрузка драйвера PostgreSQL JDBC не требуется, если вы добавили его в настройках проекта

            // Установка соединения с базой данных
            String url = "jdbc:postgresql://192.168.128.197:5432/kt-docs";
            String username = "bpmn";
            String password = "T6CT~d$dEU!(";
            Connection connection = DriverManager.getConnection(url, username, password);

            // Создание запроса и выполнение
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM document");

            // Обработка результатов
            while (resultSet.next()) {
                String columnName = resultSet.getString("id");
                System.out.println(columnName);
                // Дополнительная обработка...
            }

            // Закрытие соединения
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
