package com.bingye.behavioral.responsibility;

public class BossLeader extends Handler {

    public BossLeader(){
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }

    @Override
    protected void handLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() +"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent());
        System.out.println("总经理审批同意");
    }
}
