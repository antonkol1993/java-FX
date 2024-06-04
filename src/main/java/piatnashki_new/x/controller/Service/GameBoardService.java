package piatnashki_new.x.controller.Service;

public class GameBoardService {
    private static GameBoardService instance;

    private GameBoardService() {
    }

    public static GameBoardService getInstance () {
        if (instance == null) {
            instance = new GameBoardService();
        }
        return instance;
    }
}
