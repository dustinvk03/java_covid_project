
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CovidInfoGUI extends JFrame{
    private JLabel lblRequest;    //show "Enter the input length (km): "
    private JComboBox cbbRequest; //text box to input the length 
    private JLabel lblRegion; //show the text "Choose the units to convert"
    private JComboBox cbbRegion; //combo box to select the unit 
    private JButton btnExecute; //button to perform convert
    private JTextArea txtResult; //text box to show the converting result

    /* the constructor method */
    public CovidInfoGUI ( ) {
        //using setTitle with set the title "Length Converter Program by <YourName>"
        //Note: Replace <YourName> with your real name
    	
    	setTitle("Covid Info System");
    	
        //set the default close operation with EXIT_ON_CLOSE 
    	
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
        //set the size (300, 240) of the form
    	
    	setSize(350, 250);
    	
        //set the layout FlowLayout
    	
    	setLayout(new FlowLayout());
    	
        
        //initialize the GUI components
        //init the label lblLength with text "Enter the length (km): "
    	
    	lblRequest = new JLabel("Select your request");
    	
        //init the textbox txtLength with 10 columns
    	
    	
    	
    	 String[] requests = new String[] {"Retrieve", "Modify"};
         //create the combobox for user to select the target unit
         cbbRequest = new JComboBox(requests);
    	
    	
        //init the label lblDestUnit with text "Select the target unit:"
    	
    	lblRegion = new JLabel("Select the target regions:");
    	
    	   	
    	
        //Create the string arrays of units
        String[] regions = new String[] {"World", "USA", "WSU"};
        //create the combobox for user to select the target unit
        cbbRegion = new JComboBox(regions);
        //init the button btnConvert with the text "Convert"
        
        btnExecute = new JButton("Do!");
        
        //init the text area with 5 rows, 20 columns
        
        txtResult = new JTextArea(5, 20);
                
        //add those components to the form
        add(lblRequest);
        add(cbbRequest);
        add(lblRegion);
        add(cbbRegion);
        add(btnExecute);
        add(txtResult);
        
        //make the form visible
        setVisible(true);
        //register event handler of "Report" button
//        
//        btnConvert.addActionListener(this);
        
    }

    /* the main method */
    public static void main ( String args [] ) {
        new CovidInfoGUI();
    }

    /* handle user click events */
  
}
        	
  