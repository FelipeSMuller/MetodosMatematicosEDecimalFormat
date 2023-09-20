package MetodosMatematicos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Desconto de Loja: Solicite ao usuário que insira o valor total de uma compra
		 * com casas decimais. Use Math.ceil para arredondar o valor total para cima e
		 * calcular o desconto com base no valor arredondado.
		 */

		double valorAtual = 0;

		do {

			try {
				valorAtual = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite o valor que você possui"));

				if (valorAtual < 0) {

					JOptionPane.showMessageDialog(null, "Não é possível inserir números negativos");

					break;

				} else if (valorAtual == 0) {

					JOptionPane.showMessageDialog(null,
							"0 não é aceito como um valor, não há como prosseguir a operação");
					break;
				}

				else {

					String Formatado;
					Double desconto = Math.ceil(valorAtual) - valorAtual;

					DecimalFormat formato = new DecimalFormat("0.00");

					Formatado = formato.format(desconto);

					JOptionPane.showMessageDialog(null, " Valor Atual  = " + valorAtual + " \n Valor arredondado ="
							+ Math.ceil(valorAtual) + " \n Desconto = " + Formatado);
				}

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Você não inseriu nenhum número, reinicie o processo \nERRO!");
				break;

			}

		}

		while (valorAtual != 0);
	}

}
