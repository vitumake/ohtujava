package module2_1.task1;

public class Television {
    private int channel;

    public Television(int chnl) {
        this.setChannel(chnl);
    }

    public void setChannel(int chnl) {
        this.channel = chnl;
    }

    public void incChannel() {
        this.channel++;
        if(this.channel > 10) this.channel = this.channel - 10;
    }

    public void watch() {
        System.out.println("Watching channel " + this.channel);
    }
}
