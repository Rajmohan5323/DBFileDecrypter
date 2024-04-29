
package com.raj.db;

import java.io.IOException;
import javax.swing.JTextArea;
import java.io.OutputStream;

public class DisplayMessage extends OutputStream
{
    private JTextArea textArea;
    
    public DisplayMessage(JTextArea textArea) {
        this.textArea = textArea;
    }
    
    @Override
    public void write(int b) throws IOException {
        this.textArea.append(String.valueOf((char)b));
    }
}
