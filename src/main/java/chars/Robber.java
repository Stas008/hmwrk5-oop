package chars;

import java.util.List;

public class Robber extends Base{
    public Robber(List<Base> gang, int x, int y, String fraction, int fieldSize) {
        super(8, 3, 0, new int[]{2,4}, 10, 6, false, false, "Robber",fraction);
        super.gang = gang;
        super.position = new Vector2(x, y);
    }
}
