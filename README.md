# Solicitações de Viagem
O projeto Trip Request Manager é uma aplicação desenvolvida utilizando o framework Spring Boot com a finalidade de consumir dados em um servidor webservice e persistir os dados obtidos em um banco de dados.

# Ecossistema e Arquitetura
Ao acessar a página principal da aplicação através do navegador é feito uma requisição no servidor webservice a fim de obter as solicitações de viagem aprovadas nos últimos 3 meses, em seguida esses dados são convertidos em entidades relacionais e são enviados para uma fila de mensagens do serviço ActiveMQ, em seguida esses dados recebem um refinamento e são exibidos em um grid na tela.

Em paralelo existe um serviço que fica "escutando" a fila de mensagens do ActiveMQ, ao detectar que um novo registro foi recebido nesta fila o mesmo é preparado e persistido em um banco de dados MySQL.

## Tecnologias empregadas no projeto
Spring Boot e Spring Data 2.0
Apache Tomcat Embutido
Apache ActiveMQ 5.15.3
MySQL Server 5.7
Maven 3.5
Java 1.8
Log4j
JUnit

# Recursos necessários para rodar aplicação
Para executar a aplicação basta instalar em seu computador a versão do MySQL 5.x ou superior, Apache ActiveMQ 5.x e Java 1.8.

Antes de executar a aplicação pela primeira vez é preciso importar a base de dados triprequestmanager no MySQL Server, o arquivo triprequestmanager.sql está dentro da pasta da aplicação em src/main/resources/database.

Você pode realizar a importação da base de dados por linha de comando:

C:\DIRETORIO_DE_INSTALACAO\bin\mysql.exe -u {username} -p {databasename} < triprequestmanager.sql

Se preferir pode fazer o download do utilitário MySQL Workbench:

https://dev.mysql.com/downloads/workbench/

Obs: Você precisará de um cadastro no site dev.mysql.com para realizar o download.

Com o MySQL Workbench instalado basta abrir o aplicativo da Oracle, conectar no MySQL Server local, ir no menu Server > Data Import, escolha a opção 'Import Self-Contained File', selecione o arquivo triprequestmanager.sql em seu computador, em 'Default Target Schema' clique no botão New e informe o nome do banco de dados:'triprequestmanager', em seguida clique em 'Start import'.

Dentro do diretório src/main/resources da aplicação existe um arquivo chamado application.properties, você precisará editar os parâmetros citados abaixo entre colchetes:

spring.datasource.url=jdbc:mysql://[ENDERECO_SERVIDOR]:3306/triprequestmanager?useSSL=false
spring.datasource.username=[USUARIO_MYSQL]
spring.datasource.password=[SENHA_MYSQL]

Por último precisará instalar o Apache ActiveMQ, não é preciso mudar nada na aplicação pois ela já utiliza os dados de autenticação padrão do serviço.

Assim que os passos acima forem realizados basta acessar a pasta target da aplicação e executar via linha de comando no prompt do Windows:

java -jar triprequestmanager-1.0.javascript

A aplicação será iniciada automaticamente, assim que ela finalizar o carregamento você pode acessá-la através da seguinte url:

http://localhost:9000/trmanager/main
