package hu.sfm.controller;

import hu.sfm.main.Main;
import javafx.fxml.FXML;

import java.io.IOException;

public class BuymenuController3 {

    @FXML
    private void onActionBack() throws IOException {
        Main.actualPane.getChildren().remove(0);
        Main.actualPane.getChildren().add(Main.mainBuyMenuPane);
    }
}