import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainFrame extends Frame{
    public MainFrame(){
        init();
    }
    private int a = 0,labX=100,labY=100;
    private Button btn = new Button("btn");
    private Label lab = new Label("XXXXXX");
    private Timer t1;
    private Button btnmove = new Button("Move");
    private void init(){
        this.setBounds(100,100,500,500);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btn.setBounds(100,200,50,50);
        btn.setBackground(Color.cyan);
        this.add(btn);
        lab.setBounds(100,100,50,50);
        lab.setBackground(Color.RED);
        this.add(lab);
        btnmove.setBounds(200,200,50,50);
        btnmove.setBackground(Color.cyan);
        this.setLayout(null);
        this.add(btnmove);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle("^______________^");
                a++;
                lab.setText(Integer.toString(a));
            }
        });
        btnmove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });

        t1 = new Timer(300, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(labX<MainFrame.this.getWidth()) {
                    labX += 100;
                }else{
                    if(labX>MainFrame.this.getWidth()){
                        labX -=100;
                    }
                }


                lab.setLocation(labX,labY);





            }
        });



}}
