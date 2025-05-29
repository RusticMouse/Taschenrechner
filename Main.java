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
import java.util.*;


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
  static private TextArea textOut = new TextArea();
  private Button bComma = new Button();
  private Button bNeg = new Button();
  private Button bBrL = new Button();
  private Button bBrR = new Button();
  private Button bClear = new Button();
  private Button bDelete = new Button();

  ArrayList<String> eingang = new ArrayList<String>();
  Stack<String> POpstellen = new Stack<String>();

  String opInReihe = "*/+-"; //Die Operatoren in der richtigen Rechenreihenfolge  
  String ReiheTest = new String();
  
  String output = new String(); //kein String nutzen, sondern ArrayList<String>
  
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
    root.getChildren().add(b8); //Fehler
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
    bAdd.setText("+"); //Fehler
    bAdd.setOnAction(
    (event) -> {bAdd_Action(event);} 
    );
    root.getChildren().add(bAdd);
    textOut.setLayoutX(32);
    textOut.setLayoutY(16);
    textOut.setPrefHeight(80);
    textOut.setPrefWidth(192);
    root.getChildren().add(textOut);
    
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

    /*
    bNeg.setLayoutX(128);
    bNeg.setLayoutY(312);
    bNeg.setPrefHeight(32);
    bNeg.setPrefWidth(40);
    bNeg.setText("+/-");
    bNeg.setOnAction(
    (event) -> {bNeg_Action(event);} 
    );  
    root.getChildren().add(bNeg);
    */
    
    bBrL.setLayoutX(80); //Fehler
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
    (event) -> {bDelete_Action(event);} //Fehler
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

  public static int rang(char c){
    switch(c){
      case '+':
        return 1;
      case '-':
        return 1;
      case '*':
        return 2;
      case '/':
        return 2;
      default: 
        return 0;
    }
      
  }
  
  public String infixToPostfix(String input){ //hier kein String nutzten, vlt. ArrayList<String>

    //evaluator hier implementieren:

    String initialInput = input;
    String postfix = new String();
    char c;
    int schritteBisKlammer = 0;
    
    for(int i = 0; i < input.length(); i++){
      c = input.charAt(i);
      if (c == '+' || c == '-' || c == '*' || c == '/'){ 
        System.out.println("Operator vorhanden");
        if((POpstellen.isEmpty())){
          POpstellen.push(c + "");//<-- Stack für Operatoren
          System.out.println("Stack ist leer, daher " + c + " gepusht");
          //If the precedence of the current scanned operator is higher than the precedence of the operator on top of the stack, push
        } else if((POpstellen.peek() == "(") || (rang(c) > rang(POpstellen.peek().charAt(0)))){
          POpstellen.push(c + "");
          System.out.println("c = " + c + " kann gepusht werden -> " + POpstellen);
        }else{ 
          System.out.println("POpstellen (pre):" + POpstellen);
          while(!POpstellen.isEmpty() && rang(c) < rang(POpstellen.peek().charAt(0))){
            postfix = postfix + POpstellen.pop(); 
            System.out.println("Higher or equal Precedence gepoppt");
          }
          POpstellen.push(c + "");
          System.out.println("Pushstellen (post):" + POpstellen); //gibt aus was nachdem wir den neuen Operator gepusht haben
        }

      }else if(c == '(' || c == ')'){ //nicht Operator -> Zahl oder Klammern
        System.out.println("Klammer vorhanden");
        if(c  == '('){
          POpstellen.push(c + ""); //höchste precedence, kann sicher gepoppt werden
          System.out.println("Offene Klammer gepusht");
        }else{ 
          schritteBisKlammer = POpstellen.size() - POpstellen.lastIndexOf("(");
          System.out.println("Schritte bis Klammer: " + schritteBisKlammer);
          for(int j = 0; j < schritteBisKlammer + 1; j++){
            System.out.println(j + " POpstellen: " + POpstellen);
            if(!POpstellen.isEmpty()){
              if(POpstellen.peek() != "("){
                postfix = postfix + POpstellen.pop();
                System.out.println("Ops zwischen Klammern gepoppt");
              }else{
                //sollte offene Klammer poppen, funktioniert aber nicht wie gewollt
                System.out.println("eigentlich offene Klammer gepoppt, tatsächlich: " + POpstellen.pop());      
              }
            }else{
              System.out.println("Empty!");
            }
            
          System.out.println("Pushstellen nach Klammerüberprüfung: " + POpstellen);
          System.out.println("Postfix: " + postfix);
          }
          if(postfix.charAt(postfix.length() - 1) == '('){ //löscht offene Klammer, falls vorhanden (nicht clean)
            postfix = postfix.substring(0, postfix.length() - 1);
            System.out.println("Offene Klammer gelöscht");
          }
        }
        }else{ //nicht Operator und nicht Klammer -> Zahl
        System.out.println("Zahl vorhanden");
        postfix = postfix + c;
        System.out.println("Input:" + postfix);
          
      }
    
    }
    while(!POpstellen.isEmpty()){
      postfix = postfix + POpstellen.pop(); //Poppt alle Operatoren aus dem Stack
    }

    System.out.println("initialInput:" + initialInput);
    System.out.println("Letztes Postfix:" + postfix);
    
    if(postfix.length() < 3){
      System.out.println("Error! Your Expression is missing something! returned 0");
      return "0";
    } else {
      return postfix;
    }
  }


  //löst einen postfix ausdruck, die ersten beiden Elemente müssen Zahlen sein (ist aber bei postfix eigentlich garantiert)
  public static String solvePostfix(String postfix){
    Stack<String> stack = new Stack<>();
    for (int i = 0; i < postfix.length(); i++) {
      char c = postfix.charAt(i);
      if(Character.isDigit(c)) {
        stack.push(c + "");
      } else if(c == '+' || c == '-' || c == '*' || c == '/') {
        double operand2 = Double.parseDouble(stack.pop());
        double operand1 = Double.parseDouble(stack.pop());
        double result = performOperation(operand1, operand2, c);
        stack.push(String.valueOf(result));
      }
    }
    return stack.pop();
  }
  

  //prevents illegal charsequences like 1++1 and automatiallly writes it if allowed
  public void checkIfCanBeWritten(Character c) { 
    if(textOut.getLength() != 0){
      if(!CharSequence.contains(String.valueOf(output.charAt(output.length() - 1)))) {
        if(c == ')' && countOccs(output, '(', 0) <= countOccs(output, ')', 0)){ //prevents output = ()))
          System.out.println("Error! Can't close bracket, because there is no open bracket!");
        }else{
          textOut.appendText(c + "");
          output = output + c;
        }
      }else{
        System.out.println("Error! Can't write " + c + " after " + output.charAt(output.length() - 1));
        //throw new IllegalArgumentException("Can't write " + c + " after " + output.charAt(output.length() - 1));
      }
    }else {
      System.out.println("Error! Keine Zahl vor dem Operator vorhanden!"); 
        
    } 
  }


  
  //aus dem internet, zählt Vorkommen
  private static int countOccs(String stringPar, char searchedChar, int index) { 
      if (index >= stringPar.length()) {
          return 0;
      }
      int count = stringPar.charAt(index) == searchedChar ? 1 : 0;
      return count + countOccs(
        stringPar, searchedChar, index + 1);
  }


  //performs a single operation
  public static double performOperation(double operand1, double operand2, char operator) {
    switch (operator) {
      case '+':
        return operand1 + operand2;
      case '-':
        return operand1 - operand2;
      case '*':
        return operand1 * operand2;
      case '/':
        if (operand2 == 0) {
          throw new ArithmeticException("Division by zero");
        }
        return operand1 / operand2;
    }
    throw new IllegalArgumentException("Invalid operator: " + operator);
  }


  
  //Prints inputs and only checks if it's a special character, that isn't allowed to be written twice or at the beginning and prevents it
  //Use either output.appendText() or checkIfCanBeWritten() but not both
    
  public void b0_Action(Event evt) {   
    textOut.appendText("0");
    output = output + "0";
  } 
  
  public void b1_Action(Event evt) {
    textOut.appendText("1");
    output = output + "1";
  }
  
  public void b2_Action(Event evt) {
    textOut.appendText("2");
    output = output + "2";
  } 
  
  public void b3_Action(Event evt) {
    textOut.appendText("3");
    output = output + "3";
  }
  
  public void b4_Action(Event evt) {
    textOut.appendText("4");
    output = output + "4";
  } 
  
  public void b5_Action(Event evt) {
    textOut.appendText("5");
    output = output + "5";
    
  } 
  
  public void b6_Action(Event evt) {
    textOut.appendText("6");
    output = output + "6";
    
  } 
  
  public void b7_Action(Event evt) {
    textOut.appendText("7");
    output = output + "7";
  } 

  public void b8_Action(Event evt) {
    textOut.appendText("8");
    output = output + "8";
  } 

  public void b9_Action(Event evt) {
    textOut.appendText("9");
    output = output + "9";
  }  

  public void bSubtr_Action(Event evt) {
    checkIfCanBeWritten('-');
    
  }

  public void bTimes_Action(Event evt) {
    checkIfCanBeWritten('*');  
    
  }

  public void bDiv_Action(Event evt) {
    checkIfCanBeWritten('/');
    
  }

  public void bAdd_Action(Event evt) {
    checkIfCanBeWritten('+');
    
  }

  public void bComma_Action(Event evt) {
    checkIfCanBeWritten(','); 
  }

  /*
  public void bNeg_Action(Event evt) {
    checkIfCanBeWritten('(-)');
  }
  */
  
  public void bBrL_Action(Event evt) {
    textOut.appendText("(");
    output = output + "(";
  }

  public void bBrR_Action(Event evt) {
    checkIfCanBeWritten(')');
    //verhindert output = )
    //nicht aber output = ())
  }
  
  public void bEnter_Action(Event evt) {
    //add infixToPostfix function
    String solution = infixToPostfix(output);//hier kein String inputen, sondern ArrayList<String>
    System.out.println("Solution = " + solution);
    textOut.clear();
    output = "";
    System.out.println("PopStellen = " + POpstellen);
    
  }

  public void bClear_Action(Event evt) {

    output = "";
    textOut.clear();
    POpstellen.clear();
    
    
  }

  public void bDelete_Action(Event evt) {
    //add liste löschen, je nach zahl oder operator
    if (output.length() > 0 && textOut.getLength() > 0) {
      output = output.substring(0, output.length() - 1);
      textOut.deleteText(textOut.getLength()-1, textOut.getLength());
    }
  }
  public void Rechner(String input) {
    
    
  }
  // Ende Methoden
} // end of class cleangui
