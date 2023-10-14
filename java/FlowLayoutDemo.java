import java.awt.*;
import java.applet.*;
/*<applet code="FlowLayoutDemo" width=250 height=300>
</applet>*/
public class FlowLayoutDemo extends Applet
{
    public void init()
    {
        for(int i=1;i<12;i++)
        {
            add(new Button("toys"+i));
        }
    }
}
