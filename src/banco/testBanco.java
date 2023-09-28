package banco;

public class testBanco {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joao", 2520, "joaozinho", "joaozinho123");
		gerente.infoBasica();
		gerente.infoGerente();
		System.out.println();
		
		Secretaria secretaria = new Secretaria("Maria", 1620, 37283864);
		secretaria.infoBasica();
		secretaria.infoSecretaria();
		System.out.println();
		
		Telefonista telefonista = new Telefonista("Bianca", 1540, 6647);
		telefonista.infoBasica();
		telefonista.infoTelefonista();
	}

}
