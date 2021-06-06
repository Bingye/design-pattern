package com.bingye.behavioral.responsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {

    //请假天数
    protected static final int NUM_ONE=1;
    protected static final int NUM_THREE=3;
    protected static final int NUM_SEVEN=7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;

    //声明后继者
    private Handler nextHandler;

    public Handler(int numStart,int numEnd){
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler){
         this.nextHandler = nextHandler;
    }

    protected abstract void handLeave(LeaveRequest leaveRequest);

    public final void submit(LeaveRequest request){
        this.handLeave(request);
        if(this.nextHandler!=null && request.getNum()> this.numEnd){
            this.nextHandler.submit(request);
        }else{
            System.out.println("流程完毕");
        }
    }

}
