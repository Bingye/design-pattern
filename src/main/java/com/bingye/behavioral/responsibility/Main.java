package com.bingye.behavioral.responsibility;

public class Main {

    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明",1,"生病");

        GroupLeader groupLeader = new GroupLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        BossLeader bossLeader = new BossLeader();

        groupLeader.setNextHandler(managerLeader);
        managerLeader.setNextHandler(bossLeader);

        groupLeader.submit(leaveRequest);

    }

}
