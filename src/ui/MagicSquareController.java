package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import model.MagicSquare;

public class MagicSquareController {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField order1;

    @FXML
    private ComboBox<String> centralBox;

    @FXML
    private ComboBox<String> sense;

    @FXML
    private Button bottonCreate;

    @FXML
    public void initialize() {
    	centralBox.getItems().addAll("Right","Left","Above","Down");
    	sense.getItems().addAll("NO","NE","SO","SE");
    }
    @FXML
    public void createBox(ActionEvent event) {
    	int order = Integer.parseInt(order1.getText());
    	System.out.println(""+centralBox.getValue());
    	int central1 = 0;
    	
    	if(centralBox.getValue() == "Right") 
    		central1 = 1;
    	else if(centralBox.getValue() == "Left") 
    		central1 = 2;
    	else if(centralBox.getValue() == "Above") 
    		central1 = 3;
    	else 
    		central1 = 4;
    	
    	int sense1 = 0;
    	if(sense.getValue() == "NO")
    		sense1 =1;
    	else if(sense.getValue() == "NE")
    		sense1 =2;
    	else if(sense.getValue() == "SO")
    		sense1 =3;
    	else 
    		sense1 =4;
    	
    	MagicSquare magicSquare = new MagicSquare(order,sense1,central1);
    	magicSquare.fillBox(order, sense1, central1);
    	GridPane gridPane = new GridPane();
    	borderPane.setCenter(gridPane);
    	
    	for(int i = 0; i<order; i++) {
    		for(int j = 0; j<order; j++) {
    			gridPane.add(new Label("         "+magicSquare.getValue(i, j)+"        "),j,i);
    		}
    	}
    }

}
