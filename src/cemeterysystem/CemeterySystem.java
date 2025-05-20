/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package cemeterysystem;

import cemeterysystem.Tabs.FamilyTabs;
import java.util.List;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class CemeterySystem extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cemetery System Kg Pandan");
        
        // Create tabs
        TabPane tabPane = new TabPane();
        FamilyTabs famTab = new FamilyTabs();
        
        //Create tabs for different functionalities
        Tab lotTab = createLotTab();
        Tab cemeteryTab = createCemeteryTab();
        Tab recordTab = createRecordTab();
        Tab familyTab = famTab.createFamilyTabs();
        Tab jenazahTab = createJenazahTab();
        
        //Add tabs to tab pane
        tabPane.getTabs().addAll(cemeteryTab, lotTab, recordTab, familyTab, jenazahTab);
        
        //Create scene
        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    private Tab createLotTab(){
        
        String[] lot = {"A001", "A002"};
        
        Tab tab = new Tab("Lot");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Lot ID
        Label idLabel = new Label("Lot ID");
        GridPane.setConstraints(idLabel, 0, 0);
        
        ChoiceBox idChoice = new ChoiceBox();
        idChoice.getItems().addAll(lot);
        GridPane.setConstraints(idChoice, 1, 0);
        
        //Lot availability
        Label availableLabel = new Label("Availability : ");
        GridPane.setConstraints(availableLabel, 0, 1);
        RadioButton isAvailableTrue = new RadioButton("True");
        RadioButton isAvailableFalse = new RadioButton("False");
        GridPane.setConstraints(isAvailableTrue, 1, 1);
        GridPane.setConstraints(isAvailableFalse, 1, 1);
        
        //Add all to grid
        grid.getChildren().addAll(idLabel, idChoice, availableLabel, isAvailableTrue, isAvailableFalse);
        tab.setContent(grid);
        return tab;
    }
    
    private Tab createCemeteryTab(){
        String[] lot = {"A001", "A002"};
        
        Tab tab = new Tab("Lot");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Lot ID
        Label idLabel = new Label("Lot ID");
        GridPane.setConstraints(idLabel, 0, 0);
        
        ChoiceBox idChoice = new ChoiceBox();
        idChoice.getItems().addAll(lot);
        GridPane.setConstraints(idChoice, 1, 0);
        
        //Lot availability
        Label availableLabel = new Label("Availability : ");
        GridPane.setConstraints(availableLabel, 0, 1);
        RadioButton isAvailableTrue = new RadioButton("True");
        RadioButton isAvailableFalse = new RadioButton("False");
        GridPane.setConstraints(isAvailableTrue, 1, 1);
        GridPane.setConstraints(isAvailableFalse, 1, 1);
        
        //Add all to grid
        grid.getChildren().addAll(idLabel, idChoice, availableLabel, isAvailableTrue, isAvailableFalse);
        tab.setContent(grid);
        return tab;
    }
    
    private Tab createRecordTab(){
        String[] lot = {"A001", "A002"};
        
        Tab tab = new Tab("Lot");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Lot ID
        Label idLabel = new Label("Lot ID");
        GridPane.setConstraints(idLabel, 0, 0);
        
        ChoiceBox idChoice = new ChoiceBox();
        idChoice.getItems().addAll(lot);
        GridPane.setConstraints(idChoice, 1, 0);
        
        //Lot availability
        Label availableLabel = new Label("Availability : ");
        GridPane.setConstraints(availableLabel, 0, 1);
        RadioButton isAvailableTrue = new RadioButton("True");
        RadioButton isAvailableFalse = new RadioButton("False");
        GridPane.setConstraints(isAvailableTrue, 1, 1);
        GridPane.setConstraints(isAvailableFalse, 1, 1);
        
        //Add all to grid
        grid.getChildren().addAll(idLabel, idChoice, availableLabel, isAvailableTrue, isAvailableFalse);
        tab.setContent(grid);
        return tab;
    }
    
    private Tab createFamilyTab(){
        String[] lot = {"A001", "A002"};
        
        Tab tab = new Tab("Lot");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Lot ID
        Label idLabel = new Label("Lot ID");
        GridPane.setConstraints(idLabel, 0, 0);
        
        ChoiceBox idChoice = new ChoiceBox();
        idChoice.getItems().addAll(lot);
        GridPane.setConstraints(idChoice, 1, 0);
        
        //Lot availability
        Label availableLabel = new Label("Availability : ");
        GridPane.setConstraints(availableLabel, 0, 1);
        RadioButton isAvailableTrue = new RadioButton("True");
        RadioButton isAvailableFalse = new RadioButton("False");
        GridPane.setConstraints(isAvailableTrue, 1, 1);
        GridPane.setConstraints(isAvailableFalse, 1, 1);
        
        //Add all to grid
        grid.getChildren().addAll(idLabel, idChoice, availableLabel, isAvailableTrue, isAvailableFalse);
        tab.setContent(grid);
        return tab;
    }
    
    private Tab createJenazahTab(){
        String[] lot = {"A001", "A002"};
        
        Tab tab = new Tab("Lot");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Lot ID
        Label idLabel = new Label("Lot ID");
        GridPane.setConstraints(idLabel, 0, 0);
        
        ChoiceBox idChoice = new ChoiceBox();
        idChoice.getItems().addAll(lot);
        GridPane.setConstraints(idChoice, 1, 0);
        
        //Lot availability
        Label availableLabel = new Label("Availability : ");
        GridPane.setConstraints(availableLabel, 0, 1);
        RadioButton isAvailableTrue = new RadioButton("True");
        RadioButton isAvailableFalse = new RadioButton("False");
        GridPane.setConstraints(isAvailableTrue, 1, 1);
        GridPane.setConstraints(isAvailableFalse, 1, 1);
        
        //Add all to grid
        grid.getChildren().addAll(idLabel, idChoice, availableLabel, isAvailableTrue, isAvailableFalse);
        tab.setContent(grid);
        return tab;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
