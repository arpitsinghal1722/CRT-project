
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class test1 {
    

public static void main(String[]args) {
JFrame f=new JFrame();
JLabel nameLabel=new JLabel("Name: ");
nameLabel.setBounds(100,50,100,30);
f.add(nameLabel);
JTextField nameField=new JTextField();
nameField.setBounds(230,50, 200,30);
f.add(nameField);

JLabel addressLabel=new JLabel("address: ");
addressLabel.setBounds(100,100,100,30);
f.add(addressLabel);
JTextField addressField=new JTextField();
addressField.setBounds(230,100,200,100);
f.add(addressField);

JLabel genderLabel=new JLabel("gender: ");
genderLabel.setBounds(100,210,100,30);
f.add(genderLabel);
JRadioButton male=new JRadioButton("male");
male.setBounds(230,210,100,30);
f.add(male);
JRadioButton female=new JRadioButton("female");
female.setBounds(330,210,100,30);
f.add(female);
ButtonGroup group = new ButtonGroup();
group.add(male);
group.add(female);

JLabel hobbiesLabel=new JLabel("hobbies: ");
hobbiesLabel.setBounds(100,250,100,30);
f.add(hobbiesLabel);
JCheckBox football=new JCheckBox("football");
football.setBounds(230,250,100,30);
f.add(football);
JCheckBox cricket=new JCheckBox("cricket");
cricket.setBounds(330,250,100,30);
f.add(cricket);

JLabel cityLabel=new JLabel("city: ");
cityLabel.setBounds(100,300,100,30);
f.add(cityLabel);
String str[]=new String[]{
    "Jaipur",
    "Jodhpur",
    "Hisar",
    "goa",
    "dehradun",
    "himachal pradesh", 
    "j&k",
    "shimla"
};
JComboBox cityItem=new JComboBox(str);
cityItem.setBounds(230,300, 100,30);
f.add(cityItem);

JButton submit = new JButton("submit");
submit.setBounds(150,370,100,25);
f.add(submit);

f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
}
}