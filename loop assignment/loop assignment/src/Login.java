//  import java.util.Random;
//  public class App {
// public static void main(String[] args) throws Exception {
//     Random random=new Random();
//      int number1=random.nextInt(2) ;
//    int number2=random.nextInt(2);
//      int number3=random.nextInt(3) ;{
//      System.out.println("Random numbers:"+number1 + ""+number2 + "" + number3);}

//     if(number1==1 || number2==5 || number3==7){
//    System.out.println("You won"); }
//     else{
//      System.out.println("You lost"); }

//   int balance=5;
//        balance-=1;
//     if(number1==7|| number2==7|| number3==7){    
    
//      balance+=3;
//       }
//       if(number1==7 && number2==7&& number3==7){
//       balance+=10;
//   }
//       if(number1==7 && number2==7 || number1==7 && number3==7 || number2==7 && number3==7){
//       balance+=5;
//       }       if(balance<=0){
//       System.out.println("game end");}
      
// }}


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class Login extends JFrame {
//     private JTextField usernameField;
//     private JPasswordField passwordField;

//     public Login() {
//         setTitle("Login");
//         setSize(300, 150);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(3, 2));

//         JLabel usernameLabel = new JLabel("Username:");
//         usernameField = new JTextField();
//         JLabel passwordLabel = new JLabel("Password:");
//         passwordField = new JPasswordField();
//         JButton loginButton = new JButton("Login");

//         loginButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String username = usernameField.getText();
//                 String password = new String(passwordField.getPassword());
//                 JOptionPane.showMessageDialog(null, "Username: " + username + "\nPassword: " + password);
//             }
//         });

//         add(usernameLabel);
//         add(usernameField);
//         add(passwordLabel);
//         add(passwordField);
//         add(new JLabel());
//         add(loginButton);

//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         new Login();
//
import javax.swing.*;

public class Login extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField domainField;

    public Login() {
        setTitle("User Information");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        JLabel domainLabel = new JLabel("Domain:");
        domainField = new JTextField();
        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(e -> {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String domain = domainField.getText();

            if (firstName.isEmpty() || lastName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error! First and/or last name is missing");
                System.exit(0);
            }

            String email = generateEmail(firstName, lastName, domain);
            String username = generateUsername(firstName, lastName);
            JOptionPane.showMessageDialog(null, "Generated Email: " + email + "\nGenerated Username: " + username);
        });

        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(domainLabel);
        add(domainField);
        add(new JLabel());
        add(submitButton);

        setVisible(true);
    }

    public String generateEmail(String firstName, String lastName, String domain) {
        return (firstName + "." + lastName + "@" + domain).toLowerCase();
    }

    public String generateUsername(String firstName, String lastName) {
        return (firstName.substring(0, 4) + lastName.substring(lastName.length() - 4)).toLowerCase();
    }

    public static void main(String[] args) {
        new Login();
    }
}
