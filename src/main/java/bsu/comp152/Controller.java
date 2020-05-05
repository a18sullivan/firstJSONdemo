package bsu.comp152;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class Controller implements Initializable {
    @FXML
    private ListView<DataHandler.recipeDataType> ListControl;
    private DataHandler Model;
    public void loadData(){
        var site = "http://www.recipepuppy.com/api/?";
        var params = getQueryParameters();
        var query = site+params;
        Model = new DataHandler(query);
        var recipeList = Model.getData();
        ObservableList<DataHandler.recipeDataType> dataToShow =
                FXCollections.observableArrayList(recipeList);
        ListControl.setItems(dataToShow);
    }

