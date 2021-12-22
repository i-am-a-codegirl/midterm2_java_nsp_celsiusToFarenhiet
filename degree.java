import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class degree extends Applet implements ActionListener
{
TextField t1=new TextField(10);
TextField t2=new TextField(10);
TextField t3=new TextField(10);
Label l1=new Label("enter temp in celsius");
Label l2=new Label("temperature in farenhiet");
Label l3=new Label("Result is:");
Button b1= new Button("Celsius to Farenhiet");
Button b2= new Button("Farenhiet to Celsius");



public void init(){

add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(b1);
add(b2);

b1.addActionListener(this);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{

if(e.getSource()==b1)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int a= (n1*9/5)+32;
t3.setText(""+a);
}

else if(e.getSource()==b2)
{
int n2=Integer.parseInt(t2.getText());
int a= (n2-32)*5/9;
t3.setText(""+a);

}
}
}
/* <applet code="degree.class" width=500 height=500 >
</applet>*/