package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
//66 logs
public class BooleanOperations {
    final static Logger LOGGER = Logger.getLogger("BooleanOperations");
    private Boolean value1;
    private Boolean value2;


    //0
    public Boolean conjunction(){
        LOGGER.info("Method conjuction() was called. "+"value1 = "+getValue1()
                        +", value2 = " + getValue2());
        Boolean result = null;

        if (value1!=null && value2!=null)
            result = value1 && value2;
        else if(value1!=null && value1==false)
            result = false;
        else if(value2!=null && value2==false)
            result = false;
        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //1
    public Boolean disjunction(){
        LOGGER.info("Method disjuction() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = null;
        if (value1!=null&&value2!=null)
            result = value1||value2;
        else if(value1!=null && value1==true)
            result = true;
        else if(value2!=null && value2==true)
            result = true;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");
        return result;
    }
    //2
    public Boolean equality(){
        LOGGER.info("Method equality() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = (value1&&value2)||(!value1&&!value2);
        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");
        return result;
    }
    //3
    public Boolean exclusiveOr(){
        LOGGER.info("Method exclusiveOR() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result =null;
        if (value1!=null&&value2!=null)
            result =  (value1||value2)&&(!value1||!value2);

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");
        return result;
    }
    //4
    public Boolean notOr(){// |v
        LOGGER.info("Method notOr() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = !(value1||value2);
        else if((value1!=null && value1==true) || (value2!=null && value2==true))
            result =  false;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //5
    public Boolean notAnd(){// |
        LOGGER.info("Method notAnd() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = !(value1&&value2);
        else if((value1!=null && value1==false) || (value2!=null && value2==false))
            result =  true;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //6
    public Boolean implication(){// value1 -> value2 імплікація
        LOGGER.info("Method implication() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = null;
        if (value1!=null && value2!=null)
            result = !value1||value2;

        else if((value1!=null && value1==false)){
            result = true;
        }
        else if((value2!=null && value2==true)){
            result = true;
        }

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //7
    public Boolean converseImplication(){// value1 <- value2 обернена імплікація
        LOGGER.info("Method converseImplication() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result =null;
        if (value1!=null && value2!=null){
            result = value1||!value2;
        }
        else if((value2!=null && value2==false)){
            result = true;
        }
        else if((value1!=null && value1==true)){
            result = true;
        }

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //8
    public Boolean notImplication(){// value1 !-> value2 заперечення імплікації
        LOGGER.info("Method notImplication() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = null;
        if (value1!=null && value2!=null){
            result = !(!value1||value2);
        }
        else if((value1!=null && value1==false)){
            result = false;
        }
        else if((value2!=null && value2==true)){
            result = false;
        }

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //9
    public Boolean notConverseImplication(){// value1 !<- value2 заперечення оберненої імплікації
        LOGGER.info("Method notConverseImplication() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result=null;
        if (value1!=null && value2!=null){
            result = !(value1||!value2);
        }
        else if((value2!=null && value2==false)){
            result = false;
        }
        else if((value1!=null && value1==true))
            result = false;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //10
    public Boolean repeatTheFirstArgument(){
        LOGGER.info("Method repeatTheFirstArgument() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = value1;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //11
    public Boolean repeatTheSecondArgument(){
        LOGGER.info("Method repeatTheSecondArgument() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = value2;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //12
    public Boolean notTheFirstArgument(){
        LOGGER.info("Method notTheFirstArgument() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = null;
        if (value1 != null) {
            result=!value1;
        }

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //13
    public Boolean notTheSecondArgument(){
        LOGGER.info("Method notTheSecondArgument() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = null;
        if (value2 != null)
            result=!value2;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //14
    public Boolean constTrue(){
        LOGGER.info("Method constTrue() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = true;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }
    //15
    public Boolean constFalse(){
        LOGGER.info("Method constFalse() was called. "+"value1 = "+getValue1()
                +", value2 = " + getValue2());

        Boolean result = false;

        LOGGER.info("Result = "+result+"\n");
        value1 = result;
        LOGGER.info("Value1 = result = "+getValue1()+"\n");
        value2 = null;
        LOGGER.info("Value2 = null\n");

        return result;
    }

    public Boolean getValue1() {
        return value1;
    }

    public void setValue1(Boolean value1) {

        this.value1 = value1;
        LOGGER.info("new valu1 was setted; value1 = "+getValue1()+"\n");
    }

    public Boolean getValue2() {
        return value2;
    }

    public void setValue2(Boolean value2) {
        this.value2 = value2;
        LOGGER.info("new value2 was setted; value2 = "+getValue2()+"\n");
    }

    public Boolean getResult(int numberOfOperation) {
        switch (numberOfOperation){
            case 0: return conjunction();
            case 1: return disjunction();
            case 2: return equality();
            case 3: return exclusiveOr();
            case 4: return notOr();
            case 5: return notAnd();
            case 6: return implication();
            case 7: return converseImplication();
            case 8: return notImplication();
            case 9: return notConverseImplication();
            case 10: return repeatTheFirstArgument();
            case 11: return repeatTheSecondArgument();
            case 12: return notTheFirstArgument();
            case 13: return notTheSecondArgument();
            case 14: return constTrue();
            case 15: return constFalse();
            default: return  null;
        }
    }
}