package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.logging.Logger;
//21 logs

public class Controller {
    final static Logger LOGGER = Logger.getLogger("Controller");
    private BooleanOperations operation=new BooleanOperations();
    private boolean isOperationSelected;
    private boolean isValue2Selected;
    private boolean isValue1Selected;
    private int numberOfOperation;
    @FXML
    private Button btnEquals, btn0,btn1, btnNull;

    @FXML
    private Label lbl1, lbl2;

    @FXML
    private Button btnConjunction, btnDisjunction, btnEquality, btnExclusiveOr;

    @FXML
    private Button btnImplication, btnNotImplication, btnConverseImplication;

    @FXML
    private Button btnNotConverseImplication, btnNotAnd, btnNotOr, btnConstFalse;

    @FXML
    private Button btnClean, btnConstTrue, btnRepeatFirst, btnRepeatSecond;

    @FXML
    private Button btnNotFirst, btnNotSecond;

    @FXML
    void initialize(){
        LOGGER.info("class Controller was initialized\n");
        isValue2Selected=false;
        isValue1Selected=false;
        isOperationSelected=false;
    }
    @FXML
    void onClickBtn0(ActionEvent event) {
        LOGGER.info("btn0 was clicked\n");
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
        LOGGER.info("btn1 was clicked\n");
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
        LOGGER.info("btnNull was clicked\n");
        if (!isOperationSelected) {
            operation.setValue1(null);
            lbl1.setText(operation.getValue1()+" ");
            isValue1Selected=true;
        }
        else if(isOperationSelected &&!isValue2Selected){
            operation.setValue2(null);
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
        LOGGER.info("new operation was setted\n");
    }

    @FXML
    void onClickBtnClean(ActionEvent event) {
        LOGGER.info("btnClean was clicked\n");
        lbl1.setText("");
        lbl2.setText("");
        isValue2Selected = false;
        isValue1Selected = false;
        isOperationSelected = false;
    }

    @FXML
    void onClickBtnConjunction(ActionEvent event) {
        LOGGER.info("btnConjunction was clicked\n");
        setOperation(0,btnConjunction);
    }

    @FXML
    void onClickBtnDisjunction(ActionEvent event) {
        LOGGER.info("btnDisjunction was clicked\n");
        setOperation(1,btnDisjunction);
    }

    @FXML
    void onClickBtnEquality(ActionEvent event) {
        LOGGER.info("btnEquality was clicked\n");
        setOperation(2,btnEquality);
    }

    @FXML
    void onClickBtnExclusiveOr(ActionEvent event) {
        LOGGER.info("btnExclusiveOr was clicked\n");
        setOperation(3,btnExclusiveOr);
    }

    @FXML
    void onClickBtnNotOr(ActionEvent event) {
        LOGGER.info("btnNotOr was clicked\n");
        setOperation(4,btnNotOr);
    }

    @FXML
    void onClickBtnNotAnd(ActionEvent event) {
        LOGGER.info("btnNotAnd was clicked\n");
        setOperation(5,btnNotAnd);
    }

    @FXML
    void onClickBtnImplication(ActionEvent event) {
        LOGGER.info("btnImplication was clicked\n");
        setOperation(6,btnImplication);
    }

    @FXML
    void onClickBtnConverseImplication(ActionEvent event) {
        LOGGER.info("btnConverseImplication was clicked\n");
        setOperation(7,btnConverseImplication);
    }

    @FXML
    void onClickBtnNotImplication(ActionEvent event) {
        LOGGER.info("btnImplication was clicked\n");
        setOperation(8,btnNotImplication);
    }

    @FXML
    void onClickBtnNotConverseImplication(ActionEvent event) {
        LOGGER.info("btnNotImplication was clicked\n");
        setOperation(9,btnNotConverseImplication);
    }

    @FXML
    void onClickBtnRepeatFirst(ActionEvent event) {
        LOGGER.info("btnRepeatFirst was clicked\n");
        setOperation(10,btnRepeatFirst);
    }

    @FXML
    void onClickBtnRepeatSecond(ActionEvent event) {
        LOGGER.info("btnRepeatSecond was clicked\n");
        setOperation(11,btnRepeatSecond);
    }

    @FXML
    void onClickBtnNotFirst(ActionEvent event) {
        LOGGER.info("btnNotFirst was clicked\n");
        setOperation(12,btnNotFirst);
    }

    @FXML
    void onClickBtnNotSecond(ActionEvent event) {
        LOGGER.info("btnNotSecond was clicked\n");
        setOperation(13,btnNotSecond);
    }
    @FXML
    void onClickBtnConstTrue(ActionEvent event) {
        LOGGER.info("btnConstTrue was clicked\n");
        setOperation(14,btnConstTrue);
    }

    @FXML
    void onClickBtnConstFalse(ActionEvent event) {
        LOGGER.info("btnConstFalse was clicked\n");
        setOperation(15,btnConstFalse);
    }


    @FXML
    void onClickBtnEquals(ActionEvent event) {
        LOGGER.info("btnNotEquals was clicked\n");
        if(isOperationSelected&&isValue2Selected&&isValue1Selected){
            lbl2.setText(lbl1.getText()+"=");
            operation.setValue1(operation.getResult(numberOfOperation));
            isOperationSelected=false;
            isValue2Selected=false;
            lbl1.setText(operation.getValue1()+" ");
        }

    }










}
