package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {
    private BooleanOperations operation=new BooleanOperations();
    private boolean isOperationSelected;
    private boolean isValue2Selected;
    private boolean isValue1Selected;
    private int numberOfOperation;
    @FXML
    private Button btnEquals;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btnNull;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Button btnConjunction;

    @FXML
    private Button btnDisjunction;

    @FXML
    private Button btnEquality;

    @FXML
    private Button btnExclusiveOr;

    @FXML
    private Button btnImplication;

    @FXML
    private Button btnNotImplication;

    @FXML
    private Button btnConverseImplication;

    @FXML
    private Button btnNotConverseImplication;

    @FXML
    private Button btnNotAnd;

    @FXML
    private Button btnNotOr;

    @FXML
    private Button btnConstFalse;

    @FXML
    private Button btnClean;

    @FXML
    private Button btnConstTrue;

    @FXML
    private Button btnRepeatFirst;

    @FXML
    private Button btnRepeatSecond;

    @FXML
    private Button btnNotFirst;

    @FXML
    private Button btnNotSecond;

    @FXML
    void initialize(){

        isValue2Selected=false;
        isValue1Selected=false;
        isOperationSelected=false;
    }
    @FXML
    void onClickBtn0(ActionEvent event) {
        if (!isOperationSelected) {
            operation.setValue1(false);
            lbl1.setText("false ");
            isValue1Selected=true;
        }
        else if(isOperationSelected &&!isValue2Selected){
            operation.setValue2(false);
            lbl1.setText(lbl1.getText()+"false ");
            isValue2Selected=true;
        }
    }

    @FXML
    void onClickBtn1(ActionEvent event) {
        if (!isOperationSelected) {
            operation.setValue1(true);
            lbl1.setText("true ");
            isValue1Selected=true;
        }
        else if(isOperationSelected &&!isValue2Selected){
            operation.setValue2(true);
            lbl1.setText(lbl1.getText()+"true ");
            isValue2Selected=true;
        }
    }

    @FXML
    void onClickBtnNull(ActionEvent event) {
        if (!isOperationSelected) {
            operation.setValue1(null);
            //lbl1.setText("null ");
            lbl1.setText(operation.getValue1()+" ");
            isValue1Selected=true;
        }
        else if(isOperationSelected &&!isValue2Selected){
            operation.setValue2(null);
            //lbl1.setText(lbl1.getText()+"null ");
            lbl1.setText(lbl1.getText()+operation.getValue2()+" ");
            isValue2Selected=true;
        }
    }

    private void setOperation(int numberOfOperation, Button btn){
        if (!isOperationSelected && isValue1Selected && !isValue2Selected){
            lbl1.setText(lbl1.getText()+btn.getText()+" ");
            this.numberOfOperation = numberOfOperation;
            isOperationSelected = true;
        }
        else if(isOperationSelected && isValue1Selected && !isValue2Selected){
            this.numberOfOperation = numberOfOperation;
            lbl1.setText(operation.getValue1()+" "+btn.getText()+" ");
        }
    }

    @FXML
    void onClickBtnClean(ActionEvent event) {
        lbl1.setText("");
        lbl2.setText("");
        isValue2Selected = false;
        isValue1Selected = false;
        isOperationSelected = false;
    }

    @FXML
    void onClickBtnConjunction(ActionEvent event) {

        setOperation(0,btnConjunction);
    }

    @FXML
    void onClickBtnDisjunction(ActionEvent event) {

        setOperation(1,btnDisjunction);
    }

    @FXML
    void onClickBtnEquality(ActionEvent event) {

        setOperation(2,btnEquality);
    }

    @FXML
    void onClickBtnExclusiveOr(ActionEvent event) {

        setOperation(3,btnExclusiveOr);
    }

    @FXML
    void onClickBtnNotOr(ActionEvent event) {

        setOperation(4,btnNotOr);
    }

    @FXML
    void onClickBtnNotAnd(ActionEvent event) {

        setOperation(5,btnNotAnd);
    }

    @FXML
    void onClickBtnImplication(ActionEvent event) {

        setOperation(6,btnImplication);
    }

    @FXML
    void onClickBtnConverseImplication(ActionEvent event) {

        setOperation(7,btnConverseImplication);
    }

    @FXML
    void onClickBtnNotImplication(ActionEvent event) {

        setOperation(8,btnNotImplication);
    }

    @FXML
    void onClickBtnNotConverseImplication(ActionEvent event) {

        setOperation(9,btnNotConverseImplication);
    }

    @FXML
    void onClickBtnRepeatFirst(ActionEvent event) {

        setOperation(10,btnRepeatFirst);
    }

    @FXML
    void onClickBtnRepeatSecond(ActionEvent event) {

        setOperation(11,btnRepeatSecond);
    }

    @FXML
    void onClickBtnNotFirst(ActionEvent event) {

        setOperation(12,btnNotFirst);
    }

    @FXML
    void onClickBtnNotSecond(ActionEvent event) {

        setOperation(13,btnNotSecond);
    }
    @FXML
    void onClickBtnConstTrue(ActionEvent event) {

        setOperation(14,btnConstTrue);
    }

    @FXML
    void onClickBtnConstFalse(ActionEvent event) {

        setOperation(15,btnConstFalse);
    }


    @FXML
    void onClickBtnEquals(ActionEvent event) {
        if(isOperationSelected&&isValue2Selected&&isValue1Selected){
            lbl2.setText(lbl1.getText()+"=");
            operation.setValue1(operation.getResult(numberOfOperation));
            isOperationSelected=false;
            isValue2Selected=false;
            lbl1.setText(operation.getValue1()+" ");
        }

    }










}
