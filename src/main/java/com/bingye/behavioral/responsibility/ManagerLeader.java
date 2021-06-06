package com.bingye.behavioral.responsibility;

public class ManagerLeader extends Handler {

    public ManagerLeader(){
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    @Override
    protected void handLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() +"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent());
        System.out.println("经理审批同意");
    }
}
