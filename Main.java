import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.input.*;

/**
 *
 * Beschreibung


 *
 * @version 1.0 vom 24.09.2024
 * @author 
 */

public class Main extends Application {
  // Anfang Attribute
  private Button b0 = new Button();
  private Button b1 = new Button();
  private Button b2 = new Button();
  private Button b3 = new Button();
  private Button b4 = new Button();
  private Button b5 = new Button();
  private Button b6 = new Button();
  private Button b7 = new Button();
  private Button b8 = new Button();
  private Button b9 = new Button();
  private Button bSubtr = new Button();
  private Button bTimes = new Button();
  private Button bDiv = new Button();
  private Button bEnter1 = new Button();
  private Button bAdd = new Button();
  static private TextArea output = new TextArea();
  private Button bComma = new Button();
  private Button bNeg = new Button();
  private Button bBrL = new Button();
  private Button bBrR = new Button();
  private Button bClear = new Button();
  private Button bDelete = new Button();

  static String CharSequence = "*/+-";
  Pane root; 
  
  
    // Ende Attribute
  public void start(Stage primaryStage) { 
    root = new Pane();
    root.setBackground(new Background(new BackgroundFill(Color.web("0xC0C0C0"), CornerRadii.EMPTY, Insets.EMPTY)));
    Scene scene = new Scene(root, 265, 362);
    // Anfang Komponenten
    
    b7.setLayoutX(32);
    b7.setLayoutY(192);
    b7.setPrefHeight(32);
    b7.setPrefWidth(40);
    b7.setText("7");
    b7.setOnAction(
    (event) -> {b7_Action(event);} 
    );
    root.getChildren().add(b7);
    b8.setLayoutX(80);
    b8.setLayoutY(192);
    b8.setPrefHeight(32);
    b8.setPrefWidth(40);
    b8.setText("8");
    b8.setOnAction(
    (event) -> {b8_Action(event);} 
    );
    root.getChildren().add(b8);
    b9.setLayoutX(128);
    b9.setLayoutY(192);
    b9.setPrefHeight(32);
    b9.setPrefWidth(40);
    b9.setText("9");
    b9.setOnAction(
    (event) -> {b9_Action(event);} 
    );
    root.getChildren().add(b9);
    b4.setLayoutX(32);
    b4.setLayoutY(232);
    b4.setPrefHeight(32);
    b4.setPrefWidth(40);
    b4.setText("4");
    b4.setOnAction(
    (event) -> {b4_Action(event);} 
    );
    root.getChildren().add(b4);
    b5.setLayoutX(80);
    b5.setLayoutY(232);
    b5.setPrefHeight(32);
    b5.setPrefWidth(40);
    b5.setText("5");
    b5.setOnAction(
    (event) -> {b5_Action(event);} 
    );
    root.getChildren().add(b5);
    b6.setLayoutX(128);
    b6.setLayoutY(232);
    b6.setPrefHeight(32);
    b6.setPrefWidth(40);
    b6.setText("6");
    b6.setOnAction(
    (event) -> {b6_Action(event);} 
    );
    root.getChildren().add(b6);
    b1.setLayoutX(32);
    b1.setLayoutY(272);
    b1.setPrefHeight(32);
    b1.setPrefWidth(40);
    b1.setText("1");
    b1.setOnAction(
    (event) -> {b1_Action(event);} 
    );
    root.getChildren().add(b1);
    b2.setLayoutX(80);
    b2.setLayoutY(272);
    b2.setPrefHeight(32);
    b2.setPrefWidth(40);
    b2.setText("2");
    b2.setOnAction(
    (event) -> {b2_Action(event);} 
    );
    root.getChildren().add(b2);
    b3.setLayoutX(128);
    b3.setLayoutY(272);
    b3.setPrefHeight(32);
    b3.setPrefWidth(40);
    b3.setText("3");
    b3.setOnAction(
    (event) -> {b3_Action(event);} 
    );
    b3.setFont(Font.font("Comic Sans", 12));
    root.getChildren().add(b3);
    bSubtr.setLayoutX(176);
    bSubtr.setLayoutY(192);
    bSubtr.setPrefHeight(32);
    bSubtr.setPrefWidth(48);
    bSubtr.setText("-");
    bSubtr.setOnAction(
    (event) -> {bSubtr_Action(event);} 
    );
    root.getChildren().add(bSubtr);
    bTimes.setLayoutX(176);
    bTimes.setLayoutY(232);
    bTimes.setPrefHeight(32);
    bTimes.setPrefWidth(48);
    bTimes.setText("x");
    bTimes.setOnAction(
    (event) -> {bTimes_Action(event);} 
    );
    root.getChildren().add(bTimes);
    bDiv.setLayoutX(176);
    bDiv.setLayoutY(272);
    bDiv.setPrefHeight(32);
    bDiv.setPrefWidth(48);
    bDiv.setText("/");
    bDiv.setOnAction(
    (event) -> {bDiv_Action(event);} 
    );
    root.getChildren().add(bDiv);
    bEnter1.setLayoutX(176);
    bEnter1.setLayoutY(312);
    bEnter1.setPrefHeight(32);
    bEnter1.setPrefWidth(48);
    bEnter1.setText("Enter");
    bEnter1.setOnAction(
    (event) -> {bEnter_Action(event);} 
    );
    root.getChildren().add(bEnter1);
    bAdd.setLayoutX(176);
    bAdd.setLayoutY(152);
    bAdd.setPrefHeight(32);
    bAdd.setPrefWidth(48);
    bAdd.setText("+");
    bAdd.setOnAction(
    (event) -> {bAdd_Action(event);} 
    );
    root.getChildren().add(bAdd);
    output.setLayoutX(32);
    output.setLayoutY(16);
    output.setPrefHeight(80);
    output.setPrefWidth(192);
    root.getChildren().add(output);
    b0.setLayoutX(32);
    b0.setLayoutY(312);
    b0.setPrefHeight(32);
    b0.setPrefWidth(40);
    b0.setText("0");
    b0.setOnAction(
    (event) -> {b0_Action(event);} 
    );
    root.getChildren().add(b0);
    bComma.setLayoutX(80);
    bComma.setLayoutY(312);
    bComma.setPrefHeight(32);
    bComma.setPrefWidth(40);
    bComma.setText(".");
    bComma.setOnAction(
    (event) -> {bComma_Action(event);} 
    );
    bComma.setFont(Font.font("Dialog", 14));
    root.getChildren().add(bComma);
    bNeg.setLayoutX(128);
    bNeg.setLayoutY(312);
    bNeg.setPrefHeight(32);
    bNeg.setPrefWidth(40);
    bNeg.setText("+/-");
    bNeg.setOnAction(
    (event) -> {bNeg_Action(event);} 
    );
    root.getChildren().add(bNeg);
    bBrL.setLayoutX(80);
    bBrL.setLayoutY(152);
    bBrL.setPrefHeight(32);
    bBrL.setPrefWidth(40);
    bBrL.setText("(");
    bBrL.setOnAction(
    (event) -> {bBrL_Action(event);} 
    );
    root.getChildren().add(bBrL);
    bBrR.setLayoutX(128);
    bBrR.setLayoutY(152);
    bBrR.setPrefHeight(32);
    bBrR.setPrefWidth(40);
    bBrR.setText(")");
    bBrR.setOnAction(
    (event) -> {bBrR_Action(event);} 
    );
    root.getChildren().add(bBrR);
    bClear.setLayoutX(176);
    bClear.setLayoutY(112);
    bClear.setPrefHeight(32);
    bClear.setPrefWidth(48);
    bClear.setText("C");
    bClear.setOnAction(
    (event) -> {bClear_Action(event);} 
    );
    root.getChildren().add(bClear);
    bDelete.setLayoutX(128);
    bDelete.setLayoutY(112);
    bDelete.setPrefHeight(32);
    bDelete.setPrefWidth(40);
    bDelete.setText("<-");
    bDelete.setOnAction(
    (event) -> {bDelete_Action(event);} 
    );
    root.getChildren().add(bDelete);
    // Ende Komponenten
    
    primaryStage.setOnCloseRequest(e -> System.exit(0));
    primaryStage.setTitle("cleangui");
    primaryStage.setScene(scene);
    primaryStage.show();
  } // end of public ASDFDFASDF
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    launch(args);
    
  } // end of main

  public String solve(String input){
    String output = "";
    if(input.contains(" ")){
      String[] inputArrays = input.split(" ");
    }else{
      throw new IllegalArgumentException("Input doesnt contain any spaces");
    }
    return "0";
  }

  public static void checkIfCanBeWritten(Character c) { //prevents illegal charsequences like 1++1
    if(output.getText().length() != 0){
      if(!CharSequence.contains(output.getText().charAt(output.getText().length() - 1) + "")) {
        output.appendText(c + "");
      }else{
        throw new IllegalArgumentException("Can't write " + c + " after " + output.getText().charAt(output.getText().length() - 1));
      }
    }else {
      throw new IndexOutOfBoundsException("Bounds is zero");   
    } 
  }
  
  public void b0_Action(Event evt) {
    output.appendText("0");
    System.out.println(output);
    checkIfCanBeWritten('0');
  } 
  
  public void b1_Action(Event evt) {
    output.appendText("1");
    checkIfCanBeWritten('1');
  }
  
  public void b2_Action(Event evt) {
    output.appendText("2");
    checkIfCanBeWritten('2');
  } 
  
  public void b3_Action(Event evt) {
    output.appendText("3");
    checkIfCanBeWritten('3');
  }
  
  public void b4_Action(Event evt) {
    output.appendText("4");
    checkIfCanBeWritten('4');
  } 
  
  public void b5_Action(Event evt) {
    output.appendText("5");
    checkIfCanBeWritten('5');
  } 
  
  public void b6_Action(Event evt) {
    output.appendText("6");
  } 
  
  public void b7_Action(Event evt) {
    output.appendText("7");
  } 

  public void b8_Action(Event evt) {
    output.appendText("8");
  } 

  public void b9_Action(Event evt) {
    output.appendText("9");
  }  

  public void bSubtr_Action(Event evt) {
    output.appendText("-");
  }

  public void bTimes_Action(Event evt) {
    checkIfCanBeWritten('*'); 
    output.appendText("*");   
  }

  public void bDiv_Action(Event evt) {
    checkIfCanBeWritten('/');
    output.appendText("/");
  }

  public void bAdd_Action(Event evt) {
    checkIfCanBeWritten('+');
    output.appendText("+");
  }

  public void bComma_Action(Event evt) {
    checkIfCanBeWritten(',');
    output.appendText(","); 
  }

  /*
  public void bNeg_Action(Event evt) {
    checkIfCanBeWritten('(-)');
    output.appendText("(-)");
  }
  */
  
  public void bBrL_Action(Event evt) {

    output.appendText("(");
  }

  public void bBrR_Action(Event evt) {

    output.appendText(")"); 
  }
  
  public void bEnter_Action(Event evt) {

    output.appendText("=");
  }

  public void bClear_Action(Event evt) {

    output.clear();
  }

  public void bDelete_Action(Event evt) {

    output.deleteText(output.getLength()-1, output.getLength());
  }
  public void Rechner(String input) {
    
    
  }
  // Ende Methoden
} // end of class cleangui
