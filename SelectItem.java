//Procurando e selecionando um elemento de uma combo
public static void selecionarItemDaCombo(WebElement elemSelecao, String opcaoDesejada){
		int posicaoOpcaoNaLista = 0; 
		int contador = 0;
		
		List<WebElement> opcoes = elemSelecao.findElements(By.tagName("option"));
		for (WebElement opcao : opcoes) {
			if(opcaoDesejada.equals(opcao.getText())){
				posicaoOpcaoNaLista = contador;
				break;
			}
			contador++;
		}
		
		Select selecao = new Select(elemSelecao);
                selecao.selectByIndex(posicaoOpcaoNaLista);
	}
