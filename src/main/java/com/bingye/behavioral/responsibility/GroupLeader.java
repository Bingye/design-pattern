package com.bingye.behavioral.responsibility;

import lombok.NoArgsConstructor;

public class GroupLeader extends Handler {

    public GroupLeader(){
        super(0,Handler.NUM_ONE);
    }

    @Override
    protected void handLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() +"请假"+leaveRequest.getNum()+"天"+leaveRequest.getContent());
        System.out.println("小组长审批同意");
    }
}
