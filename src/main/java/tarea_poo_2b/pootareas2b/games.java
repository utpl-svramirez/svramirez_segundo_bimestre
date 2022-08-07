package tarea_poo_2b.pootareas2b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author svramirez
 */
public class games {
    private String gameId;
    private String gameName;
    private Integer gameTop;

    //constructor
    public games(String gameId, String gameName, Integer gameLevels) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameTop = gameTop;
    }
//constructor
    public games() {
    }
    
    public String getGameId() {
        return gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public Integer getGameTop() {
        return gameTop;
    } 

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameTop(Integer gameTop) {
        this.gameTop = gameTop;
    }
    
    
    
}
