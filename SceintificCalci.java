import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyCalci extends JFrame implements ActionListener
{
    private JTextField l;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, ac,del, beq1;
    private JButton pi,perc,log,fact,abs,reci,sq,sin,cos,tan,sqroot,inverse;
    
    public MyCalci()
    {
        super("Scientific Calculator");
        
        // Text Field
        l = new JTextField(20); // Adjusted column count to make the text field broader
        l.setEditable(false);
        
        // Panel for the text field
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(l);
        
        // 0-9 buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        
        // equals button
        beq1 = new JButton("=");
        
        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("x");
        del = new JButton("DEL");
        ac = new JButton("AC");
        pi = new JButton("pi");
        perc = new JButton("%");
        log = new JButton("log");
        fact = new JButton("FACT");
        abs = new JButton("Abs");
        reci = new JButton("S<=>D");
        sq = new JButton("x^2");
        sin = new JButton("sin");
        cos = new JButton("cos");
        tan = new JButton("tan");
        sqroot = new JButton("sqroot");
        inverse = new JButton("x^-1");
        
        
        // create . button
        be = new JButton(".");
        
        // create a panel
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(6, 3));
        
        // add action listeners
        bm.addActionListener(this);
        bd.addActionListener(this);
        bs.addActionListener(this);
        ba.addActionListener(this);
        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        be.addActionListener(this);
        del.addActionListener(this);
        ac.addActionListener(this);
        beq1.addActionListener(this);
        pi.addActionListener(this);
        perc.addActionListener(this);
        log.addActionListener(this);
        fact.addActionListener(this);
        abs.addActionListener(this);
        reci.addActionListener(this);
        sq.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        sqroot.addActionListener(this);
        inverse.addActionListener(this);
        
        p.add(sqroot);
        p.add(inverse);
        p.add(sin);
        p.add(cos);
        p.add(tan);
        	
        p.add(log);
        p.add(fact);
        p.add(abs);
        p.add(reci);
        p.add(sq);
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(del);
        p.add(ac);
        
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(bd);
        
        p.add(b1);
        p.add(b2);
        p.add(b3);        
        p.add(ba);
        p.add(bs);
        
        p.add(b0);
        p.add(be);
        p.add(pi);
        p.add(perc);
        p.add(beq1);
        
        
        
        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH); // Adding text field panel to the top
        this.add(p, BorderLayout.CENTER);
        this.setSize(500, 500); // Adjusted frame size
        this.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	String command = e.getActionCommand();

        switch (command) 
        {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case ".":
                l.setText(l.getText() + command);
                break;

            case "+":
            case "-":
            case "x":
            case "/":
            case "%":
                l.setText(l.getText() + " " + command + " ");
                break;
                
            case "sin":
            case "cos":
            case "tan":
            	l.setText(command+"("+l.getText());
		break;
		
            case "=":
                try {
                    String expression = l.getText();
                    String[] tokens = expression.split("\\s+");

                    if (tokens.length != 3) 
                    {
                        throw new IllegalArgumentException("Invalid expression");
                    }

                    double operand1 = Double.parseDouble(tokens[0]);
                    String operator = tokens[1];
                    double operand2 = Double.parseDouble(tokens[2]);

                    double result = 0.0;

                    switch (operator) 
                    {
                        case "+":
                            result = operand1 + operand2;
                            break;
                            
                        case "-":
                            result = operand1 - operand2;
                            break;
                        
                        case "x":
                            result = operand1 * operand2;
                            break;
                        
                        case "/":
                            result = operand1 / operand2;
                            break;
                        
                        case "%":
                            result = operand1 % operand2;
                            break;
                            
                         case "sin":
                         	break;
                         	
                         case "cos":
                         	break;
                         	
                         case "tan":
                         	break;
                         
                        default:
                            throw new IllegalArgumentException("Invalid operator");
                    }

                    l.setText(Double.toString(result));
                } catch (NumberFormatException ex) {
                    l.setText("Invalid number format");
                } catch (IllegalArgumentException ex) {
                    l.setText("Error: " + ex.getMessage());
                }
                break;

            case "AC":
                l.setText("");
                break;

            case "DEL":
                String currentText = l.getText();
                if (!currentText.isEmpty()) 
                {
                    l.setText(currentText.substring(0, currentText.length() - 1));
                }
                break;

            case "pi":
                l.setText(l.getText() + Math.PI);
                break;

            default:
                break;
        }
    }
}

class Sample
{
    public static void main(String args[])
    {
        MyCalci sc = new MyCalci();
    }
}

