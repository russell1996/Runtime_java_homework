package task_1;

public class FootballMatch extends SportEvent {
    Team team1;
    Team team2;
    int team1Goals;
    int team2Goals;
    Team winner;

    // TODO: реализовать метод для определения победителя по голам (team1Goals, team2Goals)
    void defineWinner() {
        if (team1Goals > team2Goals) {
            winner = team1;
        } else if (team1Goals < team2Goals) {
            winner = team2;
        } else {
            winner = null;
        }
    }

    // TODO: реализовать метод для вывода информации о событии
    @Override
    void start() {
        System.out.println("Начало событий: " + name);
        System.out.println("Дата проведения: " + date);
        System.out.println("Место: " + place);
    }
}
