package captainCiaoCiao.CaptainCiaoCiao.chapter2.src.exercises;

public class Lines {

    public void line(int len, char c) {
        for(int i = 0; i < len; i++){
            System.out.print(c);
        }
        System.out.println();
    }

    public void line(int len) {
        line(len, '-');
        System.out.println();
    }

    public void line(String prefix, int len, char c, String suffix) {
        System.out.print(prefix);
       line(len, c);
        System.out.println(suffix);
    }
}
