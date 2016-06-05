package editor.listeners;

import editor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * Created by Ruslan Zhdan on 12.05.2016.
 */
public class UndoMenuListener implements MenuListener
{
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem)
    {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent e)
    {
        if (view.canUndo())
        {
            undoMenuItem.setEnabled(true);
        } else if (!view.canUndo())
        {
            undoMenuItem.setEnabled(false);
        }
        if (view.canRedo())
        {
            redoMenuItem.setEnabled(true);
        } else if (!view.canRedo())
        {
            redoMenuItem.setEnabled(false);
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
