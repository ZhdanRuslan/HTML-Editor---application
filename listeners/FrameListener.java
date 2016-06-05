package editor.listeners;

import editor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Ruslan Zhdan on 11.05.2016.
 */
public class FrameListener extends WindowAdapter
{
    private View view;

    public FrameListener(View view)
    {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        view.exit();
    }
}
