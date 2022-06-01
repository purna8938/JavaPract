public class LearnThis {
    private int thread;

    public LearnThis(int thread) {
        this.thread = thread;
    }
    public void myPace(){
        for(int i=1;i<=9;i++){
            System.out.println("the process"+i+"thread number"+thread);
        }
    }

}
