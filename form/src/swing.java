
import javax.swing.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class swing extends JFrame {
    JButton oke;
    JLabel judul,nama,nim,jk,agama,alamat;
    JTextField isiNama,isiNIM;
    JTextArea isiAlamat;
    JRadioButton rblk,rbpr;
    ButtonGroup G1;
    JComboBox cbagama;
    
    public void cobaSwing(){
        setTitle("DATA DIRI MAHASISWA");
        oke = new JButton("OK");
        
        judul = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        nim = new JLabel("NIM");
        jk = new JLabel("Jenis Kelamin");
        agama = new JLabel("Agama");
        alamat = new JLabel("Alamat");
        
        isiNama = new JTextField("");
        isiNIM = new JTextField("");
        isiAlamat = new JTextArea("");
        
        rblk = new JRadioButton();
        rbpr = new JRadioButton();
        
        G1 = new ButtonGroup();
        
        rblk.setText("Laki-laki"); 
        rbpr.setText("Perempuan"); 
        
        String s1[] = { "Islam", "Katholik", "Kristen", "Hindu", "Buddha" }; 
        cbagama = new JComboBox(s1); 
  
        //c1.addItemListener(s); 
        
        setLayout(null);
        add(judul);
        add(oke);
        add(nama);
        add(nim);
        add(jk);
        add(agama);
        add(alamat);
        add(isiNama);
        add(isiNIM);
        add(isiAlamat);
        add(rblk);
        add(rbpr);
        G1.add(rblk);
        G1.add(rbpr); 
        add(cbagama);
        
        judul.setBounds(170,20,200,20);
        nama.setBounds(70,60,100,20);
        isiNama.setBounds(160,60,250,20);
        nim.setBounds(70,100,100,20);
        isiNIM.setBounds(160,100,250,20);
        jk.setBounds(70,140,100,20);
        rblk.setBounds(160, 140, 100, 20); 
        rbpr.setBounds(300, 140, 100, 20); 
        agama.setBounds(70,180,100,20);
        cbagama.setBounds(160,180,250,20);
        alamat.setBounds(70,220,100,20);
        isiAlamat.setBounds(160,225,250,100);
        oke.setBounds(325,350,80,20);
    
        setSize(500,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}


