
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class B {
	public static void main(String arg[]) throws Exception {
		new B();
	}
	JComboBox2 combo = new JComboBox2();
	JTextField tf = new JTextField(5);
	public B() throws Exception {
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
		tela.setSize(300, 300);
		combo.addItem("Fusca");
		combo.addItem("Palio");
		combo.addItem("Civic");
		combo.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				B.this.tf.setText(B.this.combo.getSelectedItem().toString());
			}

                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
		});
		tela.setLayout(new FlowLayout());
		tela.add(combo);
		tela.add(tf);
		tela.setVisible(true);
	}
}