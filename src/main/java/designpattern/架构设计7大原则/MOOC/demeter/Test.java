package designpattern.架构设计7大原则.MOOC.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss =new Boss();
        TeamLeader teamLeader =new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
