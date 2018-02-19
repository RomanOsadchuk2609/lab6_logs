package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BooleanOperations {
    private Boolean value1;
    private Boolean value2;


    //0
    public Boolean conjunction(){
        Boolean result = null;

        if (value1!=null && value2!=null)
            result = value1 && value2;
        else if(value1!=null && value1==false)
            result = false;
        else if(value2!=null && value2==false)
            result = false;

        value1 = result;
        value2 = null;

        return result;
    }
    //1
    public Boolean disjunction(){
        Boolean result = null;
        if (value1!=null&&value2!=null)
            result = value1||value2;
        else if(value1!=null && value1==true)
            result = true;
        else if(value2!=null && value2==true)
            result = true;

        value1 = result;
        value2 = null;
        return result;
    }
    //2
    public Boolean equality(){
        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = (value1&&value2)||(!value1&&!value2);
        value1 = result;
        value2 = null;
        return result;
    }
    //3
    public Boolean exclusiveOr(){
        Boolean result =null;
        if (value1!=null&&value2!=null)
            result =  (value1||value2)&&(!value1||!value2);
        value1 = result;
        value2 = null;
        return result;
    }
    //4
    public Boolean notOr(){// |v
        //boolean result = (!value1&&!value2);
        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = !(value1||value2);
        else if((value1!=null && value1==true) || (value2!=null && value2==true))
            result =  false;
        value1 = result;
        value2 = null;
        return result;
    }
    //5
    public Boolean notAnd(){// |
        //boolean result = (!value1||!value2);
        Boolean result =null;
        if (value1!=null&&value2!=null)
            result = !(value1&&value2);
        else if((value1!=null && value1==false) || (value2!=null && value2==false))
            result =  true;
        value1 = result;
        value2 = null;
        return result;
    }
    //6
    public Boolean implication(){// value1 -> value2 імплікація
        Boolean result = null;
        if (value1!=null && value2!=null)
            result = !value1||value2;

        else if((value1!=null && value1==false)){
            result = true;
        }
        else if((value2!=null && value2==true)){
            result = true;
        }

        value1 = result;
        value2 = null;
        return result;
    }
    //7
    public Boolean converseImplication(){// value1 <- value2 обернена імплікація
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
        value1 = result;
        value2 = null;
        return result;
    }
    //8
    public Boolean notImplication(){// value1 !-> value2 заперечення імплікації
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

        value1 = result;
        value2 = null;
        return result;
    }
    //9
    public Boolean notConverseImplication(){// value1 !<- value2 заперечення оберненої імплікації
        Boolean result=null;
        if (value1!=null && value2!=null){
            result = !(value1||!value2);
        }
        else if((value2!=null && value2==false)){
            result = false;
        }
        else if((value1!=null && value1==true))
            result = false;

        value1 = result;
        value2 = null;
        return result;
    }
    //10
    public Boolean repeatTheFirstArgument(){
        value2 = null;
        return value1;
    }
    //11
    public Boolean repeatTheSecondArgument(){
        Boolean result = value2;
        value1 = result;
        value2 = null;
        return result;
    }
    //12
    public Boolean notTheFirstArgument(){
        Boolean result = null;
        if (value1 != null) {
            result=!value1;
        }
        value1 = result;
        value2 = null;
        return result;
    }
    //13
    public Boolean notTheSecondArgument(){
        Boolean result = null;
        if (value2 != null)
            result=!value2;

        value1 = result;
        value2 = null;
        return result;
    }
    //14
    public Boolean constTrue(){
        value1 = true;
        value2 = null;
        return true;
    }
    //15
    public Boolean constFalse(){

        value1 = false;
        value2 = null;
        return false;
    }

    public Boolean getValue1() {
        return value1;
    }

    public void setValue1(Boolean value1) {
        this.value1 = value1;
    }

    public Boolean getValue2() {
        return value2;
    }

    public void setValue2(Boolean value2) {
        this.value2 = value2;
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