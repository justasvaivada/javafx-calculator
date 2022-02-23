package com.justasvaivada.calculatorjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
//    Link label to variable "result"
    @FXML
    private Label result;

    private double numberOne = 0;
    private String operator = "";
    private boolean check = true;

//    Calculate result based on operator
    public double calculateResult (double numberOne, double numberTwo, String operator) {
        return switch (operator) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "x" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> 0.0;
        };
    }

//    set label text to number
    public void number (String number) {
        result.setText(result.getText() + number);
    }


//    resets label and sets value to button value
    public void setLabel (ActionEvent event) {
        if (this.check) {
            result.setText("");
            check = false;
        }
        Button button = (Button)event.getSource();
        String value = button.getText();
        number(value);
    }

//    clears label and sets text to "0"
    public void clearLabel (ActionEvent event) {
        Button button = (Button) event.getSource();
        String value = button.getText();
        if (value.equals("Clear")){
            result.setText("0");
        }
    }

//    Calculates the value of numbers and outputs result to label if "Ans" button is clicked.
    public void operatorCalc (ActionEvent event) {
        Button button = (Button)event.getSource();
        String value = button.getText();
        if (!value.equals("Ans")) {
            if (!operator.isEmpty()) {return;}
            operator = value;
           numberOne = Double.parseDouble(result.getText());
           result.setText("");
        }else {
            if (operator.isEmpty()){return;}
            double numberTwo = Double.parseDouble(result.getText());
            double total = calculateResult(numberOne, numberTwo, operator);
            result.setText(String.valueOf(total));
            operator = "";
            check = true;
        }
    }

    }
