import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

enum FileMenu{
    New,
    Open,
    Save,
    SaveAs,
    Exit
};

public class Main extends Application{
    public static void main(String[] args) {
        launch();
    }
    public void start(Stage stage) throws Exception {
        
        //Menu
        EnumMenu fileMenu = new EnumMenu(FileMenu.class,"File");
        MenuBar menuBar = new MenuBar(fileMenu.getMenu());
        
        
        //set Event
        fileMenu.getMenuItems()[FileMenu.New.ordinal() ].setOnAction(this::onClickSave);
        fileMenu.getMenuItems()[FileMenu.Open.ordinal()].setOnAction(this::onClickSave);
        fileMenu.getMenuItems()[FileMenu.Save.ordinal()].setOnAction(this::onClickSave);
        fileMenu.getMenuItems()[FileMenu.SaveAs.ordinal()].setOnAction(this::onClickSave);
        fileMenu.getMenuItems()[FileMenu.Exit.ordinal()].setOnAction(this::onClickSave);
        
        
        //BorderPain
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(new TextArea());
        borderPane.setBottom(new Label("Read only"));

        
        stage.setScene(new Scene(borderPane));
        stage.show();
    }
    

    //Event Action
    public void onClickNew(ActionEvent event){
        
    }

    public void onClickOpen(ActionEvent event){
        
    }
    
    public void onClickSave(ActionEvent event){
        
    }
    
    public void onClickSaveAs(ActionEvent event){
        
    }
    
    public void onClickExit(ActionEvent event){
        
    }

}