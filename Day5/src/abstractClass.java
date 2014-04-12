/**
 * Created by Administrator on 14-4-12.
 */
public abstract class abstractClass {
    public abstract void cycle_Draw();
    public void cycle_draw(){
        float x = 14;
        float y = 8;
        float r = 5;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                float result = (i - x) * (i - x) + (j - y) * (j - y) - r * r; // 圆心公式
                if (result < 5 && result > -5) { // 5 为精度范围
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
