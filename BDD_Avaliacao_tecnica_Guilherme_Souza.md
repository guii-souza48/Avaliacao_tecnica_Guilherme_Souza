# Avaliacao_tecnica_Guilherme_Souza
Cenário - Menu Contato 
Dado que o usuário acessa o site verity.com.br 
Quando seleciona no menu a opção "Contato"
Então apresenta as alternativas, para realizar o contato

Cenário - Sessão "Vamos conversar"
Dado que o usuário acessa o site verity.com.br
Quando seleciona no menu a opção "Contato"
E inclinar-se a barra de rolagem, até a opção "Vamos conversar"
Então, o mesmo apresenta os requisitos para o seu preenchimento

Cenário - Sessão "Vamos conversar" - Preechimento 
Dado que o usuário acessa o site verity.com.br
Quando seleciona no menu a opção "Contato"
E inclinar-se a barra de rolagem, até a opção "Vamos conversar"
Então preenche os requisitos "Nome/E-mail/Telefone-Celular/Nos conte o seu desafio/“Aceito receber mensagens da Verity”;

Cenário - Sessão "Vamos conversar" - Botão "Enviar"
Dado que o usuário acessa o site verity.com.br
Quando seleciona no menu a opção "Contato"
E inclinar-se a barra de rolagem, até a opção "Vamos conversar"
E preenche os requisitos "Nome/E-mail/Telefone-Celular/Nos conte o seu desafio/“Aceito receber mensagens da Verity”
Então, ao preecher os requisitos solicitados e selecionar o botão "Enviar", o mesmo deve apresentar a mensagem "Obrigado"

Cenário - Validação de campos - Vamos conversar
Dado que o usuário acessa o site verity.com.br
Quando seleciona no menu a opção "Contato"
E inclinar-se a barra de rolagem, até a opção "Vamos conversar"
E preencher os campos "Nome,Email,Telefone,Nos conte o seu desafio, de forma incorreta 
Então, o mesmo deve apresentar a mensagem "Inserir de forma válida"

Cenário - Validação - Checkbox “Aceito receber mensagens da Verity”; 
Dado que o usuário acessa o site verity.com.br
Quando seleciona no menu a opção "Contato"
E inclinar-se a barra de rolagem, até a opção "Vamos conversar"
E preenche os requisitos "Nome/E-mail/Telefone-Celular/Nos conte o seu desafio
E não selecionar o Checkbox “Aceito receber mensagens da Verity”
Então, o mesmo deve apresentar a mensagem "Marque essa caixa se deseja continuar"

Cenário - Validação - Elementos "Culture e Tech/Nossas soluções_" 
Dado que o usuário acessa o site verity.com.br
Quando realiza a validação dos elementos "Culture e Tech/Nossas soluções_"
Então, o mesmo deve apresentar reportar a mensagem "O texto pesquisado existe/ O texte pesquisado não existe"
