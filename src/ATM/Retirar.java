package ATM;
import javax.swing.JOptionPane;
public class Retirar extends Plantilla{

		@Override
		public void Transacciones() {
			// TODO Auto-generated method stub
			
			Retiros();
			if(retiro<= getSaldo()) {
				transacciones=getSaldo();
				setSaldo(transacciones-retiro);//operacion resta
				JOptionPane.showMessageDialog(null, "Cargo a tu cuenta: "+ retiro+"\n"+"Saldo actual es: "+getSaldo());//se suma
			}else {
				JOptionPane.showMessageDialog(null,"Saldo insuficiente. ");
			}
		}

}
