package module2_1.task1;

public class Main {
    public static void main(String[] args) {
        TelevisionViewer viewer = new TelevisionViewer(new Television(0));
        Television tv = viewer.getTV();

        viewer.wakeUp();
        for(int i=0; i<3; i++) {
            tv.incChannel();
            tv.watch();
        }
        viewer.sleep();

        while(viewer.getDay()<=10) {
            viewer.wakeUp();
            for(int i=0; i<(viewer.getDay()%2==0?4:6); i++) {
                tv.incChannel();
                tv.watch();
            }
            viewer.sleep();
        }
    }
}
