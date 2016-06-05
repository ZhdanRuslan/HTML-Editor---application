package editor.listeners;

import editor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;

/**
 * Created by Ruslan Zhdan on 12.05.2016.
 */
public class TextEditMenuListener implements MenuListener
{
    private View view;

    public TextEditMenuListener(View view)
    {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e)
    {
        JMenu jMenu = (JMenu) e.getSource();
        Component[] components = jMenu.getMenuComponents();
        for (Component component : components)
        {
            component.setEnabled(view.isHtmlTabSelected());
        }
    }

    @Override
    public void menuDeselected(MenuEvent e)
    {
        /*NOP*/
    }

    @Override
    public void menuCanceled(MenuEvent e)
    {
        /*NOP*/
    }
}
