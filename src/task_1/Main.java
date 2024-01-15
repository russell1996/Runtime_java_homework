package task_1;

public class Main {
    public static void main(String[] args) {
        FootballMatch footballMatch = new FootballMatch();
        footballMatch.place = "Англия, Лондон";
        footballMatch.date = "12 октября 2023";
        footballMatch.team1 = team1();
        footballMatch.team2 = team2();

        footballMatch.start();

        footballMatch.team1Goals = 2;
        footballMatch.team2Goals = 3;

        footballMatch.defineWinner();

        footballMatch.team1.printPlayers();
        footballMatch.team2.printPlayers();

        System.out.println("Победила команда: " + footballMatch.winner.name +
                " со счетом " + footballMatch.team1Goals + ":" + footballMatch.team2Goals);
    }



    static Team team1() {
        Team arsenal = new Team();
        arsenal.name = "Arsenal";

        arsenal.players[0] = new Player();
        arsenal.players[0].name = "David Raya";
        arsenal.players[0].age = 28;
        arsenal.players[0].nationality = "Spain";

        arsenal.players[1] = new Player();
        arsenal.players[1].name = "William Saliba";
        arsenal.players[1].age = 22;
        arsenal.players[1].nationality = "France";

        arsenal.players[2] = new Player();
        arsenal.players[2].name = "Ben White";
        arsenal.players[2].age = 26;
        arsenal.players[2].nationality = "England";

        arsenal.players[3] = new Player();
        arsenal.players[3].name = "Gabriel";
        arsenal.players[3].age = 25;
        arsenal.players[3].nationality = "Brazil";

        arsenal.players[4] = new Player();
        arsenal.players[4].name = "Oleksandr Zinchenko";
        arsenal.players[4].age = 26;
        arsenal.players[4].nationality = "Ukraine";

        arsenal.players[5] = new Player();
        arsenal.players[5].name = "Kai Havertz";
        arsenal.players[5].age = 24;
        arsenal.players[5].nationality = "Germany";

        arsenal.players[6] = new Player();
        arsenal.players[6].name = "Declan Rice";
        arsenal.players[6].age = 24;
        arsenal.players[6].nationality = "England";

        arsenal.players[7] = new Player();
        arsenal.players[7].name = "Jorginho";
        arsenal.players[7].age = 31;
        arsenal.players[7].nationality = "Italy";

        arsenal.players[8] = new Player();
        arsenal.players[8].name = "Bukayo Saka";
        arsenal.players[8].age = 22;
        arsenal.players[8].nationality = "England";

        arsenal.players[9] = new Player();
        arsenal.players[9].name = "Gabriel Jesus";
        arsenal.players[9].age = 26;
        arsenal.players[9].nationality = "Brazil";

        arsenal.players[10] = new Player();
        arsenal.players[10].name = "Eddie Nketiah";
        arsenal.players[10].age = 24;
        arsenal.players[10].nationality = "England";

        return arsenal;
    }


    static Team team2() {
        Team chelsea = new Team();
        chelsea.name = "Chelsea";

        chelsea.players[0] = new Player();
        chelsea.players[0].name = "Robert Sanchez";
        chelsea.players[0].age = 26;
        chelsea.players[0].nationality = "Spain";

        chelsea.players[1] = new Player();
        chelsea.players[1].name = "Thiago Silva";
        chelsea.players[1].age = 39;
        chelsea.players[1].nationality = "Brazil";

        chelsea.players[2] = new Player();
        chelsea.players[2].name = "Ben Chilwell";
        chelsea.players[2].age = 26;
        chelsea.players[2].nationality = "England";

        chelsea.players[3] = new Player();
        chelsea.players[3].name = "Axel Disasi";
        chelsea.players[3].age = 25;
        chelsea.players[3].nationality = "France";

        chelsea.players[4] = new Player();
        chelsea.players[4].name = "Malo Gusto";
        chelsea.players[4].age = 20;
        chelsea.players[4].nationality = "France";

        chelsea.players[5] = new Player();
        chelsea.players[5].name = "Enzo Fernández";
        chelsea.players[5].age = 22;
        chelsea.players[5].nationality = "Argentina";

        chelsea.players[6] = new Player();
        chelsea.players[6].name = "Mykhailo Mudryk";
        chelsea.players[6].age = 22;
        chelsea.players[6].nationality = "Ukraine";

        chelsea.players[7] = new Player();
        chelsea.players[7].name = "Conor Gallagher";
        chelsea.players[7].age = 23;
        chelsea.players[7].nationality = "England";

        chelsea.players[8] = new Player();
        chelsea.players[8].name = "Cole Palmer";
        chelsea.players[8].age = 21;
        chelsea.players[8].nationality = "England";

        chelsea.players[9] = new Player();
        chelsea.players[9].name = "Raheem Sterling";
        chelsea.players[9].age = 28;
        chelsea.players[9].nationality = "England";

        chelsea.players[10] = new Player();
        chelsea.players[10].name = "Nicolas Jackson";
        chelsea.players[10].age = 22;
        chelsea.players[10].nationality = "England";

        return chelsea;
    }
}
