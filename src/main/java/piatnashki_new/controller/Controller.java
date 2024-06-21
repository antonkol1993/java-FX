package piatnashki_new.controller;

/*public class Controller {

    // private Service singletonService;
    private final GameBoardService gameBoardService = GameBoardService.getInstance();

    private static final String REFRESH = "GAME 15 ||Refresh: ";
    private final Stage stage;

    private MainMenuModel mainMenuModel;
    private final MainMenuView mainMenuView;
    private final NewGameBoardView gameBoardView;
    private int count = 1;

    private GameBoard currentBoard;

    public Controller(Stage stage) {
        this.stage = stage;
        OldModel oldModel = prepareModel();
        this.mainMenuView = new MainMenuView(mainMenuModel);
        this.gameBoardView = new NewGameBoardView(oldModel);
        currentBoard = gameBoardService.newGame(5, 5);

    }

    private OldModel prepareModel() {
        OldModel oldModel = new OldModel();

        Label label = new Label();
        label.setText(REFRESH);

        mainMenuModel = MainMenuModel.builder()
                .withOnNewGameAction(event -> new GameController(stage).show())
                .withOnExitAction(event -> Platform.exit())
                .build();

//        model.setOnRefreshAction(event -> {
//            model.setLabelText(REFRESH + count++);
//            mainMenuView.refresh();
//        });
        oldModel.setOnExitAction(event -> Platform.exit());
        oldModel.setOnNewGameAction(event -> {
            show(gameBoardView.getScene(currentBoard));
        });

        oldModel.setOnMoveActionProvider(value -> e -> {
            gameBoardService.move(currentBoard, value);
            show(gameBoardView.getScene(currentBoard));
        });

        return oldModel;
    }

    private void gameBoardsSettings() {
        stage.setHeight(600);
        stage.setWidth(600);
    }

    public void showMainMenu() {
        gameBoardsSettings();
        stage.setScene(mainMenuView.getMainMenu());
        stage.show();
    }


    private void show(Scene scene) {
        stage.setHeight(600);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }
}
*/