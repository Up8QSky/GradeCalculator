import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import javax.swing.JComboBox;


public class ExamCalc
{
	private static JFrame frame;
	private JTextField T1GradeTF;
	private JTextField T2GradeTF;
	private JTextField S1ExamTF;
	private JTextField S2ExamTF;
	private JTextField T4GradeTF;
	private JTextField T3GradeTF;
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ExamCalc window = new ExamCalc();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}
	public ExamCalc() 
	{
		initialize();
	}
	public void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 300);
		frame.setTitle("Grade Calculator V1.1.1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		final JLabel ErrorLB = new JLabel("");
		ErrorLB.setBounds(10, 226, 357, 14);
		frame.getContentPane().add(ErrorLB);
		
		JLabel T1GradeLB = new JLabel("T1 Grade:");
		T1GradeLB.setBounds(10, 40, 56, 14);
		frame.getContentPane().add(T1GradeLB);
		
		T1GradeTF = new JTextField();
		T1GradeTF.setBounds(71, 37, 46, 20);
		frame.getContentPane().add(T1GradeTF);
		T1GradeTF.setColumns(10);
		
		JLabel T2GradeLB = new JLabel("T2 Grade:");
		T2GradeLB.setBounds(117, 40, 56, 14);
		frame.getContentPane().add(T2GradeLB);
		
		T2GradeTF = new JTextField();
		T2GradeTF.setBounds(179, 37, 46, 20);
		frame.getContentPane().add(T2GradeTF);
		T2GradeTF.setColumns(10);
		
		JLabel S1ExamLB = new JLabel("S1 Exam:");
		S1ExamLB.setBounds(225, 40, 56, 14);
		frame.getContentPane().add(S1ExamLB);
		
		S1ExamTF = new JTextField();
		S1ExamTF.setBounds(281, 37, 86, 20);
		frame.getContentPane().add(S1ExamTF);
		S1ExamTF.setColumns(10);
		
		JLabel S1GradeLB = new JLabel("S1 Grade:");
		S1GradeLB.setBounds(169, 65, 56, 14);
		frame.getContentPane().add(S1GradeLB);
		
		final JLabel S1Grade = new JLabel("");
		S1Grade.setBounds(225, 65, 46, 14);
		frame.getContentPane().add(S1Grade);	
		
		JButton S1Btn = new JButton("Calculate S1 Grade");
		S1Btn.setBounds(10, 65, 149, 23);
		frame.getContentPane().add(S1Btn);
		S1Btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					int t1=Integer.parseInt(T1GradeTF.getText());
					int t2=Integer.parseInt(T2GradeTF.getText());
					int exam=Integer.parseInt(S1ExamTF.getText());
					if(t1<=100 && t2<=100 && t1>=0 && t2>=0 && exam<=100 && exam>=0)
					{
						int grade = (int)(Math.round((double)t1*0.425+(double)t2*0.425+(double)exam*.15));
						S1Grade.setText(""+grade);
						ErrorLB.setText("");
					}
					else
						ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
				}catch(Exception ex){
					
					ErrorLB.setText("Please fill all above blanks with integers.");
				}
				
			}
		});

		S2ExamTF = new JTextField();
		S2ExamTF.setColumns(10);
		S2ExamTF.setBounds(281, 101, 86, 20);
		frame.getContentPane().add(S2ExamTF);
		
		JLabel S2ExamLB = new JLabel("S2 Exam:");
		S2ExamLB.setBounds(225, 104, 56, 14);
		frame.getContentPane().add(S2ExamLB);
		
		T4GradeTF = new JTextField();
		T4GradeTF.setColumns(10);
		T4GradeTF.setBounds(179, 101, 46, 20);
		frame.getContentPane().add(T4GradeTF);
		
		JLabel T4GradeLB = new JLabel("T4 Grade:");
		T4GradeLB.setBounds(117, 104, 56, 14);
		frame.getContentPane().add(T4GradeLB);
		
		T3GradeTF = new JTextField();
		T3GradeTF.setColumns(10);
		T3GradeTF.setBounds(71, 101, 46, 20);
		frame.getContentPane().add(T3GradeTF);
		
		JLabel T3GradeLB = new JLabel("T3 Grade:");
		T3GradeLB.setBounds(10, 104, 56, 14);
		frame.getContentPane().add(T3GradeLB);
		
		JLabel S2GradeLB = new JLabel("S2 Grade:");
		S2GradeLB.setBounds(169, 132, 56, 14);
		frame.getContentPane().add(S2GradeLB);
		
		final JLabel S2Grade = new JLabel("");
		S2Grade.setBounds(225, 132, 46, 14);
		frame.getContentPane().add(S2Grade);	
		
		JButton S2Btn = new JButton("Calculate S2 Grade");
		S2Btn.setBounds(10, 129, 149, 23);
		frame.getContentPane().add(S2Btn);
		S2Btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					int t3=Integer.parseInt(T3GradeTF.getText());
					int t4=Integer.parseInt(T4GradeTF.getText());
					int exam=Integer.parseInt(S2ExamTF.getText());
					if(t3<=100 && t4<=100 && t3>=0 && t4>=0 && exam<=100 && exam>=0)
					{
						int grade = (int)(Math.round((double)t3*0.425+(double)t4*0.425+(double)exam*.15));
						S2Grade.setText(""+grade);
						ErrorLB.setText("");
					}
					else
						ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
				}catch(Exception ex){
					ErrorLB.setText("Please fill all above blanks with integers.");
				}
				
			}
		});
		
		JLabel FinalGradeLB = new JLabel("Final Grade:");
		FinalGradeLB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FinalGradeLB.setBounds(195, 170, 86, 36);
		frame.getContentPane().add(FinalGradeLB);
		
		final JLabel FinalGrade = new JLabel("");
		FinalGrade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		FinalGrade.setBounds(281, 170, 46, 36);
		frame.getContentPane().add(FinalGrade);
		
		JButton FinalGradeBtn = new JButton("Calculate Final Grade");
		FinalGradeBtn.setBounds(10, 170, 175, 36);
		frame.getContentPane().add(FinalGradeBtn);
		FinalGradeBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					int t1=Integer.parseInt(T1GradeTF.getText());
					int t2=Integer.parseInt(T2GradeTF.getText());
					int exam=Integer.parseInt(S1ExamTF.getText());
					int t3=Integer.parseInt(T3GradeTF.getText());
					int t4=Integer.parseInt(T4GradeTF.getText());
					int exam2=Integer.parseInt(S2ExamTF.getText());
					if(t1<=100 && t2<=100 && t1>=0 && t2>=0 && t3<=100 && t4<=100 && t3>=0 && t4>=0 && exam<=100 && exam2<=100)
					{
						int grade = (int)(Math.round((double)t1*0.425+(double)t2*0.425+(double)exam*.15));
						S1Grade.setText(""+grade);
						grade = (int)(Math.round((double)t3*0.425+(double)t4*0.425+(double)exam2*.15));
						S2Grade.setText(""+grade);
						int s1=Integer.parseInt(S1Grade.getText());
						int s2=Integer.parseInt(S2Grade.getText());
						grade = (int)(Math.round((double)s1*0.5+(double)s2*0.5));
						FinalGrade.setText(""+grade);
						ErrorLB.setText("");
					}
					else
						ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
				}catch(Exception ex){
					ErrorLB.setText("Please fill all above blanks with integers.");
				}
				
			}
		});
		
		JButton ClearBtn = new JButton("Clear");
		ClearBtn.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(ClearBtn);
		ClearBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				T1GradeTF.setText("");
				T2GradeTF.setText("");
				S1ExamTF.setText("");
				S1Grade.setText("");
				T3GradeTF.setText("");
				T4GradeTF.setText("");
				S2ExamTF.setText("");
				S2Grade.setText("");
				FinalGrade.setText("");
				
			}
		});
		
		JLabel S1TargetLB = new JLabel("Target Grade:");
		S1TargetLB.setBounds(370, 40, 86, 14);
		frame.getContentPane().add(S1TargetLB);
		
		final JComboBox S1List = new JComboBox(new String[]{"A","B","C","D"});
		S1List.setBounds(459, 37, 56, 20);
		frame.getContentPane().add(S1List);
		
		JButton S1ExamBtn = new JButton("Get Exam Grade");
		S1ExamBtn.setBounds(367, 68, 148, 23);
		frame.getContentPane().add(S1ExamBtn);
		S1ExamBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					if(S1List.getSelectedItem().equals("A"))
					{
						int t1=Integer.parseInt(T1GradeTF.getText());
						int t2=Integer.parseInt(T2GradeTF.getText());
						if(t1<=100 && t2<=100 && t1>=0 && t2>=0)
						{
							int exam=(int)(Math.ceil((89.5-(double)t1*0.425-(double)t2*0.425)/0.15));
							S1ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S1List.getSelectedItem().equals("B"))
					{
						int t1=Integer.parseInt(T1GradeTF.getText());
						int t2=Integer.parseInt(T2GradeTF.getText());
						if(t1<=100 && t2<=100 && t1>=0 && t2>=0)
						{
							int exam=(int)(Math.ceil((79.5-(double)t1*0.425-(double)t2*0.425)/0.15));
							S1ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S1List.getSelectedItem().equals("C"))
					{
						int t1=Integer.parseInt(T1GradeTF.getText());
						int t2=Integer.parseInt(T2GradeTF.getText());
						if(t1<=100 && t2<=100 && t1>=0 && t2>=0)
						{
							int exam=(int)(Math.ceil((74.5-(double)t1*0.425-(double)t2*0.425)/0.15));
							S1ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S1List.getSelectedItem().equals("D"))
					{
						int t1=Integer.parseInt(T1GradeTF.getText());
						int t2=Integer.parseInt(T2GradeTF.getText());
						if(t1<=100 && t2<=100 && t1>=0 && t2>=0)
						{
							int exam=(int)(Math.ceil((69.5-(double)t1*0.425-(double)t2*0.425)/0.15));
							S1ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
				}catch(Exception ex){
					ErrorLB.setText("Please fill all above blanks with integers.");
				}
				
			}
		});
		
		final JComboBox S2List = new JComboBox(new String[]{"A","B","C","D"});
		S2List.setBounds(462, 101, 56, 20);
		frame.getContentPane().add(S2List);
		
		JLabel S2TargetLB = new JLabel("Target Grade:");
		S2TargetLB.setBounds(373, 104, 86, 14);
		frame.getContentPane().add(S2TargetLB);
		
		JButton S2ExamBtn = new JButton("Get Exam Grade");
		S2ExamBtn.setBounds(370, 132, 148, 23);
		frame.getContentPane().add(S2ExamBtn);
		S2ExamBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					if(S2List.getSelectedItem().equals("A"))
					{
						int t3=Integer.parseInt(T3GradeTF.getText());
						int t4=Integer.parseInt(T4GradeTF.getText());
						if(t3<=100 && t4<=100 && t3>=0 && t4>=0)
						{
							int exam=(int)(Math.ceil((89.5-(double)t3*0.425-(double)t4*0.425)/0.15));
							S2ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S2List.getSelectedItem().equals("B"))
					{
						int t3=Integer.parseInt(T3GradeTF.getText());
						int t4=Integer.parseInt(T4GradeTF.getText());
						if(t3<=100 && t4<=100 && t3>=0 && t4>=0)
						{
							int exam=(int)(Math.ceil((79.5-(double)t3*0.425-(double)t4*0.425)/0.15));
							S2ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S2List.getSelectedItem().equals("C"))
					{
						int t3=Integer.parseInt(T3GradeTF.getText());
						int t4=Integer.parseInt(T4GradeTF.getText());
						if(t3<=100 && t4<=100 && t3>=0 && t4>=0)
						{
							int exam=(int)(Math.ceil((74.5-(double)t3*0.425-(double)t4*0.425)/0.15));
							S2ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
					else if(S2List.getSelectedItem().equals("D"))
					{
						int t3=Integer.parseInt(T3GradeTF.getText());
						int t4=Integer.parseInt(T4GradeTF.getText());
						if(t3<=100 && t4<=100 && t3>=0 && t4>=0)
						{
							int exam=(int)(Math.ceil((69.5-(double)t3*0.425-(double)t4*0.425)/0.15));
							S2ExamTF.setText(""+exam);
							ErrorLB.setText("");
						}
						else
							ErrorLB.setText("Please enter integers between 0 and 100 (inclusive).");
					}
				}catch(Exception ex){
					ErrorLB.setText("Please fill all above blanks with integers.");
				}
				
			}
		});
	}
}
