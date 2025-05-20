/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cemeterysystem.Tabs;

import cemeterysystem.Class.Family;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author User
 */
public class FamilyTabs {
    
    
    public Tab createFamilyTabs(){
        //Create Family Tab
        Tab tab = new Tab("Family");
        
        //Grid
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(8);
        grid.setHgap(10);
        
        //Family Titile
        Label titleTab = new Label("Family Details");
        titleTab.setStyle("-fx-background-color: #333333; "
                + "-fx-text-fill: white; "
                + "-fx-font-weight: bold;" 
                + "-fx-text-alignment: center"
                + "-fx-padding: 5 10 5 10"
                + "-fx-border-width: 1px"
                + "-fx-border-radius: 3px"
        );
//        GridPane.setConstraints(titleTab, 0, 0, 2, 1);

        
        //Name
        Label nameLabel = new Label("Name : ");
        GridPane.setConstraints(nameLabel, 0, 1);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 1);
        
        //Relation
        Label relationLabel = new Label("Relationship : ");
        GridPane.setConstraints(relationLabel, 0, 2);
        TextField relationInput = new TextField();
        GridPane.setConstraints(relationInput, 1, 2);
        
        //Contact
        Label contactLabel = new Label("Contact : ");
        GridPane.setConstraints(contactLabel, 0, 3);
        TextField contactInput = new TextField();
        GridPane.setConstraints(contactInput, 1, 3);
        
        //Output area
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false);
        outputArea.setPrefHeight(200);
        GridPane.setConstraints(outputArea, 1, 4);
        
        //Submit Button
        Button submitBtn = new Button("Submit");
        GridPane.setConstraints(submitBtn, 0, 5, 2, 1);
        
        //Submit Button Action
        submitBtn.setOnAction(e -> {
            String name = nameInput.getText();
            String relation = relationInput.getText(); 
            String contact = contactInput.getText();
            
            Family family = new Family(name, relation, contact);
            outputArea.setText(family.toString());
            
        });
        

        //Add all to grid
        grid.getChildren().addAll(
                titleTab, 
                nameLabel, 
                nameInput, 
                relationLabel, 
                relationInput, 
                contactLabel, 
                contactInput, 
                outputArea,
                submitBtn);
        
        //Set Tab
        tab.setContent(grid);

        return tab;
    }
    
    
    
    
}
