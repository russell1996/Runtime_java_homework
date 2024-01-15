package task_1;

public class Team {
    String name;
    Player[] players = new Player[11];

    // TODO: реализовать метод для вывода всех игроков команды и информации о команде
    void printPlayers() {
        System.out.println("Игроки команды '" + name + "'");
        for (Player player : players) {
            if (player != null) {
                System.out.println("- " + player.name + " " + player.age + " " + player.nationality);
            }
        }
    }
}
