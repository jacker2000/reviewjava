package designpattern.架构设计7大原则.MOOC.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName,String address){
        userName ="gf";
        address ="beijing";
    }
    private void updateUserInfo(String userName,String ... properties){
        userName ="gf";
//        address ="beijing";
    }
    private void updateUserName(String userName){
        userName ="gf";
    }private void updateUserAddress(String address){
        address ="beijing";
    }
    private void updateUserInfo(String userName,String address,boolean bool){

        if (bool) {
            //todo something1
        }else {
            //todo something2
        }
        userName ="gf";
        address ="beijing";
    }
}
