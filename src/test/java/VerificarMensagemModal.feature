Feature: Cancelar a minha Conta SuperGet
	Como um usuário
	Eu quero cancelar a minha Conta SuperGet
	

  Scenario: Verificar modal
  
  Given que eu estou acessando a aplicacao
  When Eu preencho o campo de busca com "superget"
  And Clico em procurar
  Then O sistema retorna uma lista de perguntas ao usuario
  When eu clico no link "Como cancelar a minha Conta SuperGet?"
  Then uma moda vai ser aberta com a mensagem "Como cancelar a minha Conta SuperGet?"
