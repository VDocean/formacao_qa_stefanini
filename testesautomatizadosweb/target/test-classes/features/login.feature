#language: pt
#encoding: UTF-8
@login
Funcionalidade: Login

  Cenario: usuario invalido
    Quando eu informar o usuario "ad"
    E a senha "asd"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario invalido

  @loginSucesso
  Cenario: realizar login
    Quando eu informar o usuario "Admin"
    E a senha "admin123"
    E clicar no botao login
    Entao o sistema exibe a mensagem de usuario logado
