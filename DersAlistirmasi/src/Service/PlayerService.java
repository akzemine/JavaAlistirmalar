package Service;

import model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {
   /* private String name;
    private String surname;
    private int kitNumber;
    private String position;
    private int birthYear;
    */
    public Player createPlayer(String name, String surname, int kitNumber, String position, int birthYear){
        Player newPlayer = new Player(name, surname, kitNumber, position, birthYear);
        return  newPlayer;
    }

    public void addTeam(Player player, Team team){
        if (player.getTeamList() != null) {
            player.getTeamList().add(team);
        } else {
            List<Team> teamList = new ArrayList<>();
            teamList.add(team);
            player.setTeamList(teamList);
        }
    }

	// yeni bir oyuncu eklenecek
	// Başlangıçta en az bir takımı var.


	// Transfer oldukça takımı değişecek
}
