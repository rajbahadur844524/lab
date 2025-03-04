//WAP to create Registration Form.
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class GuiInterface {
    public static void main(String[] args) {
        Frame f = new Frame("Registration Form");
        f.setLayout(null);

        Label l1 = new Label("Name:");
        l1.setBounds(20, 50, 120, 30);
        TextField t1 = new TextField();
        t1.setBounds(120, 50, 150, 30);

        Label l2 = new Label("Email:");
        l2.setBounds(20, 90, 120, 30);
        TextField t2 = new TextField();
        t2.setBounds(120, 90, 150, 30);

        Label l3 = new Label("Password:");
        l3.setBounds(20, 130, 120, 30);
        TextField t3 = new TextField();
        t3.setBounds(120, 130, 150, 30);
        t3.setEchoChar('*');  

        Label l4 = new Label("Confirm Password:");
        l4.setBounds(20, 170, 120, 30);
        TextField t4 = new TextField();
        t4.setBounds(120, 170, 150, 30);
        t4.setEchoChar('*');

        Button b1 = new Button("Submit");
        b1.setBounds(120, 210, 80, 30);

        Button b2 = new Button("Reset");
        b2.setBounds(120, 210, 80, 30);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);
        f.add(t4);
        f.add(b1);
        f.add(b2);

        f.setSize(500, 300);
        f.setVisible(true);
    }
}

//WAP to create a List.
import java.awt.Frame;
import java.awt.List;
public class ListFrameAWT extends Frame 
{
    public ListFrameAWT() 
    {
        setTitle("AWT List Example");
        List programmingLanguages = new List(6);
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("PHP");
        programmingLanguages.add("Python");
        programmingLanguages.add("Java");
        programmingLanguages.add(".Net");
        add(programmingLanguages);
        setSize(400, 200);
    }

    public static void main(String[] args) 
    {
        ListFrameAWT frame = new ListFrameAWT();
        frame.setVisible(true);
    }
}


