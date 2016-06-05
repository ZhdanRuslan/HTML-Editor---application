package editor.actions;

import editor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Ruslan Zhdan on 12.05.2016.
 */
public class UndoAction extends AbstractAction
{
    private View view;

    public UndoAction(View view)
    {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        view.undo();
    }
}
