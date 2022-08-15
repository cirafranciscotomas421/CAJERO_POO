package ATM;
import javax.swing.JOptionPane;

public abstract class Plantilla {

		protected int transacciones, deposito, retiro;//variables tipo global se usa en todo nuestras clases
		private static int saldo = 0;// tipo local solo en la clase 

		public void Operaciones() {
			int opcion = 0;
			int bandera = 0;
			do {
				do {
					opcion = Integer.parseInt(JOptionPane
							.showInputDialog("Porfavor seleccione una opcion:" + "\n" + "[1].-Consulta saldo" + "\n"
									+ "[2].-Retirar efectivo" + "\n" + "[3].-Depositar efectivo" + "\n" + "[4].-Salir"

							));
					if (opcion >= 1 && opcion <= 4) {
						bandera = 1;
					} else {
						JOptionPane.showMessageDialog(null, "Opcion no encontrada");
					}
				} while (bandera == 0); //para que vuelva a retonar
				
				switch (opcion) { //se crea las opciones
				case 1: //consultar saldo
					Plantilla creando_consulta= new consultar_saldo();
					creando_consulta.Transacciones(); //sobreestructura de metodos (.transaciones) 
					break;
					
				case 2: //retirar
					Plantilla creando_retiro= new Retirar();
					creando_retiro.Transacciones();
					
					break;
					
				case 3://depositos
					Plantilla creando_deposito= new Depositos();
					creando_deposito.Transacciones();
					break;
					
				case 4://salir
					JOptionPane.showMessageDialog(null, "Vuelva pronto");
					bandera=2;
					break;

				}

			} while (bandera != 2);
		}

		public void Retiros() {
			retiro = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuanto desea retirar?: "));
		}
		
		public void Depositos() {
			deposito = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto desea depositar"));
		}
		
		public abstract void Transacciones();//es de tipo asbstract sig que se va sobreescribir

		public static int getSaldo() {
			return saldo;
		}

		public static void setSaldo(int saldo) {
			Plantilla.saldo = saldo;
		} 
		
}
