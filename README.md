# Projeto Java da Agenda

Este é um projeto Java simples para gerenciar uma agenda de contatos. Antes de executar este projeto, siga as etapas abaixo para configurar o banco de dados.

## Configurando o Banco de Dados

Antes de executar o projeto, você deve criar o banco de dados e a tabela necessários. O script SQL para isso está disponível no arquivo `script_banco_de_dados.sql`. Siga estas etapas para configurar o banco de dados:

1. Certifique-se de ter um servidor MySQL instalado e em execução em sua máquina local ou em outro host acessível.

2. Use um cliente MySQL, como o MySQL Workbench, ou execute o seguinte comando no terminal para criar o banco de dados e a tabela:

   ```sql
   mysql -u seu_usuario -p < script_banco_de_dados.sql
